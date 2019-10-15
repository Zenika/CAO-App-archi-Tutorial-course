package fr.space.adopteVaisseau.dao;

import fr.space.adopteVaisseau.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationDao extends JpaRepository<Location,Long> {
}
