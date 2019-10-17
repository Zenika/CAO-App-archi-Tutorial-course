package fr.adopteVaisseau.shipControl.ressource;

import fr.adopteVaisseau.shipControl.dto.FacturationDto;
import fr.adopteVaisseau.shipControl.entity.Facturation;
import fr.adopteVaisseau.shipControl.service.FacturationService.FacturationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WsFacturation {

    @Autowired
    private FacturationService facturationService;

    @GetMapping("facturation")
    public List<Facturation> getFacturation() {
        return facturationService.findAll();
    }

    @PostMapping("add-facturation")
    public void addFacturation(@Valid @RequestBody FacturationDto facturation){
        facturationService.create(new Facturation(facturation.getFraisReparation(),facturation.getFraisEntretien(),
                facturation.getNumFacture(),facturation.getFraisMainOeuvre(),facturation.getFraisPiece()));
    }

    @DeleteMapping("delete-facturation")
    public void deleteFacturation(@Valid @RequestBody Facturation facturation){facturationService.delete(facturation);}

    @PutMapping("update-facturation")
    public void updateFacturation(@Valid @RequestBody Facturation facturation){
        facturationService.create(facturation);}
}
