package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.entity.Formula;
import fr.space.adopteVaisseau.entity.Ship;
import fr.space.adopteVaisseau.manager.FormulaManager.FormulaService;
import fr.space.adopteVaisseau.manager.ShipManager.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsShip {

    @Autowired
    private ShipService shipService;

    @GetMapping("ship")
    public List<Ship> getShips() {
        return shipService.findAll();
    }

    @PostMapping
    public void addShip(@Valid @RequestBody Ship ship){shipService.create(ship);}

    @DeleteMapping
    public void deleteShip(@Valid @RequestBody Ship ship){shipService.delete(ship);}

    @PutMapping
    public void updateShip(){}
}