package com.bootcamp.passiveProduct.service.impl;

import com.bootcamp.passiveProduct.repository.GenericRepository;
import com.bootcamp.passiveProduct.service.CrudService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;

public abstract class CrudImpl<T,ID> implements CrudService<T,ID> {
    protected abstract GenericRepository<T,ID> getRepo();

    @Override
    public Single<T> save(T entity) {return getRepo().save(entity);};
    @Override
    public Single<T> update(T entity){return getRepo().save(entity);};
    @Override
    public Maybe<T> findById(ID id){return getRepo().findById(id);};
    @Override
    public Flowable<T> findAll(){return getRepo().findAll();};
    @Override
    public Completable delete(T entity){return getRepo().delete(entity);};

}
