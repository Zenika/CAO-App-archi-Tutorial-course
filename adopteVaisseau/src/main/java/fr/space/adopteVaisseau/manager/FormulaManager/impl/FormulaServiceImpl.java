package fr.space.adopteVaisseau.manager.FormulaManager.impl;

import fr.space.adopteVaisseau.dao.ClientDao;
import fr.space.adopteVaisseau.dao.FormulaDao;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.entity.Formula;
import fr.space.adopteVaisseau.manager.FormulaManager.FormulaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Normalizer;
import java.util.List;
import java.util.Optional;

@Service
public class FormulaServiceImpl implements FormulaService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private FormulaDao formulaDao;


    @Override
    public void create(Formula formula) {
        logger.info("Formula enregistré");
        formulaDao.save(formula);
    }

    @Override
    public void delete(Formula formula) {
        logger.info("Supprime une formula");
        formulaDao.deleteById(formula.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime une formula");
        formulaDao.deleteById(id);
    }

    @Override
    public List<Formula> findAll() {
        logger.info("Retourne toutes les formulas");
         return formulaDao.findAll();
    }

    @Override
    public Optional<Formula> findById(Long id) {
        logger.info("Retourne une formula");
        return formulaDao.findById(id);
    }
}
