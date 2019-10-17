package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.entity.Stock;
import fr.space.adopteVaisseau.manager.StockManager.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsStock {

    @Autowired
    private StockService stockService;

    @GetMapping("stock")
    public List<Stock> getStocks() {
        return stockService.findAll();
    }

    @PostMapping("add-stock")
    public void addStock(@Valid @RequestBody Stock stock){stockService.create(stock);}

    @DeleteMapping("delete-stock")
    public void deleteStock(@Valid @RequestBody Stock stock){stockService.delete(stock);}

    @PutMapping("update-stock")
    public void updateStock(@Valid @RequestBody Stock stock){stockService.create(stock);}
}
