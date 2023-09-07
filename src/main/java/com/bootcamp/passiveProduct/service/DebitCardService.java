package com.bootcamp.passiveProduct.service;

import com.bootcamp.passiveProduct.domain.DebitCard;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;

public interface DebitCardService  extends CrudService<DebitCard, String>{

    Flowable<DebitCard> findByCustomerInternalCode(String customerInternalCode);
}
