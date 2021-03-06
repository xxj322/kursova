package xxj.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xxj.project.model.PlaneHasFlight;

@Repository
public interface PlaneHasFlightRepository extends JpaRepository<PlaneHasFlight, Integer> {
}
