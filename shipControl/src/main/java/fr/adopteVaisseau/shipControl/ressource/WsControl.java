package fr.adopteVaisseau.shipControl.ressource;

import fr.adopteVaisseau.shipControl.entity.Control;
import fr.adopteVaisseau.shipControl.dto.ControlDto;
import fr.adopteVaisseau.shipControl.service.ControlService.ControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WSControl {

    @Autowired
    private ControlService controlService;

    @GetMapping("control")
    public List<Control> getControl() {
        return controlService.findAll();
    }

    @PostMapping("add-control")
    public void addControl(@Valid @RequestBody ControlDto control){
        controlService.create(new Control(control.isMoteur(),control.isBouclier(),
                control.isStructure(),control.isTrainAtterisage(),control.isArmement()));
    }

    @DeleteMapping("delete-control")
    public void deleteControl(@Valid @RequestBody Control control){controlService.delete(control);}

    @PutMapping("update-client")
    public void updateClient(@Valid @RequestBody Control control){
        controlService.create(control);}
}
