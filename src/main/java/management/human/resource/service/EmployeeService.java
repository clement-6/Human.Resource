package management.human.resource.service;


import management.human.resource.dto.employee.EmployeeCreateDto;
import management.human.resource.dto.employee.EmployeeResponse;
import management.human.resource.dto.employee.EmployeeUpdateDto;
import management.human.resource.entity.Employee;

import java.util.List;

public interface EmployeeService {

  Employee getInternalEmployee(String employeeKey);

  EmployeeResponse addEmployee(EmployeeCreateDto dto, String jobKey);

  EmployeeResponse updateEmployee(EmployeeUpdateDto dto, String key);

  List<EmployeeResponse> getAllEmployee(String jobKey);

  EmployeeResponse getEmployee(String key);

}
