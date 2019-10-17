package fr.space.adopteVaisseau;

import fr.space.adopteVaisseau.entity.Client;
import fr.space.adopteVaisseau.manager.ClientManager.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdopteVaisseauApplicationTests {

	@Autowired
	private ClientService clientService;

	@Test
	public void contextLoads() {
		/*Client client = new Client("Jean","Dupont","12 rue des tests","0202020202",true);
		Client client2 = new Client("Paul","Dupont","12 rue des tests","0202020202",true);
		Client client3 = new Client("Pierre","Dupont","12 rue des tests","0202020202",true);

		clientService.create(client);
		clientService.create(client2);
		clientService.create(client3);

		clientService.findAll().forEach(System.out::println);

		System.out.println("Suppression");

		clientService.delete(client);
*/
		clientService.findAll().forEach(System.out::println);
	}

}
