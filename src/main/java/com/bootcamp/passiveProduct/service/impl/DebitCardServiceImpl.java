package com.bootcamp.passiveProduct.service.impl;

import com.bootcamp.passiveProduct.domain.DebitCard;
import com.bootcamp.passiveProduct.repository.DebitCardRepository;
import com.bootcamp.passiveProduct.repository.GenericRepository;
import com.bootcamp.passiveProduct.service.DebitCardService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DebitCardServiceImpl extends CrudImpl<DebitCard,String> implements DebitCardService {

    private final DebitCardRepository debitCardRepository;

    @Override
    protected GenericRepository<DebitCard,String> getRepo() {return debitCardRepository;}

    @Override
    public Flowable<DebitCard> findByCustomerInternalCode(String customerInternalCode) {
        return debitCardRepository.findByCustomerInternalCode(customerInternalCode);
    }
}
