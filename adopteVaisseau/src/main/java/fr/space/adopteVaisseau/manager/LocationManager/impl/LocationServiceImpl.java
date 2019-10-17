package fr.space.adopteVaisseau.manager.LocationManager.impl;

import fr.space.adopteVaisseau.dao.ClientDao;
import fr.space.adopteVaisseau.dao.LocationDao;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.entity.Location;
import fr.space.adopteVaisseau.manager.LocationManager.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LocationDao locationDao;


    @Override
    public void create(Location location) {
        logger.info("Location enregistrée");
        locationDao.save(location);
    }

    @Override
    public void delete(Location location) {
        logger.info("Supprime une location");
        locationDao.deleteById(location.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime une location");
        locationDao.deleteById(id);
    }

    @Override
    public List<Location> findAll() {
        logger.info("Retourne toutes les locations");
         return locationDao.findAll();
    }

    @Override
    public Optional<Location> findById(Long id) {
        logger.info("Retourne une location");
        return locationDao.findById(id);
    }
}
