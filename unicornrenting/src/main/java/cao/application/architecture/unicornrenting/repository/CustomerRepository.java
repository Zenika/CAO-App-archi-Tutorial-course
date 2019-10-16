package cao.application.architecture.unicornrenting.repository;

import cao.application.architecture.unicornrenting.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
