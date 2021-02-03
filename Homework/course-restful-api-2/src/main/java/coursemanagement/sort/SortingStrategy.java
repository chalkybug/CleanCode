package coursemanagement.sort;

import coursemanagement.entity.Course;

import java.util.List;

public interface SortingStrategy {
    void sort(List<Course> courses);
}
