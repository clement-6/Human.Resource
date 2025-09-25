package management.human.resource.dto.job;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobUpdateDto extends JobCreateDto{

    private long id;
    @NotNull
    private long version;
}
