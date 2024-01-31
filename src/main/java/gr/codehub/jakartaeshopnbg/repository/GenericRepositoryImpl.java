package gr.codehub.jakartaeshopnbg.repository;

import gr.codehub.jakartaeshopnbg.model.Product;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public abstract class GenericRepositoryImpl<T,K> implements GenericRepository<T,K>{
    @PersistenceContext(unitName = "Persistence")
    protected EntityManager em;


    public abstract String getClassName();
    public abstract Class<T> getClassType();

    @Override
    public abstract  Optional<T> update(K id, T newValues);

    @Override
    @Transactional
    public Optional<T> save(T t) {
        try {
            em.persist(t);
            return Optional.of(t);
        }
        catch(Exception e){
            return Optional.empty();
        }
    }

    //TODO
    @Override
    public List<T> findAll() {
        try {
            return em
                    .createQuery("select r from " + getClassName() + " r")
                    .getResultList();
        }
        catch(Exception e){
            return new ArrayList<>();
        }
    }
    //TODO
    @Override
    public Optional<T> findById(K id) {
        T t;
        try{
            t = em.find(getClassType(),id);
            return Optional.of(t);
        }
        catch(Exception e){
            return Optional.empty();
        }
    }
//TODO


    @Override
    @Transactional
    public boolean delete(K id) {
        try {
            Optional<T> t = findById(id);
            em.remove(t.get());
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
