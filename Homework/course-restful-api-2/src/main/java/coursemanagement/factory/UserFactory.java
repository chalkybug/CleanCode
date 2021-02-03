package coursemanagement.factory;

import coursemanagement.dto.UserReqDto;
import coursemanagement.entity.Student;
import coursemanagement.entity.Teacher;
import coursemanagement.entity.User;
import coursemanagement.enums.RegisterMode;
import org.springframework.stereotype.Component;

@Component
public class UserFactory {

    public User createUser(UserReqDto dto) {

        if (RegisterMode.STUDENT.toString().equals(dto.getMode())) {
            return createStudent(dto);
        } else if (RegisterMode.TEACHER.toString().equals(dto.getMode())) {
            return createTeacher(dto);
        } else {
            throw new UnsupportedOperationException("Unsupported register mode");
        }
    }

    private User createStudent(UserReqDto dto) {
        Student student = new Student();
        map(student, dto);
        student.setYear(dto.getStudent().getYear());
        return student;
    }

    private User createTeacher(UserReqDto dto) {
        Teacher teacher = new Teacher();
        map(teacher, dto);
        teacher.setPhone(dto.getTeacher().getPhone());
        teacher.setExperiences(dto.getTeacher().getExperiences());
        return teacher;
    }

    private void map(User userInfo, UserReqDto dto) {
        userInfo.setEmail(dto.getEmail());
        userInfo.setName(dto.getName());
        userInfo.setPassword(dto.getPassword());

    }

}
