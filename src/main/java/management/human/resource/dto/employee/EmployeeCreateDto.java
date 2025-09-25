package management.human.resource.dto.employee;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCreateDto {

    @NotBlank
    private String employeeName;

    @NotBlank
    private String email;

    private String phone;

    @NotNull
    private Date birthDate;
}
