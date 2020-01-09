package cao.application.architecture.poneyhiring.repository;

import cao.application.architecture.poneyhiring.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
