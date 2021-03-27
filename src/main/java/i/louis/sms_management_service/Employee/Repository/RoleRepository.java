package i.louis.sms_management_service.Employee.Repository;

import i.louis.sms_management_service.Employee.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRolesById(Integer roleId);
}
