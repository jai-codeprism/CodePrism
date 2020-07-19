package in.codeprism.security.repository;

import in.codeprism.security.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    Optional<Users> findByUserName(String userName);

}
