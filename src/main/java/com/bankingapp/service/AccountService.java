package com.bankingapp.service;

import com.bankingapp.entity.Account;
import com.bankingapp.payload.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

}
