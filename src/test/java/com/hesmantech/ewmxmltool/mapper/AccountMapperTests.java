package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AccountItem;
import com.hesmantech.ewmxmltool.xml.data.accounts.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

class AccountMapperTests {
    AccountMapper accountMapper;

    @BeforeEach
    void init() {
        accountMapper = AccountMapper.getInstance();
    }

    @Test
    void initOk() {
        Assertions.assertNotNull(accountMapper);
    }

    @Test
    void toAccountItemOk() {
        Account account = new Account();
        account.setAccountId("ACCOUNT-ID-TEST");
        account.setHolderId("HOLDER-ID-TEST");
        account.setAccountStatus("A");
        List<Account> accountList = Collections.singletonList(account);
        List<AccountItem> accountItems = accountMapper.toAccountItems(accountList);

        Assertions.assertEquals(accountList.size(), accountItems.size());

        AccountItem item = accountItems.get(0);
        Assertions.assertEquals(account.getAccountId(), item.getAccountId());
        Assertions.assertEquals(account.getHolderId(), item.getHolderId());
        Assertions.assertEquals(account.getAccountStatus(), item.getAccountStatus());
    }
}
