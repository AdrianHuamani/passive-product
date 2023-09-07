package com.bootcamp.passiveProduct.service.impl;

import com.bootcamp.passiveProduct.domain.CurrencyType;
import com.bootcamp.passiveProduct.repository.CurrencyTypeRepository;
import com.bootcamp.passiveProduct.repository.GenericRepository;
import com.bootcamp.passiveProduct.service.CurrencyTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyTypeServiceImpl extends CrudImpl<CurrencyType,String> implements CurrencyTypeService {

    private final CurrencyTypeRepository currencyTypeRepository;

    @Override
    protected GenericRepository<CurrencyType,String> getRepo() {return currencyTypeRepository;}
}
