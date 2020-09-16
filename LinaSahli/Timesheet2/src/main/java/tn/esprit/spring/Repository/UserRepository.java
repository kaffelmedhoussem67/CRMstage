package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.User;


@Repository
public interface UserRepository  extends JpaRepository<User,Long> {
	
	
  @Query("select e from User e where e.emailId=:emailId and e.password=:password")
   User findByEmailIdAndPassword(@Param("emailId")String emailId,@Param("password")String password);
  @Query("select e from User e where e.emailId=:emailId")
	User findEmailById(@Param("emailId")String emailId);
 


}
