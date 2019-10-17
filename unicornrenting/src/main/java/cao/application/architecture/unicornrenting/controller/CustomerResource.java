package cao.application.architecture.unicornrenting.controller;

import cao.application.architecture.unicornrenting.model.Customer;
import cao.application.architecture.unicornrenting.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("clients/ajout")
    public Customer setClients(@RequestBody Map<String, String> body) {
        String lastName = body.get("lastName");
        String firstName = body.get("firstName");
        String email = body.get("email");
        String phoneNumber = body.get("phoneNumber");
        String address = body.get("address");
        String postalCode = body.get("postalCode");
        String city = body.get("city");
        String country = body.get("country");

        return customerRepository.save(new Customer(
                lastName,
                firstName,
                email,
                phoneNumber,
                address,
                postalCode,
                city,
                country,
                false,
                2
                ));
    }
}
