package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AccountTransactionItem;
import com.hesmantech.ewmxmltool.xml.data.accountstransactions.AccountTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AccountTransactionMapperTests {
    AccountTransactionMapper accountTransactionMapper;

    @BeforeEach
    void init() {
        accountTransactionMapper = AccountTransactionMapper.INSTANCE;
    }

    @Test
    void initOk() {
        Assertions.assertNotNull(accountTransactionMapper);
    }

    @Test
    void toAccountTransactionItemOk() {
        AccountTransaction accountTransaction = new AccountTransaction();
        accountTransaction.setAccountId("ACCOUNT-TRANSACTION-ID-TEST");

        AccountTransactionItem item = accountTransactionMapper.toAccountTransactionItem(accountTransaction);
        Assertions.assertEquals(accountTransaction.getAccountId(), item.getAccountId());
    }
}
