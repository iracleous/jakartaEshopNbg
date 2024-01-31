package gr.codehub.jakartaeshopnbg.repository;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T, K> {
    Optional<T> save(T t);
    List<T> findAll();
    Optional<T> findById(K id);
    Optional<T> update(K id, T newValues);
    boolean delete(K id);
}
