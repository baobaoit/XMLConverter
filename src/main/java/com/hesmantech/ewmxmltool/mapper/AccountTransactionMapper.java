package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AccountTransactionItem;
import com.hesmantech.ewmxmltool.xml.data.accountstransactions.AccountTransaction;
import com.hesmantech.ewmxmltool.xml.data.accountstransactions.AccountsTransactions;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AccountTransactionMapper {
    AccountTransactionMapper INSTANCE = Mappers.getMapper(AccountTransactionMapper.class);

    @Mapping(target = "transactionAmount", source = "accountTransaction.transactionAmount.value")
    @Mapping(target = "transactionAmountCurrency", source = "accountTransaction.transactionAmount.currency")
    @Mapping(target = "billingAmount", source = "accountTransaction.billingAmount.value")
    @Mapping(target = "billingAmountCurrency", source = "accountTransaction.billingAmount.currency")
    @Mapping(target = "billingAmountRate", source = "accountTransaction.billingAmount.rate")
    @Mapping(target = "cardholderAmount", source = "accountTransaction.cardholderAmount.value")
    @Mapping(target = "cardholderAmountCurrency", source = "accountTransaction.cardholderAmount.currency")
    @Mapping(target = "cardholderAmountRate", source = "accountTransaction.cardholderAmount.rate")
    @Mapping(target = "transactionFee", source = "accountTransaction.transactionFee.value")
    @Mapping(target = "transactionFeeCurrency", source = "accountTransaction.transactionFee.currency")
    @Mapping(target = "settlementAmount", source = "accountTransaction.settlementAmount.value")
    @Mapping(target = "settlementAmountCurrency", source = "accountTransaction.settlementAmount.currency")
    @Mapping(target = "settlementAmountRate", source = "accountTransaction.settlementAmount.rate")
    @Mapping(target = "transactionExchangeFeeAmount", source = "accountTransaction.transactionExchangeFeeAmount.value")
    @Mapping(target = "transactionExchangeFeeAmountCurrency", source = "accountTransaction.settlementAmount.currency")
    @Mapping(target = ".", source = "accountTransaction.riskActions")
    @Mapping(target = ".", source = "accountTransaction.securityChecks")
    AccountTransactionItem toAccountTransactionItem(AccountTransaction accountTransaction);

    default List<AccountTransactionItem> toAccountTransactionItemList(AccountsTransactions accountsTransactions) {
        if (accountsTransactions == null) {
            return Collections.emptyList();
        }

        List<AccountTransaction> accountTransactionList = accountsTransactions.getAccountTransactions();

        if (accountTransactionList == null || accountTransactionList.isEmpty()) {
            return Collections.emptyList();
        }

        return accountTransactionList.stream()
                .map(this::toAccountTransactionItem)
                .collect(Collectors.toList());
    }
}
