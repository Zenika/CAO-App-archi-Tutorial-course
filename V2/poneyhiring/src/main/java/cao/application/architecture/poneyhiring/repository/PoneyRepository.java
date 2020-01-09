package cao.application.architecture.poneyhiring.repository;

import cao.application.architecture.poneyhiring.model.Poney;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoneyRepository extends JpaRepository<Poney, Long> {


}
