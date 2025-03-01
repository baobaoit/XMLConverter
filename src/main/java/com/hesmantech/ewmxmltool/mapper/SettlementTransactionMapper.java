package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.SettlementTransactionItem;
import com.hesmantech.ewmxmltool.xml.data.settlementstransactions.SettlementTransaction;
import com.hesmantech.ewmxmltool.xml.data.settlementstransactions.SettlementsTransactions;
import org.apache.commons.collections4.CollectionUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface SettlementTransactionMapper {
    SettlementTransactionMapper INSTANCE = Mappers.getMapper(SettlementTransactionMapper.class);

    @Mapping(target = ".", source = "settlementTransaction.riskActions")
    @Mapping(target = ".", source = "settlementTransaction.securityChecks")
    @Mapping(target = "transactionAmount", source = "settlementTransaction.aaTransactionAmount")
    @Mapping(target = "billingAmount", source = "settlementTransaction.aaBillingAmount")
    @Mapping(target = "settlementAmount", source = "settlementTransaction.aaSettlementAmount")
    SettlementTransactionItem toSettlementTransactionItem(SettlementTransaction settlementTransaction);

    default List<SettlementTransactionItem> toSettlementTransactionItemList(SettlementsTransactions settlementsTransactions) {
        if (settlementsTransactions == null || CollectionUtils.emptyIfNull(settlementsTransactions.getSettlementTransactions()).isEmpty()) {
            return Collections.emptyList();
        }

        return settlementsTransactions.getSettlementTransactions()
                .stream()
                .map(this::toSettlementTransactionItem)
                .collect(Collectors.toList());
    }
}
