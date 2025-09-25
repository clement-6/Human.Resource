package management.human.resource.service.impl;

import lombok.RequiredArgsConstructor;
import management.human.resource.dto.employee.EmployeeCreateDto;
import management.human.resource.dto.employee.EmployeeResponse;
import management.human.resource.dto.employee.EmployeeUpdateDto;
import management.human.resource.entity.Employee;
import management.human.resource.entity.Job;
import management.human.resource.exception.ExceptionsMessages;
import management.human.resource.exception.ResourceNotFoundException;
import management.human.resource.mappers.EmployeeMappers;
import management.human.resource.repository.EmployeeRepo;
import management.human.resource.service.EmployeeService;
import management.human.resource.service.JobService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final EmployeeMappers employeeMappers;
    private final JobService jobService;

    public Employee getInternalEmployee(String employeeKey) {
        return employeeRepo.findEmployeeByEmployeeKey(employeeKey).orElseThrow(() -> new ResourceNotFoundException(ExceptionsMessages.M_RESOURCE_NOT_FOUND,"Employee with key not found"));
    }

    @Override
    public EmployeeResponse addEmployee(EmployeeCreateDto dto, String jobKey) {
        Employee employee = employeeMappers.mapToEntity(dto);
        Job job = jobService.getInternalJob(jobKey);
        employee.setJob(job);
        return employeeMappers.mapToResponse(employeeRepo.save(employee));
    }

    @Override
    public EmployeeResponse updateEmployee(EmployeeUpdateDto dto, String key) {
        Employee employee = getInternalEmployee(key);
        employee = employeeMappers.mapToUpdate(dto, employee);
        return employeeMappers.mapToResponse(employeeRepo.save(employee));
    }

    @Override
    public List<EmployeeResponse> getAllEmployee(String jobKey) {
         if (StringUtils.isNotBlank(jobKey)){
             return employeeRepo.getEmployeeByJobJobKey(jobKey).stream().map(employeeMappers::mapToResponse).toList();
         }else {
             return employeeRepo.findAll().stream().map(employeeMappers::mapToResponse).toList();
         }
    }

    @Override
    public EmployeeResponse getEmployee(String key) {
        return employeeMappers.mapToResponse(getInternalEmployee(key));
    }
}
