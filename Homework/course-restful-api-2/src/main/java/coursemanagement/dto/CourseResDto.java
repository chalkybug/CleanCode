package coursemanagement.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CourseResDto {

    @ApiModelProperty(value = "Course ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "Course name", example = "Clean Code")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "Course location", example = "HN")
    private String location;


    @ApiModelProperty(value = "Teacher of Course", example = "MrA")
    private String teacherName;

}
