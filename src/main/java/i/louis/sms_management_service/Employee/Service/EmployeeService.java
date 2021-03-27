package i.louis.sms_management_service.Employee.Service;

import i.louis.sms_management_service.Employee.EmployeeModel;
import i.louis.sms_management_service.Employee.Entity.Employee;
import i.louis.sms_management_service.Employee.Entity.Role;
import i.louis.sms_management_service.Employee.Repository.EmployeeRepository;
import i.louis.sms_management_service.Employee.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RoleRepository roleRepository;

    public void registerEmployee(EmployeeModel model) {
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(model.getFirstName());
        newEmployee.setSecondName(model.getSecondName());
        newEmployee.setAge(model.getAge());
        newEmployee.setEmail(model.getEmail());
        newEmployee.setGender(model.getGender());
        newEmployee.setPassword(model.getPassword());
        newEmployee.setStatus(model.isStatus());

        List<Role> role = new ArrayList<>();
        for (Integer id : model.getRoleId()) {
            role.add(roleRepository.findRolesById(id));
        }

        newEmployee.setRoles(role);

        employeeRepository.save(newEmployee);
    }

    public Optional<Employee> getEmployee(Integer employee_id) {
        return employeeRepository.findById(employee_id);
    }

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee editEmployee(Integer employee_id, EmployeeModel model) {
        Optional<Employee> employee = employeeRepository.findById(employee_id);

        if (employee.isPresent()) {

            Employee newEmployee = new Employee();
            newEmployee.setId(employee_id);
            newEmployee.setFirstName(model.getFirstName());
            newEmployee.setSecondName(model.getSecondName());
            newEmployee.setAge(model.getAge());
            newEmployee.setEmail(model.getEmail());
            newEmployee.setGender(model.getGender());
            newEmployee.setPassword(model.getPassword());
            newEmployee.setStatus(model.isStatus());

            List<Role> role = new ArrayList<>();
            for (Integer id : model.getRoleId()) {
                role.add(roleRepository.findRolesById(id));
            }

            newEmployee.setRoles(role);

            return employeeRepository.save(newEmployee);
        } else {
            throw new RuntimeException("Employee not available");
        }
    }

    public String deleteEmployee(Integer employee_id) {
        Optional<Employee> employee = employeeRepository.findById(employee_id);

        if (employee.isPresent()) {
            employeeRepository.delete(employee.get());
            return "Employee deleted successfully";
        } else {
            throw new RuntimeException("Employee not found");
        }
    }
}
