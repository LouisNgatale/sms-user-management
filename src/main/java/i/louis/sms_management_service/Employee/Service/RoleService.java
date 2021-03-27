package i.louis.sms_management_service.Employee.Service;

import i.louis.sms_management_service.Employee.Entity.Role;
import i.louis.sms_management_service.Employee.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role findRolesById(Integer roleId) {
        return roleRepository.findRolesById(roleId);
    }
}
