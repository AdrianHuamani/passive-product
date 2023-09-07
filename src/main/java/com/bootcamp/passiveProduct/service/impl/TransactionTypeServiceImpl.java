package com.bootcamp.passiveProduct.service.impl;

import com.bootcamp.passiveProduct.domain.TransactionType;
import com.bootcamp.passiveProduct.repository.TransactionTypeRepository;
import com.bootcamp.passiveProduct.repository.GenericRepository;
import com.bootcamp.passiveProduct.service.TransactionTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionTypeServiceImpl extends CrudImpl<TransactionType,String> implements TransactionTypeService {

    private final TransactionTypeRepository transactionTypeRepository;

    @Override
    protected GenericRepository<TransactionType,String> getRepo() {return transactionTypeRepository;}
}
