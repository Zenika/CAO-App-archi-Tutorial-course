package fr.space.adopteVaisseau.manager.ShipManager.impl;
import fr.space.adopteVaisseau.dao.ShipDao;
import fr.space.adopteVaisseau.entity.Ship;
import fr.space.adopteVaisseau.manager.ShipManager.ShipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipServiceImpl implements ShipService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ShipDao shipDao;


    @Override
    public void create(Ship ship) {
        logger.info("Ship enregistré");
        shipDao.save(ship);
    }

    @Override
    public void delete(Ship ship) {
        logger.info("Supprime un ship");
        shipDao.deleteById(ship.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime un ship");
        shipDao.deleteById(id);
    }

    @Override
    public List<Ship> findAll() {
        logger.info("Retourne tous les ships");
         return shipDao.findAll();
    }

    @Override
    public Optional<Ship> findById(Long id) {
        logger.info("Retourne un ship");
        return shipDao.findById(id);
    }
}
