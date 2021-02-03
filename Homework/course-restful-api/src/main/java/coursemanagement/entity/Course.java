package coursemanagement.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private String location;

    private Date opened;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;

    @ManyToOne()
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
