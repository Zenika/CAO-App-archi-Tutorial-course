package fr.adopteVaisseau.shipControl.dao;

import fr.adopteVaisseau.shipControl.entity.Facturation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturationDao extends JpaRepository<Facturation,Long> {

}
