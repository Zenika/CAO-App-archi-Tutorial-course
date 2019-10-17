package fr.space.adopteVaisseau.manager.StockManager.impl;

import fr.space.adopteVaisseau.dao.StockDao;
import fr.space.adopteVaisseau.entity.Stock;
import fr.space.adopteVaisseau.manager.StockManager.StockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StockDao stockDao;


    @Override
    public void create(Stock stock) {
        logger.info("Stock enregistré");
        stockDao.save(stock);
    }

    @Override
    public void delete(Stock stock) {
        logger.info("Supprime un stock");
        stockDao.deleteById(stock.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime un stock");
        stockDao.deleteById(id);
    }

    @Override
    public List<Stock> findAll() {
        logger.info("Retourne tous les stocks");
         return stockDao.findAll();
    }

    @Override
    public Optional<Stock> findById(Long id) {
        logger.info("Retourne un stock");
        return stockDao.findById(id);
    }

    public void update(){}
}
