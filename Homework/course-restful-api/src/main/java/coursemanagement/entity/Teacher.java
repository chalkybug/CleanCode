package coursemanagement.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Data
@Table(name = "teachers")
public class Teacher extends User {

    private String phone;

    private int experiences;

    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;

}
