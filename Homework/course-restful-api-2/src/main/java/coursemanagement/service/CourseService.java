package coursemanagement.service;

import coursemanagement.dto.CourseResDto;
import coursemanagement.entity.Course;
import coursemanagement.error.ServiceRuntimeException;
import coursemanagement.repository.CourseRepository;
import coursemanagement.sort.SortService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;
    private final SortService sortService;


    @Cacheable(value = "courses")
    @Transactional(readOnly = true)
    public List<CourseResDto> getCourses(String keyword, String sortBy) throws ServiceRuntimeException {
        List<Course> courses;
        // if filter name
        if (!Objects.isNull(keyword)) {
            courses = courseRepository.findByNameLike("%"+keyword+"%");
        } else {
            courses = courseRepository.findAll();
        }
        // if sort
        if (!Objects.isNull(sortBy)) {
            sortService.sort(courses, sortBy);
        }

        return courses
                .stream()
                .map(course -> modelMapper.map(course, CourseResDto.class))
                .collect(Collectors.toList());

    }


}
