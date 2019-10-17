package fr.space.adopteVaisseau.manager.EmployeeManager.impl;

import fr.space.adopteVaisseau.dao.ClientDao;
import fr.space.adopteVaisseau.dao.EmployeeDao;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.entity.Employee;
import fr.space.adopteVaisseau.manager.EmployeeManager.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public void create(Employee employee) {
        logger.info("Employee enregistré");
        employeeDao.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        logger.info("Supprime un employee");
        employeeDao.deleteById(employee.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime un employee");
        employeeDao.deleteById(id);
    }

    @Override
    public List<Employee> findAll() {
        logger.info("Retourne tous les employees");
         return employeeDao.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        logger.info("Retourne un employee");
        return employeeDao.findById(id);
    }
}
