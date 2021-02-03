package coursemanagement.dto;

import coursemanagement.entity.Student;
import coursemanagement.entity.Teacher;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
public class CourseDto {

    @ApiModelProperty(value = "Course ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "Course name", example = "Clean Code")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "Course description", example = "description")
    private String description;

    @NotBlank
    @ApiModelProperty(value = "Course location", example = "HN")
    private String location;

    @NotBlank
    @ApiModelProperty(value = "Course time opened", example = "20201212")
    private Date opened;

    @ApiModelProperty(value = "List student", example = "Mr-a")
    private List<Student> students = new ArrayList<>();

    @ApiModelProperty(value = "Teacher of Course", example = "Mr-b")
    private Teacher teacher;

}
