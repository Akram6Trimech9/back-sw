package pi.enset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pi.enset.entities.NonDisponibilite;
import java.util.List; 
public interface NonDisponibiliteRepository extends JpaRepository<NonDisponibilite, Long> {
        List<NonDisponibilite> findByEnseignantId(Long enseignantId);  
}
