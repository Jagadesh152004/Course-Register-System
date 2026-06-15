package course.course_registration_system.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Course {

    @Id
    private String courseID;
    private String courseName;
    private String trainer;
    private int durationTime;


}
