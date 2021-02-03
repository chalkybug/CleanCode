package coursemanagement.dto;

import coursemanagement.entity.Course;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
public class TeacherDto {

    @NotBlank
    @ApiModelProperty(value = "Teacher phone", example = "0961023495")
    private String phone;

    @NotNull
    @ApiModelProperty(value = "Teacher year", example = "3")
    private int experiences;


}
