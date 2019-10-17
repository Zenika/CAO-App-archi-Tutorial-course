package cao.application.architecture.unicornrenting.controller;

import cao.application.architecture.unicornrenting.model.Customer;
import cao.application.architecture.unicornrenting.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cao.application.architecture.unicornrenting.model.CustomerDTO;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class CustomerResource {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("clients")
    public ResponseEntity getClients() {
        return ResponseEntity.ok(customerRepository.findAll());
    }


        @PostMapping("clients")
        public ResponseEntity createClient(@Valid @RequestBody CustomerDTO customerDTO) {
            if (customerDTO != null) {
                Customer result = customerRepository.save(new Customer(
                        customerDTO.firstName,
                        customerDTO.lastName,
                        customerDTO.email,
                        customerDTO.phoneNumber,
                        customerDTO.address,
                        customerDTO.postalCode,
                        customerDTO.city,
                        customerDTO.country,
                        customerDTO.paymentValidated,
                        customerDTO.staffId
                        ));
                return ResponseEntity.ok(result);
            }
            return ResponseEntity.badRequest().build();
        }
    }

