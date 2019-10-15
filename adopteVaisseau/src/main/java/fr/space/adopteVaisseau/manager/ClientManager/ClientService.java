package fr.space.adopteVaisseau.manager.ClientManager;

import fr.space.adopteVaisseau.entity.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public void create(Client client);
    public void delete (Client client);
    public void deleteById (Long id);
    public List<Client> findAll ();
    public Optional<Client> findById (Long id);

}
