package fr.adopteVaisseau.shipControl.ws;

import fr.adopteVaisseau.shipControl.dto.ControlDto;
import fr.adopteVaisseau.shipControl.entity.Control;
import fr.adopteVaisseau.shipControl.service.ControlManager.ControlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class WsControl{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ControlService controlService;

    @GetMapping("control")
    public List<Control> getControls() {
        return controlService.findAll();
    }

    @PostMapping("add-control")
    public void addControl(@Valid @RequestBody ControlDto control){
        logger.info("Control reçu {}",control.toString());

    }

    @DeleteMapping("delete-control")
    public void deleteControl(@Valid @RequestBody Control control){controlService.delete(control);}

    @PutMapping("update-control")
    public void updateControl(@Valid @RequestBody Control control){
        controlService.create(control);}

}
