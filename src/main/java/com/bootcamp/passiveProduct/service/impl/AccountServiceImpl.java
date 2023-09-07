package com.bootcamp.passiveProduct.service.impl;

import com.bootcamp.passiveProduct.domain.Account;
import com.bootcamp.passiveProduct.repository.AccountRepository;
import com.bootcamp.passiveProduct.repository.GenericRepository;
import com.bootcamp.passiveProduct.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl extends CrudImpl<Account,String> implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    protected GenericRepository<Account,String> getRepo() {return accountRepository;}
}
