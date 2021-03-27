package i.louis.sms_management_service.Student.Services;

import i.louis.sms_management_service.Employee.Entity.Employee;
import i.louis.sms_management_service.Student.Entities.Student;
import i.louis.sms_management_service.Student.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }

    public Optional<Student> getStudent(Integer student_id) {
        return studentRepository.findById(student_id);
    }
}
