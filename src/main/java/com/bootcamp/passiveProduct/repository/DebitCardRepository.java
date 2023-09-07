package com.bootcamp.passiveProduct.repository;

import com.bootcamp.passiveProduct.domain.DebitCard;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

public interface DebitCardRepository extends GenericRepository<DebitCard, String> {
    Flowable<DebitCard> findByCustomerInternalCode(String customerInternalCode);
}
