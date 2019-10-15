package fr.space.adopteVaisseau.dao;

import fr.space.adopteVaisseau.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends JpaRepository<Client,Long> {

}
