package management.human.resource.repository;

import management.human.resource.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    Optional<Employee> findEmployeeByEmployeeKey(String employeeKey);

    List<Employee> getEmployeeByJobJobKey(String jobKey);
}
