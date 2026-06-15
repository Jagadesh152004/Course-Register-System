package course.course_registration_system.Repository;

import course.course_registration_system.Model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistryRepository extends JpaRepository<CourseRegistry,Integer> {
}
