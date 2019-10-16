package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.entity.Location;
import fr.space.adopteVaisseau.manager.LocationManager.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsLocation {

    @Autowired
    private LocationService locationService;

    @GetMapping("location")
    public List<Location> getLocation() {
        return locationService.findAll();
    }

    @PostMapping
    public void addLocation(@Valid @RequestBody Location location){locationService.create(location);}

    @DeleteMapping
    public void deleteLocation(@Valid @RequestBody Location location){locationService.delete(location);}

    @PutMapping
    public void updateLocation(){}
}
