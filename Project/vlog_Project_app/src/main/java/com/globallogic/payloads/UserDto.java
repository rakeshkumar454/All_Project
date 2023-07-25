package com.globallogic.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
    private int userId;
    @NotEmpty
    @Size(min = 5, message = "User name must be min of 4 characters")
    private String name;
    @Email(message = "Email is not valid!")
    @NotEmpty(message = "Email should be not empty")
    private String email;
    @NotEmpty
    @Size(min = 5,max = 15, message ="Password must be 5 to 15 characters!!")
//    @Pattern(regexp = )
    private  String password;
    @NotEmpty(message = "About must be not empty")
    @NotNull
    private String about;
}
