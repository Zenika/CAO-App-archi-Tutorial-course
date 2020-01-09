package cao.application.architecture.poneyhiring.controller;

import cao.application.architecture.poneyhiring.model.Poney;
import cao.application.architecture.poneyhiring.repository.PoneyRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PoneyResource {

    @Inject
    PoneyRepository poneyRepository;

    @GetMapping("/poneys")
    public ResponseEntity getPoneys() {
        return ResponseEntity.ok(poneyRepository.findAll());
    }

    @DeleteMapping("/poneys/{id}")
    public ResponseEntity deletePoneyByIdLong(@RequestParam("id") Long id) {
        Optional<Poney> maybePoney = poneyRepository.findById(id);
        if (maybePoney.isPresent()) {
            poneyRepository.deleteById(id);
            return ResponseEntity.ok("Poney deleted");
        }
        return ResponseEntity.notFound().build();
    }
}
