package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.entity.Formula;
import fr.space.adopteVaisseau.manager.FormulaManager.FormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsFormula {

    @Autowired
    private FormulaService formulaService;

    @GetMapping("formula")
    public List<Formula> getFormulas() {
        return formulaService.findAll();
    }

    @PostMapping("add-formula")
    public void addFormula(@Valid @RequestBody Formula formula){formulaService.create(formula);}

    @DeleteMapping("delete-formula")
    public void deleteFormula(@Valid @RequestBody Formula formula){formulaService.delete(formula);}

    @PutMapping("update-formula")
    public void updateFormula(@Valid @RequestBody Formula formula){formulaService.create(formula);}
}