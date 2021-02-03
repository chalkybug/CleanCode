package coursemanagement.sort.strategies;

import coursemanagement.entity.Course;
import coursemanagement.sort.SortingStrategy;

import java.util.Comparator;
import java.util.List;

public class SortCourseByOpenedStrategy implements SortingStrategy {
    @Override
    public void sort(List<Course> courses) {
        courses.sort(Comparator.comparing(Course::getOpened, Comparator.reverseOrder()));
    }
}
