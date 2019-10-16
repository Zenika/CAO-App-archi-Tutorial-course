package cao.application.architecture.poneyhiring.controller;

import cao.application.architecture.poneyhiring.model.Client;
import cao.application.architecture.poneyhiring.model.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import cao.application.architecture.poneyhiring.repository.ClientRepository;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClientResource {

    @Inject
    private ClientRepository clientRepository;

    @GetMapping("clients")
    public ResponseEntity getClients() {
        List clients = clientRepository.findAll();

        return ResponseEntity.ok(clientRepository.findAll());
    }

    @GetMapping("clients/{id}")
    public ResponseEntity getClientById(@PathVariable("id") Long id) {
        Optional<Client> maybeClient = clientRepository.findById(id);
        if (maybeClient.isPresent()) {
            Client client = maybeClient.get();
            ClientDTO result = new ClientDTO();
            result.firstName = client.firstName;
            result.lastName = client.lastName;
            result.id = client.id;
            return ResponseEntity.ok(client);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("clients")
    public ResponseEntity createClient(@Valid @RequestBody ClientDTO clientDTO) {
        if (clientDTO != null) {
            Client result = clientRepository.save(new Client(clientDTO.firstName, clientDTO.lastName));
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().build();
    }
}
