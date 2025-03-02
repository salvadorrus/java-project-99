package hexlet.code.dto.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.openapitools.jackson.nullable.JsonNullable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateDTO {

    private JsonNullable<String> firstName;
    private JsonNullable<String> lastName;

    @Email
    @NotBlank
    private JsonNullable<String> email;

    @Size(min = 3)
    @NotBlank
    private JsonNullable<String> password;
}
