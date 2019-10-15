package fr.space.adopteVaisseau.dao;

import fr.space.adopteVaisseau.entity.Formula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormulaDao extends JpaRepository<Formula,Long> {
}
