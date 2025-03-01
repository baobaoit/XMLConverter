package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AccountActivityItem;
import com.hesmantech.ewmxmltool.xml.data.accountsactivities.AccountActivity;
import com.hesmantech.ewmxmltool.xml.data.accountsactivities.AccountsActivities;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface AccountActivityMapper {
    AccountActivityMapper INSTANCE = Mappers.getMapper(AccountActivityMapper.class);

    @Mapping(target = ".", source = "accountActivity.riskActions")
    @Mapping(target = ".", source = "accountActivity.securityChecks")
    @Mapping(target = "transactionAmount", source = "accountActivity.aaTransactionAmount")
    @Mapping(target = "billingAmount", source = "accountActivity.aaBillingAmount")
    @Mapping(target = "settlementAmount", source = "accountActivity.aaSettlementAmount")
    AccountActivityItem toAccountActivityItem(AccountActivity accountActivity);

    default List<AccountActivityItem> toAccountActivityItemList(AccountsActivities accountsActivities) {
        if (accountsActivities == null) {
            return Collections.emptyList();
        }

        List<AccountActivity> accountActivities = accountsActivities.getAccountActivities();

        if (accountActivities == null || accountActivities.isEmpty()) {
            return Collections.emptyList();
        }

        return accountActivities.stream()
                .map(this::toAccountActivityItem)
                .collect(Collectors.toList());
    }
}
