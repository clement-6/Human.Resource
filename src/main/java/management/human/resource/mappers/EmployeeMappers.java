package management.human.resource.mappers;


import management.human.resource.dto.employee.EmployeeCreateDto;
import management.human.resource.dto.employee.EmployeeResponse;
import management.human.resource.dto.employee.EmployeeUpdateDto;
import management.human.resource.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EmployeeMappers {

    Employee mapToEntity(EmployeeCreateDto employeeCreateDto);

    EmployeeResponse mapToResponse(Employee employee);

    Employee mapToUpdate(EmployeeUpdateDto employeeUpdateDto, @MappingTarget Employee employee);
}
