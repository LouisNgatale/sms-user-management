package i.louis.sms_management_service.Employee.Repository;


import i.louis.sms_management_service.Employee.EmployeeModel;
import i.louis.sms_management_service.Employee.Entity.Employee;
import i.louis.sms_management_service.Employee.Service.EmployeeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Optional<Employee> findByEmail(String email);
}
