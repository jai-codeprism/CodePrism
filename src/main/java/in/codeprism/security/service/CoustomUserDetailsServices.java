package in.codeprism.security.service;

import in.codeprism.security.model.CoustomUserDetails;
import in.codeprism.security.model.Users;
import in.codeprism.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CoustomUserDetailsServices implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        Optional<Users> uname=userRepository.findByUserName(userName);

       uname.orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return uname.map(CoustomUserDetails::new).get();

    }
}
