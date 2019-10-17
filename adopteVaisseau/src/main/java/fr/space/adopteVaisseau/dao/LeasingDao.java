package fr.space.adopteVaisseau.dao;

import fr.space.adopteVaisseau.entity.Formula;
import fr.space.adopteVaisseau.entity.Leasing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeasingDao extends JpaRepository<Leasing,Long> {
}
