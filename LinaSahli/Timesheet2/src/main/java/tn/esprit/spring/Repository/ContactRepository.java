package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
	@Query("select t from Contact t where t.id=:id")
	Contact getConById(@Param("id")Long id);
}
