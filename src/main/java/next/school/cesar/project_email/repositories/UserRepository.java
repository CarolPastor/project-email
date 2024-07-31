package next.school.cesar.project_email.repositories;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import next.school.cesar.project_email.entities.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, UUID> {
   
	
}