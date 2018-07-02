package ndhiep.springsecurity.service;




import java.util.Set;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ndhiep.springsecurity.domain.Role;
import ndhiep.springsecurity.domain.User;
import ndhiep.springsecurity.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		 User user = userRepository.findByEmail(username);
	        if (user == null) {
	            throw new UsernameNotFoundException("User not found");
	}
	        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
	        Set<Role> roles = user.getRoles();
	        for (Role role : roles) {
	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
	        }

	        return new org.springframework.security.core.userdetails.User(
	                user.getEmail(), user.getPassword(), grantedAuthorities);
	    
	}
	

}
