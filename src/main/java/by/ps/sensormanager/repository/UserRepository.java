package by.ps.sensormanager.repository;

import by.ps.sensormanager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository interface for {@link User} class.
 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
