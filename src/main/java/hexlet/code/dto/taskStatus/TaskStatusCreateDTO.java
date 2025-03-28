package hexlet.code.dto.taskStatus;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class TaskStatusCreateDTO {

    @Size(min = 1)
    private String name;

    @Size(min = 1)
    private String slug;
}
