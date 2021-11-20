package com.example.demo.parameter;

import org.springframework.boot.context.properties.ConstructorBinding;
import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@ConstructorBinding
@Getter
@Setter
public class LoginRequestParameter {
    // @NotBlank
    private Integer loginId;
    // @NotBlank
    private String password;
}
