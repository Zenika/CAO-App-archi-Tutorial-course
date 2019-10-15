package fr.space.adopteVaisseau.dao;

import fr.space.adopteVaisseau.entity.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipDao extends JpaRepository<Ship,Long> {
}
