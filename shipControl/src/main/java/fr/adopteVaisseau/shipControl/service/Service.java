package fr.adopteVaisseau.shipControl.service;

import java.util.List;
import java.util.Optional;

public interface Service<T> {
    public void create(T o);
    public void delete(T o);
    public void deleteById(Long id);
    public List<T> findAll();
    public Optional<T> findById(Long id);
}
