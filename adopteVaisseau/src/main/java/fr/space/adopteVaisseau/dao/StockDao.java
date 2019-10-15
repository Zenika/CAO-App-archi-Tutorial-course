package fr.space.adopteVaisseau.dao;

import fr.space.adopteVaisseau.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDao extends JpaRepository<Stock,Long> {
}
