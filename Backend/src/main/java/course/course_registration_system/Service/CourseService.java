package course.course_registration_system.Service;

import course.course_registration_system.Model.Course;
import course.course_registration_system.Model.CourseRegistry;
import course.course_registration_system.Repository.CourseRepository;
import course.course_registration_system.Repository.RegistryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CourseService {

    private final CourseRepository repo;

    private final RegistryRepository registryRepository;

    public List<Course> getAvailableCourse() {
        return repo.findAll();
    }

    public List<CourseRegistry> getEnrolledCourse() {
        return registryRepository.findAll();
    }

    public void addEnrolled(String name, String emailID, String courseName) {
        CourseRegistry registry = new CourseRegistry(name,emailID,courseName);
        registryRepository.save(registry);
    }
}
