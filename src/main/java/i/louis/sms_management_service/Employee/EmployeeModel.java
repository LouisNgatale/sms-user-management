package i.louis.sms_management_service.Employee;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

    private Integer id;

    private String firstName;

    private String secondName;


    private String email;

    private String password;

    private String gender;

    private boolean status;

    private int age;

    private List<Integer> roleId;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Integer> getRoleId() {
        return (ArrayList<Integer>) roleId;
    }

    public void setRoleId(ArrayList<Integer> roleId) {
        this.roleId = roleId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
