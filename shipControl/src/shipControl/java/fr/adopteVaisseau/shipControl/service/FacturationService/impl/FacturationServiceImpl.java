package fr.adopteVaisseau.shipControl.service.FacturationService.impl;

import fr.adopteVaisseau.shipControl.dao.FacturationDao;
import fr.adopteVaisseau.shipControl.entity.Facturation;
import fr.adopteVaisseau.shipControl.service.FacturationService.FacturationService;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturationServiceImpl implements FacturationService {

    @Autowired
    private FacturationDao facturationDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void create(Facturation o) {
        facturationDao.save(o);
    }

    @Override
    public void delete(Facturation o) {
        this.deleteById(o.getId());
    }

    @Override
    public void deleteById(Long id) {
        facturationDao.deleteById(id);
    }

    @Override
    public List<Facturation> findAll() {
        return facturationDao.findAll();
    }

    @Override
    public Optional<Facturation> findById(Long id) {
        return facturationDao.findById(id);
    }
}
