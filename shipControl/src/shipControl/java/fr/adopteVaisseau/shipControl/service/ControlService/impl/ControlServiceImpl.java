package fr.adopteVaisseau.shipControl.service.ControlService.impl;

import fr.adopteVaisseau.shipControl.dao.ControlDao;
import fr.adopteVaisseau.shipControl.entity.Control;
import fr.adopteVaisseau.shipControl.service.ControlService.ControlService;
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
    public void create(Control o) {
        controlDao.save(o);
    }

    @Override
    public void delete(Control o) {
        this.deleteById(o.getId());
    }

    @Override
    public void deleteById(Long id) {
        controlDao.deleteById(id);
    }

    @Override
    public List<Control> findAll() {
        return controlDao.findAll();
    }

    @Override
    public Optional<Control> findById(Long id) {
        return controlDao.findById(id);
    }
}
