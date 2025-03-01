package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AccountItem;
import com.hesmantech.ewmxmltool.xml.data.accounts.Account;
import com.hesmantech.ewmxmltool.xml.data.accounts.Card;
import com.hesmantech.ewmxmltool.xml.data.accounts.Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AccountMapper {
    private AccountMapper() {

    }

    public static AccountMapper getInstance() {
        return AccountMapperHolder.INSTANCE;
    }

    public List<AccountItem> toAccountItems(List<Account> accounts) {
        if (accounts == null || accounts.isEmpty()) {
            return Collections.emptyList();
        }

        List<AccountItem> accountItems = new ArrayList<>();

        for (Account account : accounts) {
            List<Card> cardList = Optional.ofNullable(account.getCards())
                    .map(Cards::getCards).orElse(Collections.emptyList());

            if (cardList.isEmpty()) {
                accountItems.add(toAccountItemWithoutCard(account));
                continue;
            }

            for (Card card : cardList) {
                AccountItem item = toAccountItemWithoutCard(account);
                item.setCards(toCardMap(card));
                accountItems.add(item);
            }
        }

        return accountItems;
    }

    private AccountItem toAccountItemWithoutCard(Account account) {
        AccountItem item = new AccountItem();

        item.setAccountId(account.getAccountId());
        item.setHolderId(account.getHolderId());
        item.setProgramId(account.getProgramId());
        item.setCurrencyIson(account.getCurrencyIson());
        item.setAvailableBalance(account.getAvailableBalance());
        item.setSettledBalance(account.getSettledBalance());
        item.setReservedBalance(account.getReservedBalance());
        item.setAccountStatus(account.getAccountStatus());
        item.setAccountStatusDate(account.getAccountStatusDate());
        item.setAccountStatusChangeSource(account.getAccountStatusChangeSource());
        item.setAccountStatusChangeReasonCode(account.getAccountStatusChangeReasonCode());
        item.setAccountStatusChangeNote(account.getAccountStatusChangeNote());
        item.setAccountStatusChangeOriginatorId(account.getAccountStatusChangeOriginatorId());
        item.setDateUpdated(account.getDateUpdated());

        return item;
    }

    private Map<String, String> toCardMap(Card card) {
        if (card == null) {
            return Collections.emptyMap();
        }

        Map<String, String> cardMap = new HashMap<>();

        cardMap.put("cardId", card.getCardId());
        cardMap.put("virtual", card.getVirtual());
        cardMap.put("primary", card.getPrimary());
        cardMap.put("cardProductId", card.getCardProductId());
        cardMap.put("cardProgramId", card.getCardProgramId());
        cardMap.put("referenceId", card.getReferenceId());
        cardMap.put("holderId", card.getHolderId());
        cardMap.put("currencyIson", card.getCurrencyIson());
        cardMap.put("status", card.getStatus());
        cardMap.put("statusDate", card.getStatusDate());
        cardMap.put("statusChangeSource", card.getStatusChangeSource());
        cardMap.put("statusChangeReasonCode", card.getStatusChangeReasonCode());
        cardMap.put("statusChangeNote", card.getStatusChangeNote());
        cardMap.put("statusChangeOriginatorId", card.getStatusChangeOriginatorId());
        cardMap.put("expiryDate", card.getExpiryDate());

        return cardMap;
    }

    private static class AccountMapperHolder {
        private static final AccountMapper INSTANCE = new AccountMapper();
    }
}
