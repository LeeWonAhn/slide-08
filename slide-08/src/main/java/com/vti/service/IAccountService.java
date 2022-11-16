package com.vti.service;

import com.vti.entity.Account;
import com.vti.form.AccountCreateForm;
import com.vti.form.AccountUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAccountService {
    Page<Account> findAll(Pageable pageable);
    Account findById(int id);
    void deleteById(int id);

    void create(AccountCreateForm form);

    void update(AccountUpdateForm form);
}
