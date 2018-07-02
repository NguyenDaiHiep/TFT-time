package ndhiep.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import ndhiep.springsecurity.domain.Role;


public interface RoleRepository extends CrudRepository<Role, Integer>{
	//Role findByName(String name);

}
