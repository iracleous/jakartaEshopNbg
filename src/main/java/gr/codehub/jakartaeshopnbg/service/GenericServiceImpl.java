package gr.codehub.jakartaeshopnbg.service;

import gr.codehub.jakartaeshopnbg.repository.GenericRepository;
import jakarta.inject.Inject;

import java.util.List;

public class GenericServiceImpl<T,K> implements GenericService<T,K>  {

    @Inject
    private GenericRepository<T,K> genRepository;
    @Override
    public T createT(T t) {
        return genRepository.save(t).get();
    }

    @Override
    public T readT(K tId) {
        return genRepository.findById(tId).get();
    }

    @Override
    public List<T> readT() {
        return genRepository.findAll();
    }

    @Override
    public T updateT(K tId, T t) {
        return genRepository.update(tId, t).get();
    }

    @Override
    public boolean deleteT(K tId) {
        return genRepository.delete(tId);
    }
    
}
