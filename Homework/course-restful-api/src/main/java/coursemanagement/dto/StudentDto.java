package coursemanagement.dto;

import coursemanagement.entity.Course;
import coursemanagement.entity.Student;
import coursemanagement.entity.Teacher;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class StudentDto {

    @NotNull
    @ApiModelProperty(value = "Student year", example = "3")
    private int year;

    @ApiModelProperty(value = "List course of student", example = "Clean code")
    private List<Course> courses = new ArrayList<>();

}
