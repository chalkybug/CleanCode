package coursemanagement.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "students")
public class Student extends User {

    private int year;

    @ManyToMany
    @JoinTable(
            name = "enroll",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;
}
