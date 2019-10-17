package fr.space.adopteVaisseau.ws;

import fr.space.adopteVaisseau.dto.ClientDto;
import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.manager.ClientManager.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController()
@RequestMapping("/api")
public class WsClient {

    @Autowired
    private ClientService clientService;

    @GetMapping("client")
    public List<Client> getClients() {
        return clientService.findAll();
    }

    @PostMapping("add-client")
    public void addClient(@Valid @RequestBody Client client){
        clientService.create(client);
    }

    @DeleteMapping("deleteClient")
    public void deleteClient(@Valid @RequestBody Client client){clientService.delete(client);}

    @PutMapping("update-client")
    public void updateClient(@Valid @RequestBody Client client){
        clientService.create(client);}

}