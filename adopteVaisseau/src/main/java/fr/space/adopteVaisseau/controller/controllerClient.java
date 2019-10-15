package fr.space.adopteVaisseau.controller;

import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.manager.ClientManager.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controllerClient {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public List<Client> getAll(){
        return clientService.findAll();
    }

    @PostMapping("/client")
    public void addClient(@ModelAttribute Client client){
        clientService.create(client);
    }
}
