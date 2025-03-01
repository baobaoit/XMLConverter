package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.CardEventItem;
import com.hesmantech.ewmxmltool.xml.data.cardsevents.CardEvent;
import com.hesmantech.ewmxmltool.xml.data.cardsevents.CardsEvents;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface CardEventMapper {
    CardEventMapper INSTANCE = Mappers.getMapper(CardEventMapper.class);

    @Mapping(target = "eventType", source = "cardEvent.event.type")
    @Mapping(target = "eventDate", source = "cardEvent.event.date")
    @Mapping(target = "eventOldCardStatus", source = "cardEvent.event.oldCardStatus")
    @Mapping(target = "eventCardStatus", source = "cardEvent.event.cardStatus")
    @Mapping(target = "eventActivationDate", source = "cardEvent.event.activationDate")
    @Mapping(target = "eventSource", source = "cardEvent.event.source")
    @Mapping(target = "eventReasonCode", source = "cardEvent.event.reasonCode")
    @Mapping(target = "eventNote", source = "cardEvent.event.note")
    @Mapping(target = "eventOriginatorId", source = "cardEvent.event.originatorId")
    CardEventItem toCardEventItem(CardEvent cardEvent);

    default List<CardEventItem> toCardEventItemList(CardsEvents cardsEvents) {
        if (cardsEvents == null) {
            return Collections.emptyList();
        }

        List<CardEvent> cardEvents = cardsEvents.getCardEvents();

        if (cardEvents == null || cardEvents.isEmpty()) {
            return Collections.emptyList();
        }

        return cardEvents.stream()
                .map(this::toCardEventItem)
                .collect(Collectors.toList());
    }
}
