package fr.space.adopteVaisseau.manager.LeasingManager.impl;

import fr.space.adopteVaisseau.dao.LeasingDao;
import fr.space.adopteVaisseau.entity.Leasing;
import fr.space.adopteVaisseau.manager.LeasingManager.LeasingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LeasingServiceImpl implements LeasingService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LeasingDao leasingDao;


    @Override
    public void create(Leasing leasing) {
        logger.info("Leasing enregistrée");
        leasingDao.save(leasing);
    }

    @Override
    public void delete(Leasing leasing) {
        logger.info("Supprime une leasing");
        leasingDao.deleteById(leasing.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime une location");
        leasingDao.deleteById(id);
    }

    @Override
    public List<Leasing> findAll() {
        logger.info("Retourne toutes les locations");
         return leasingDao.findAll();
    }

    @Override
    public Optional<Leasing> findById(Long id) {
        logger.info("Retourne une location");
        return leasingDao.findById(id);
    }
}
