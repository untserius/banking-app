package com.bankingapp.service.Impl;

import com.bankingapp.entity.Account;
import com.bankingapp.mapper.AccountMapper;
import com.bankingapp.payload.AccountDto;
import com.bankingapp.repository.AccountRepository;
import com.bankingapp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto){
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
