package fr.adopteVaisseau.shipControl.service.ControlManager.impl;

import fr.adopteVaisseau.shipControl.dao.ControlDao;
import fr.adopteVaisseau.shipControl.entity.Control;
import fr.adopteVaisseau.shipControl.service.ControlManager.ControlService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ControlServiceImpl implements ControlService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ControlDao controlDao;


    @Override
    public void create(Control control) {
        logger.info("Stock enregistré");
        controlDao.save(control);
    }

    @Override
    public void delete(Control control) {
        logger.info("Supprime un stock");
        controlDao.deleteById(control.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime un stock");
        controlDao.deleteById(id);
    }

    @Override
    public List<Control> findAll() {
        logger.info("Retourne tous les stocks");
         return controlDao.findAll();
    }

    @Override
    public Optional<Control> findById(Long id) {
        logger.info("Retourne un stock");
        return controlDao.findById(id);
    }

    public void update(){}
}
