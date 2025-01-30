package ro.ubb.remoting.common.service;

import ro.ubb.remoting.common.domain.BaseEntity;
import ro.ubb.remoting.common.domain.Grade;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface Service <T extends BaseEntity> {

    Set<T> findAll();
    Integer add(T entity);
    Optional<T> delete(Long id);
    Integer update (T entity);
}
