package coursemanagement.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class UserReqDto {

    @ApiModelProperty(value = "User ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "User name", example = "bob")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "User email", example = "abc@gmail.com")
    private String email;

    @NotBlank
    @ApiModelProperty(value = "User password", example = "123456")
    private String password;

    @NotBlank
    @ApiModelProperty(value = "User Model", example = "STUDENT")
    private String mode;

    @ApiModelProperty(value = "teacher info", example = "\"phone\": \"0987654321\",\n" + " \"experiences\": 5")
    private TeacherDto teacher;

    @ApiModelProperty(value = "student info", example = "\"year\": 2020")
    private StudentDto student;

}
