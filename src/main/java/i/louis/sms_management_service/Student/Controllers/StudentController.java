package i.louis.sms_management_service.Student.Controllers;

import i.louis.sms_management_service.Employee.Entity.Employee;
import i.louis.sms_management_service.Student.Entities.Student;
import i.louis.sms_management_service.Student.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/management/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public Student registerStudent(@RequestBody Student student) {
        try {
            studentService.registerStudent(student);
            return student;
        } catch (Exception e) {
            System.out.println(e);
            return student;
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{student_id}")
    public Optional<Student> getEmployee(@PathVariable Integer student_id) {
        return studentService.getStudent(student_id);
    }
}

