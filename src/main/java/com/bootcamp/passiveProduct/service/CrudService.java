package com.bootcamp.passiveProduct.service;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;

public interface CrudService <T,ID>{

    Single<T> save(T entity);
    Single<T> update(T entity);
    Maybe<T> findById(ID id);
    Flowable<T> findAll();
    Completable delete(T entity);
}
