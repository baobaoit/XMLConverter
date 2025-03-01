package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.CardTransactionItem;
import com.hesmantech.ewmxmltool.xml.data.cardstransactions.CardTransaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CardTransactionMapper {
    CardTransactionMapper INSTANCE = Mappers.getMapper(CardTransactionMapper.class);

    @Mapping(target = "transactionAmount", source = "cardTransaction.transactionAmount.value")
    @Mapping(target = "transactionAmountCurrency", source = "cardTransaction.transactionAmount.currency")
    @Mapping(target = "billingAmount", source = "cardTransaction.billingAmount.value")
    @Mapping(target = "billingAmountCurrency", source = "cardTransaction.billingAmount.currency")
    @Mapping(target = "billingAmountRate", source = "cardTransaction.billingAmount.rate")
    @Mapping(target = "cardholderAmount", source = "cardTransaction.cardholderAmount.value")
    @Mapping(target = "cardholderAmountCurrency", source = "cardTransaction.cardholderAmount.currency")
    @Mapping(target = "cardholderAmountRate", source = "cardTransaction.cardholderAmount.rate")
    @Mapping(target = "transactionFee", source = "cardTransaction.transactionFee.value")
    @Mapping(target = "transactionFeeCurrency", source = "cardTransaction.transactionFee.currency")
    @Mapping(target = "settlementAmount", source = "cardTransaction.settlementAmount.value")
    @Mapping(target = "settlementAmountCurrency", source = "cardTransaction.settlementAmount.currency")
    @Mapping(target = "settlementAmountRate", source = "cardTransaction.settlementAmount.rate")
    @Mapping(target = "transactionExchangeFeeAmount", source = "cardTransaction.transactionExchangeFeeAmount.value")
    @Mapping(target = "transactionExchangeFeeAmountCurrency", source = "cardTransaction.settlementAmount.currency")
    @Mapping(target = ".", source = "cardTransaction.riskActions")
    @Mapping(target = ".", source = "cardTransaction.securityChecks")
    CardTransactionItem toCardTransactionItem(CardTransaction cardTransaction);
}
