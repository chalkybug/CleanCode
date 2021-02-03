package coursemanagement.sort;

import coursemanagement.entity.Course;
import coursemanagement.enums.SortMode;
import coursemanagement.sort.strategies.SortCourseByNameStrategy;
import coursemanagement.sort.strategies.SortCourseByOpenedStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {
    public void sort(List<Course> courses, String sortBy) {
        SortingStrategy sortingStrategy;
        if (SortMode.NAME.toString().equals(sortBy.toUpperCase())) {
            sortingStrategy = new SortCourseByNameStrategy();
        } else if (SortMode.OPENED.toString().equals(sortBy.toUpperCase())) {
            sortingStrategy = new SortCourseByOpenedStrategy();
        } else {
            throw new UnsupportedOperationException("Unsupported sort mode");
        }
        sortingStrategy.sort(courses);
    }
}
