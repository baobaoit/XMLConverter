package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.BatchItem;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Batch;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Fx;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Item;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Items;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Mapper
public interface BatchMapper {
    BatchMapper INSTANCE = Mappers.getMapper(BatchMapper.class);

    BatchItem toBatchItemWithoutItemList(Batch batch);

    default List<BatchItem> toBatchItemList(Fx fx) {
        if (fx == null) {
            return Collections.emptyList();
        }

        List<Batch> batchList = fx.getBatchList();

        if (batchList == null || batchList.isEmpty()) {
            return Collections.emptyList();
        }

        List<BatchItem> batchItemList = new ArrayList<>();

        for (Batch batch : batchList) {
            List<Item> itemList = Optional.ofNullable(batch.getItems())
                    .map(Items::getItems).orElse(Collections.emptyList());

            if (itemList.isEmpty()) {
                batchItemList.add(toBatchItemWithoutItemList(batch));
                continue;
            }

            for (Item item : itemList) {
                BatchItem batchItem = toBatchItemWithoutItemList(batch);

                batchItem.setItemAuthorizeId(item.getAuthorizeId());
                batchItem.setItemActualAuthorizeId(item.getActualAuthorizeId());
                batchItem.setItemTransactionId(item.getTransactionId());
                batchItem.setItemClearingFileId(item.getClearingFileId());
                batchItem.setItemProgramId(item.getProgramId());
                batchItem.setItemConversionRate(item.getConversionRate());
                batchItem.setItemFixedSide(item.getFixedSide());
                batchItem.setItemAmount(item.getAmount());
                batchItem.setItemTransLink(item.getTransLink());

                batchItemList.add(batchItem);
            }
        }

        return batchItemList;
    }
}
