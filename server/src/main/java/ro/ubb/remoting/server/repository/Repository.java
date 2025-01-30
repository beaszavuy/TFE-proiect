package ro.ubb.remoting.server.repository;

import ro.ubb.remoting.common.domain.BaseEntity;
import ro.ubb.remoting.common.domain.Discipline;
import ro.ubb.remoting.server.validators.ValidatorExeption;

import java.util.Optional;

public interface Repository <ID, T extends BaseEntity<ID>>{
    Optional<T> findOne(ID id);

    Iterable<T> findAll();

    Optional<T> save(T entity) throws ValidatorExeption;

    Optional<T> delete (ID id);

    Optional<T> update (T entity) throws ValidatorExeption;
}
