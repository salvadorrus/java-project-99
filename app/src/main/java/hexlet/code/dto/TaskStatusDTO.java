package hexlet.code.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class TaskStatusDTO {
    private Long id;
    private String name;
    private String slug;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate createdAt;
}
