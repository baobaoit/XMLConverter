package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.CardItem;
import com.hesmantech.ewmxmltool.xml.data.cards.Account;
import com.hesmantech.ewmxmltool.xml.data.cards.Accounts;
import com.hesmantech.ewmxmltool.xml.data.cards.BankAccount;
import com.hesmantech.ewmxmltool.xml.data.cards.BankAccounts;
import com.hesmantech.ewmxmltool.xml.data.cards.Card;
import com.hesmantech.ewmxmltool.xml.data.cards.CardEvents;
import com.hesmantech.ewmxmltool.xml.data.cards.Cards;
import org.apache.commons.collections4.CollectionUtils;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface CardMapper {

    CardMapper INSTANCE = Mappers.getMapper(CardMapper.class);

    /**
     * Converts a {@code Card} to a {@code CardItem} without considering associated accounts.
     * If the given {@code Card} is null, the method returns a CardItem without any account details.
     *
     * @param card The {@code Card} to be converted.
     * @return A {@code CardItem} representing the provided {@code Card} without considering associated accounts.
     * If the {@code Card} is null, returns a CardItem without any account details.
     * @see Card
     * @see CardItem
     */
    CardItem toCardItemWithoutAccounts(Card card);

    /**
     * Converts a {@code Cards} object to a list of {@code CardItem}s.
     * If the given {@code Cards} object or its card list is null or empty, returns an empty list.
     *
     * @param cards The {@code Cards} object to be converted.
     * @return A list of {@code CardItem}s representing the provided {@code Cards} object.
     * If the {@code Cards} object or its card list is null or empty, returns an empty list.
     * @see Cards
     * @see CardItem
     */
    default List<CardItem> toCardItemList(Cards cards) {
        if (cards == null || CollectionUtils.emptyIfNull(cards.getCards()).isEmpty()) {
            return Collections.emptyList();
        }

        return cards.getCards()
                .stream()
                .flatMap(card -> processCard(card).stream())
                .collect(Collectors.toList());
    }

    /**
     * Processes a single {@code Card} by converting it to a list of {@code CardItem}s,
     * considering associated accounts and card events.
     *
     * @param card The {@code Card} to be processed.
     * @return A list of {@code CardItem}s representing the provided {@code Card}.
     * @see Card
     * @see CardItem
     */
    default List<CardItem> processCard(Card card) {
        List<String> cardEvents = Optional.ofNullable(card.getCardEvents())
                .map(CardEvents::getEvents)
                .orElse(Collections.emptyList());

        List<Account> accountList = Optional.ofNullable(card.getAccounts())
                .map(Accounts::getAccounts)
                .orElse(Collections.emptyList());

        if (accountList.isEmpty()) {
            return processCardEvents(card, cardEvents);
        }

        return accountList.stream()
                .flatMap(account -> processAccount(card, account, cardEvents).stream())
                .collect(Collectors.toList());
    }

    /**
     * Processes card events for a given {@code Card}, converting it to a list of {@code CardItem}s.
     *
     * @param card       The {@code Card} for which card events are processed.
     * @param cardEvents The list of card events associated with the card.
     * @return A list of {@code CardItem}s representing the provided {@code Card} with card events.
     * @see Card
     * @see CardItem
     */
    default List<CardItem> processCardEvents(Card card, List<String> cardEvents) {
        if (cardEvents.isEmpty()) {
            return Collections.singletonList(toCardItemWithoutAccounts(card));
        }

        return cardEvents.stream()
                .map(cardEvent -> {
                    CardItem cardItem = toCardItemWithoutAccounts(card);
                    cardItem.setCardEvent(cardEvent);
                    return cardItem;
                })
                .collect(Collectors.toList());
    }

    /**
     * Processes a single {@code Account} associated with a {@code Card},
     * converting it to a list of {@code CardItem}s, considering associated bank accounts and card events.
     *
     * @param card       The {@code Card} to which the account belongs.
     * @param account    The {@code Account} to be processed.
     * @param cardEvents The list of card events associated with the card.
     * @return A list of {@code CardItem}s representing the provided {@code Account}.
     * @see Card
     * @see Account
     * @see CardItem
     */
    default List<CardItem> processAccount(Card card, Account account, List<String> cardEvents) {
        List<BankAccount> bankAccountList = Optional.ofNullable(account.getBankAccounts())
                .map(BankAccounts::getBankAccounts)
                .orElse(Collections.emptyList());

        if (bankAccountList.isEmpty()) {
            return processAccountEvents(card, account, cardEvents);
        }

        return bankAccountList.stream()
                .flatMap(bankAccount -> processBankAccount(card, account, bankAccount, cardEvents).stream())
                .collect(Collectors.toList());
    }

    /**
     * Converts a {@code Card} and an associated {@code Account} to a {@code CardItem}
     * without considering bank accounts. If the given {@code Card} or {@code Account}
     * is null, the method returns a CardItem without any account details.
     *
     * @param card    The {@code Card} to be converted.
     * @param account The associated {@code Account} to be converted.
     * @return A {@code CardItem} representing the provided {@code Card} and {@code Account}
     * without considering bank accounts. If either the {@code Card} or {@code Account} is null,
     * returns a CardItem without any account details.
     * @see Card
     * @see Account
     * @see CardItem
     */
    default CardItem toCardItemWithoutBankAccount(Card card, Account account) {
        CardItem cardItem = toCardItemWithoutAccounts(card);

        cardItem.setAccountId(account.getAccountId());
        cardItem.setAccountStatus(account.getAccountStatus());
        cardItem.setAccountStatusDate(account.getAccountStatusDate());
        cardItem.setAccountStatusChangeSource(account.getAccountStatusChangeSource());
        cardItem.setAccountStatusChangeReasonCode(account.getAccountStatusChangeReasonCode());
        cardItem.setAccountStatusChangeNote(account.getAccountStatusChangeNote());
        cardItem.setAccountStatusChangeOriginatorId(account.getAccountStatusChangeOriginatorId());
        cardItem.setAccountLimitsGroupName(account.getAccountLimitsGroupName());
        cardItem.setAccountLimitsGroupId(account.getAccountLimitsGroupId());
        cardItem.setAccountFeeGroupName(account.getAccountFeeGroupName());
        cardItem.setAccountFeeGroupId(account.getAccountFeeGroupId());
        cardItem.setAvailableBalance(account.getAvailableBalance());
        cardItem.setBlockedAmount(account.getBlockedAmount());
        cardItem.setCurrentBalance(account.getCurrentBalance());
        cardItem.setReservedBalance(account.getReservedBalance());
        cardItem.setAccountCurrency(account.getAccountCurrency());

        return cardItem;
    }

    /**
     * Processes account events for a given {@code Card} and {@code Account},
     * converting it to a list of {@code CardItem}s.
     *
     * @param card       The {@code Card} to which the account belongs.
     * @param account    The {@code Account} for which account events are processed.
     * @param cardEvents The list of card events associated with the card.
     * @return A list of {@code CardItem}s representing the provided {@code Account} with card events.
     * @see Card
     * @see Account
     * @see CardItem
     */
    default List<CardItem> processAccountEvents(Card card, Account account, List<String> cardEvents) {
        if (cardEvents.isEmpty()) {
            return Collections.singletonList(toCardItemWithoutBankAccount(card, account));
        }

        return cardEvents.stream()
                .map(cardEvent -> {
                    CardItem cardItem = toCardItemWithoutBankAccount(card, account);
                    cardItem.setCardEvent(cardEvent);
                    return cardItem;
                })
                .collect(Collectors.toList());
    }

    /**
     * Processes a single {@code BankAccount} associated with a {@code Card} and {@code Account},
     * converting it to a list of {@code CardItem}s, considering associated card events.
     *
     * @param card        The {@code Card} to which the account belongs.
     * @param account     The {@code Account} to which the bank account belongs.
     * @param bankAccount The {@code BankAccount} to be processed.
     * @param cardEvents  The list of card events associated with the card.
     * @return A list of {@code CardItem}s representing the provided {@code BankAccount}.
     * @see Card
     * @see Account
     * @see BankAccount
     * @see CardItem
     */
    default List<CardItem> processBankAccount(Card card, Account account, BankAccount bankAccount, List<String> cardEvents) {
        if (cardEvents.isEmpty()) {
            CardItem cardItem = toCardItemWithoutBankAccount(card, account);
            addBankAccount(cardItem, bankAccount);
            return Collections.singletonList(cardItem);
        }

        return cardEvents.stream()
                .map(cardEvent -> {
                    CardItem cardItem = toCardItemWithoutBankAccount(card, account);
                    addBankAccount(cardItem, bankAccount);
                    cardItem.setCardEvent(cardEvent);
                    return cardItem;
                })
                .collect(Collectors.toList());
    }

    /**
     * Adds bank account details from the provided {@code BankAccount} to the given {@code CardItem}.
     * This method is intended for use exclusively within the context of the {@code toCardItemList} function.
     *
     * @param cardItem    The {@code CardItem} to which bank account details will be added.
     * @param bankAccount The {@code BankAccount} containing the bank account details to be added.
     * @implNote This method is intended for use only within the {@code toCardItemList} function
     * and should not be invoked outside of that context.
     * @see CardItem
     * @see BankAccount
     * @see #toCardItemList(Cards)
     */
    default void addBankAccount(CardItem cardItem, BankAccount bankAccount) {
        cardItem.setBankAccountNumber(bankAccount.getBankAccountNumber());
        cardItem.setBankAccountSortCode(bankAccount.getBankAccountSortCode());
        cardItem.setBankAccountIban(bankAccount.getBankAccountIban());
        cardItem.setBankAccountBic(bankAccount.getBankAccountBic());
        cardItem.setBankAccountStatus(bankAccount.getBankAccountStatus());
        cardItem.setBankAccountDirectDebitsIn(bankAccount.getBankAccountDirectDebitsIn());
        cardItem.setBankAccountDirectDebitsOut(bankAccount.getBankAccountDirectDebitsOut());
        cardItem.setBankAccountInstantPaymentsIn(bankAccount.getBankAccountInstantPaymentsIn());
        cardItem.setBankAccountInstantPaymentsOut(bankAccount.getBankAccountInstantPaymentsOut());
    }
}
