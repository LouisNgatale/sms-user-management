package i.louis.sms_management_service.Employee.Controller;

import i.louis.sms_management_service.Employee.EmployeeModel;
import i.louis.sms_management_service.Employee.Entity.Employee;
import i.louis.sms_management_service.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/management/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //    Create
    @RequestMapping(method = RequestMethod.POST, value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public EmployeeModel registerEmployee(@RequestBody EmployeeModel model) {
        employeeService.registerEmployee(model);
        return model;
    }

    //    Get one Employee
    @RequestMapping(method = RequestMethod.GET, value = "/{employee_id}")
    public Optional<Employee> getEmployee(@PathVariable Integer employee_id) {
        return employeeService.getEmployee(employee_id);
    }

    //    Get all Employees
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    //    Edit one employee
    @RequestMapping(method = RequestMethod.PUT, value = "/{employee_id}/edit")
    public Employee editEmployee(@PathVariable Integer employee_id, @RequestBody EmployeeModel model) {
        return employeeService.editEmployee(employee_id, model);
    }

    //    Delete Employee
    @RequestMapping(method = RequestMethod.DELETE, value = "/{employee_id}/delete")
    public String deleteEmployee(@PathVariable Integer employee_id) {
        return employeeService.deleteEmployee(employee_id);
    }
}
