package fr.space.adopteVaisseau.manager.ClientManager.impl;

import fr.space.adopteVaisseau.dao.ClientDao;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.manager.ClientManager.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ClientDao clientDao;


    @Override
    public void create(Client client) {
        logger.info("Client enregistré");
        clientDao.save(client);
    }

    @Override
    public void delete(Client client) {
        logger.info("Supprime un client");
        clientDao.deleteById(client.getId());
    }

    @Override
    public void deleteById(Long id) {
        logger.info("Supprime un client");
        clientDao.deleteById(id);
    }

    @Override
    public List<Client> findAll() {
        logger.info("Retourne tous les clients");
         return clientDao.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        logger.info("Retourne un client");
        return clientDao.findById(id);
    }
}
