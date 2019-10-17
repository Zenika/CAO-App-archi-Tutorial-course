package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.entity.Leasing;
import fr.space.adopteVaisseau.manager.LeasingManager.LeasingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsLeasing {

    @Autowired
    private LeasingService leasingService;

    @GetMapping("location")
    public List<Leasing> getLocation() {
        return leasingService.findAll();
    }

    @PostMapping("add-location")
    public void addLocation(@Valid @RequestBody Leasing leasing){
        leasingService.create(leasing);}

    @DeleteMapping("delete-location")
    public void deleteLocation(@Valid @RequestBody Leasing leasing){
        leasingService.delete(leasing);}

    @PutMapping("update-location")
    public void updateLocation(@Valid @RequestBody Leasing leasing){
        leasingService.create(leasing);}
}
