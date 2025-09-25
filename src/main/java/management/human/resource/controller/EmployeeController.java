package management.human.resource.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import management.human.resource.dto.employee.EmployeeCreateDto;
import management.human.resource.dto.employee.EmployeeResponse;
import management.human.resource.dto.employee.EmployeeUpdateDto;
import management.human.resource.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static management.human.resource.ApiConstant.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(API_ROOT_SERVICE)
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping(EMPLOYEE + JOB_KEY)
    public ResponseEntity<EmployeeResponse> addEmployee(@Valid @RequestBody EmployeeCreateDto dto, @PathVariable String jobKey ) {
        return new ResponseEntity<>(employeeService.addEmployee(dto,jobKey), HttpStatus.CREATED);
    }

    @PutMapping(EMPLOYEE_KEY)
    public ResponseEntity<EmployeeResponse> updateEmployee(@Valid @RequestBody EmployeeUpdateDto dto, @PathVariable String employeeKey) {
        return new ResponseEntity<>(employeeService.updateEmployee(dto, employeeKey), HttpStatus.CREATED);
    }

    @GetMapping(EMPLOYEE_KEY)
    public ResponseEntity<EmployeeResponse> getEmployee(@PathVariable String employeeKey) {
        return new ResponseEntity<>(employeeService.getEmployee(employeeKey), HttpStatus.CREATED);
    }

    @GetMapping(EMPLOYEE + JOB)
    public ResponseEntity<List<EmployeeResponse>> getAllEmployees(@RequestParam(value = "jobKey", required = false) String jobKey) {
        return new ResponseEntity<>(employeeService.getAllEmployee(jobKey), HttpStatus.CREATED);
    }



}
