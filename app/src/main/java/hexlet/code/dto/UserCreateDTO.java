package hexlet.code.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserCreateDTO {

    private String firstName;
    private String lastName;

    @Email
    private String email;

    @Size(min = 3, max = 100)
    private String password;
}
