package cao.application.architecture.poneyhiring.controller;

import cao.application.architecture.poneyhiring.model.Client;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cao.application.architecture.poneyhiring.repository.ClientRepository;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientResource {

    @Inject
    private ClientRepository clientRepository;

    @GetMapping("clients")
    public ResponseEntity getClients() {
        return ResponseEntity.ok(clientRepository.findAll());
    }
}
