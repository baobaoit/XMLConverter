package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.CardFinAuthorizationItem;
import com.hesmantech.ewmxmltool.xml.data.finauthorizes.CardFinancialAuthorization;
import com.hesmantech.ewmxmltool.xml.data.finauthorizes.FinancialAuthorizes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface CardFinAuthorizationMapper {
    CardFinAuthorizationMapper INSTANCE = Mappers.getMapper(CardFinAuthorizationMapper.class);


    @Mapping(target = "transactionAmount", source = "cardFinancialAuthorization.transactionAmount.value")
    @Mapping(target = "transactionAmountCurrency", source = "cardFinancialAuthorization.transactionAmount.currency")
    @Mapping(target = "billingAmount", source = "cardFinancialAuthorization.billingAmount.value")
    @Mapping(target = "billingAmountCurrency", source = "cardFinancialAuthorization.billingAmount.currency")
    @Mapping(target = "billingAmountRate", source = "cardFinancialAuthorization.billingAmount.rate")
    @Mapping(target = "cardholderAmount", source = "cardFinancialAuthorization.cardholderAmount.value")
    @Mapping(target = "cardholderAmountCurrency", source = "cardFinancialAuthorization.cardholderAmount.currency")
    @Mapping(target = "cardholderAmountRate", source = "cardFinancialAuthorization.cardholderAmount.rate")
    @Mapping(target = "transactionFee", source = "cardFinancialAuthorization.transactionFee.value")
    @Mapping(target = "transactionFeeCurrency", source = "cardFinancialAuthorization.transactionFee.currency")
    @Mapping(target = "cashBackAmount", source = "cardFinancialAuthorization.cashBackAmount.value")
    @Mapping(target = "cashBackAmountCurrency", source = "cardFinancialAuthorization.cashBackAmount.currency")
    @Mapping(target = "settlementAmount", source = "cardFinancialAuthorization.settlementAmount.value")
    @Mapping(target = "settlementAmountCurrency", source = "cardFinancialAuthorization.settlementAmount.currency")
    @Mapping(target = "settlementAmountRate", source = "cardFinancialAuthorization.settlementAmount.rate")
    @Mapping(target = ".", source = "cardFinancialAuthorization.securityChecks")
    CardFinAuthorizationItem toCardFinAuthorizationItem(CardFinancialAuthorization cardFinancialAuthorization);

    default List<CardFinAuthorizationItem> toCardFinAuthorizationItemList(FinancialAuthorizes financialAuthorizes) {
        if (financialAuthorizes == null) {
            return Collections.emptyList();
        }

        List<CardFinancialAuthorization> cardFinancialAuthorizations = financialAuthorizes.getCardFinancialAuthorizations();

        if (cardFinancialAuthorizations == null || cardFinancialAuthorizations.isEmpty()) {
            return Collections.emptyList();
        }

        return cardFinancialAuthorizations.stream()
                .map(this::toCardFinAuthorizationItem)
                .collect(Collectors.toList());
    }
}
