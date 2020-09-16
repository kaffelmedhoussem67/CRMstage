package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Societe;
@Repository
public interface SocieteRepository extends JpaRepository<Societe,Long> {
	@Query("select t from Societe t where t.id=:id")
	Societe getSocById(@Param("id")Long id);

}
