package course.course_registration_system.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class CourseRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // no need to provide id value

    private String name;
    private String emailID;
    private String courseName;

    public CourseRegistry(String name, String emailID, String courseName) {
        this.courseName = courseName;
        this.emailID = emailID;
        this.name = name;
    }

}
