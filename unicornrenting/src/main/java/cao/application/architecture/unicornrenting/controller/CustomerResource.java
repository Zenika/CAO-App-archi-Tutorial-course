package cao.application.architecture.unicornrenting.controller;

import cao.application.architecture.unicornrenting.model.Customer;
import cao.application.architecture.unicornrenting.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cao.application.architecture.unicornrenting.repository.CustomerRepository;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerResource {

    @Inject
    private CustomerRepository customerRepository;

    @GetMapping("clients")
    public ResponseEntity getClients() {
        return ResponseEntity.ok(customerRepository.findAll());
    }
}
