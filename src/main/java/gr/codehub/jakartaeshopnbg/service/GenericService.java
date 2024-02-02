package gr.codehub.jakartaeshopnbg.service;

import java.util.List;

public interface GenericService <T, K>{
    T createT(T t);
    T readT(K tId);
    List<T> readT();
    T updateT(K tId, T t);
    boolean deleteT(K tId);
}
