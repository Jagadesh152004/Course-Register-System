package course.course_registration_system.Controller;
import course.course_registration_system.Model.Course;
import course.course_registration_system.Model.CourseRegistry;
import course.course_registration_system.Service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@RequiredArgsConstructor
@CrossOrigin(origins = "https://course-register-system.vercel.app")
@RestController
public class CourseController {
    private final CourseService service ;

    public CourseController(CourseService service){
        this.service = service;
    }

    @GetMapping("/courses")
    public List<Course> availableCourse(){
        return service.getAvailableCourse();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> enrolledCourse(){
        return service.getEnrolledCourse();
    }

    @PostMapping("/courses/register")
    public String enrolling(@RequestParam("name") String name,
                            @RequestParam("emailID") String emailID,
                            @RequestParam("courseName") String courseName)
    {
        service.addEnrolled(name,emailID,courseName);
        return "Congratulation " + name + " is Enrolled Successfully " + courseName;
    }
}
