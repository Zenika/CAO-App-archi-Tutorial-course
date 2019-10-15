package fr.space.adopteVaisseau.manager.ClientManager.impl;

import fr.space.adopteVaisseau.dao.ClientDao;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.manager.ClientManager.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;


    @Override
    public void create(Client client) {
        clientDao.save(client);
    }

    @Override
    public void delete(Client client) {
        clientDao.deleteById(client.getId());
    }

    @Override
    public void deleteById(Long id) {
        clientDao.deleteById(id);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientDao.findById(id);
    }
}
