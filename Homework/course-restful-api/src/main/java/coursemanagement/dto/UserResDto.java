package coursemanagement.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class UserResDto {

    @NotBlank
    @ApiModelProperty(value = "User name", example = "bob")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "User email", example = "abc@gmail.com")
    private String email;

}
