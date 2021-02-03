package coursemanagement.controller;

import coursemanagement.dto.CourseResDto;
import coursemanagement.service.CourseService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/api/v1/courses")
    @ApiOperation("Get courses")
    @ApiResponses({@ApiResponse(code = 200, message = "Get courses successfully")})
    public ResponseEntity<List<CourseResDto>> getCourses(@RequestParam(required = false) String keyword,
                                                         String sortBy) {

        List<CourseResDto> response = courseService.getCourses(keyword, sortBy);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}