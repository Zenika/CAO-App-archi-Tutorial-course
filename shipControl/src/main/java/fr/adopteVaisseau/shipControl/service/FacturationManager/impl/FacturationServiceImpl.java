package fr.adopteVaisseau.shipControl.service.FacturationManager.impl;
import fr.adopteVaisseau.shipControl.dao.FacturationDao;
import fr.adopteVaisseau.shipControl.entity.Facturation;
import fr.adopteVaisseau.shipControl.service.FacturationManager.FacturationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturationServiceImpl implements FacturationService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FacturationDao facturationDao;


    @Override
    public void create(Facturation facturation) {
        logger.info("Ship enregistré");
        facturationDao.save(facturation);
    }

    @Override
    public void delete(Facturation facturation) {
        logger.info("Supprime un ship");
        facturationDao.deleteById(facturation.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime un ship");
        facturationDao.deleteById(id);
    }

    @Override
    public List<Facturation> findAll() {
        logger.info("Retourne tous les ships");
         return facturationDao.findAll();
    }

    @Override
    public Optional<Facturation> findById(Long id) {
        logger.info("Retourne un ship");
        return facturationDao.findById(id);
    }
}
