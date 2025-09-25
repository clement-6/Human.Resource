package management.human.resource.dto.employee;

import management.human.resource.enums.EmployeeStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import management.human.resource.dto.job.JobResponse;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse extends EmployeeUpdateDto{

    private String employeeKey;
    private String matricule;
    private JobResponse jobResponse;
    private EmployeeStatus status;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd.MM.yyyy HH:mm:ss")
    private LocalDateTime createdDate;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd.MM.yyyy HH:mm:ss")
    private LocalDateTime lastModifiedDate;
}
