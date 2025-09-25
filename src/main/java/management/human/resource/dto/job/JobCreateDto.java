package management.human.resource.dto.job;


import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobCreateDto {

    @NotBlank(message = "${job.title.notBlank}")
    private String title;


    private String description;
}
