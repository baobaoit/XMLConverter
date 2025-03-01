package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.BatchItem;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Batch;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Item;
import com.hesmantech.ewmxmltool.xml.data.currencyexchanges.Items;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;

class BatchMapperTests {
    BatchMapper batchMapper;

    @BeforeEach
    void init() {
        batchMapper = BatchMapper.INSTANCE;
    }

    @Test
    void initOk() {
        Assertions.assertNotNull(batchMapper);
    }

    @Test
    void toBatchItemWithoutItemListOk() {
        Batch batch = new Batch();
        batch.setId("BATCH-ID-TEST");

        Items items = new Items();
        batch.setItems(items);

        Item item = new Item();
        item.setAuthorizeId("AUTHORIZE-ID-TEST");
        items.setItems(Collections.singletonList(item));

        BatchItem batchItem = batchMapper.toBatchItemWithoutItemList(batch);

        Assertions.assertNotNull(batchItem);
        Assertions.assertEquals(batch.getId(), batchItem.getId());
    }
}
