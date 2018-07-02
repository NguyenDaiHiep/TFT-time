package ndhiep.springsecurity.repository;

import org.springframework.data.repository.CrudRepository;

import ndhiep.springsecurity.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public User findByEmail(String email);

}
