package fr.adopteVaisseau.shipControl.dao;

import fr.adopteVaisseau.shipControl.entity.Control;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlDao extends JpaRepository<Control,Long> {
}
