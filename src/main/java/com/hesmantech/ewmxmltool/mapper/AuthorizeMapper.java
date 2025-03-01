package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AuthorizeItem;
import com.hesmantech.ewmxmltool.xml.data.authorizes.Authorize;
import com.hesmantech.ewmxmltool.xml.data.authorizes.Authorizes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AuthorizeMapper {
    AuthorizeMapper INSTANCE = Mappers.getMapper(AuthorizeMapper.class);

    @Mapping(target = "transactionAmount", source = "authorize.transactionAmount.value")
    @Mapping(target = "transactionAmountCurrency", source = "authorize.transactionAmount.currency")
    @Mapping(target = "billingAmount", source = "authorize.billingAmount.value")
    @Mapping(target = "billingAmountCurrency", source = "authorize.billingAmount.currency")
    @Mapping(target = "billingAmountRate", source = "authorize.billingAmount.rate")
    @Mapping(target = "cardholderAmount", source = "authorize.cardholderAmount.value")
    @Mapping(target = "cardholderAmountCurrency", source = "authorize.cardholderAmount.currency")
    @Mapping(target = "cardholderAmountRate", source = "authorize.cardholderAmount.rate")
    @Mapping(target = "transactionFee", source = "authorize.transactionFee.value")
    @Mapping(target = "transactionFeeCurrency", source = "authorize.transactionFee.currency")
    @Mapping(target = "cashBackAmount", source = "authorize.cashBackAmount.value")
    @Mapping(target = "cashBackAmountCurrency", source = "authorize.cashBackAmount.currency")
    @Mapping(target = "settlementAmount", source = "authorize.settlementAmount.value")
    @Mapping(target = "settlementAmountCurrency", source = "authorize.settlementAmount.currency")
    @Mapping(target = "settlementAmountRate", source = "authorize.settlementAmount.rate")
    @Mapping(target = ".", source = "authorize.riskActions")
    @Mapping(target = ".", source = "authorize.securityChecks")
    AuthorizeItem toAuthorizeItem(Authorize authorize);

    default List<AuthorizeItem> toAuthorizeItemList(Authorizes authorizes) {
        if (authorizes == null) {
            return Collections.emptyList();
        }

        List<Authorize> authorizeList = authorizes.getAuthorizes();

        if (authorizeList == null || authorizeList.isEmpty()) {
            return Collections.emptyList();
        }

        return authorizeList.stream()
                .map(this::toAuthorizeItem)
                .collect(Collectors.toList());
    }
}
