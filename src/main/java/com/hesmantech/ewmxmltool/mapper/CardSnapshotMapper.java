package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.CardSnapshotItem;
import com.hesmantech.ewmxmltool.xml.data.cards.Account;
import com.hesmantech.ewmxmltool.xml.data.cards.Accounts;
import com.hesmantech.ewmxmltool.xml.data.cards.BankAccount;
import com.hesmantech.ewmxmltool.xml.data.cards.BankAccounts;
import com.hesmantech.ewmxmltool.xml.data.cardssnapshots.CardSnapshot;
import com.hesmantech.ewmxmltool.xml.data.cardssnapshots.CardsSnapshots;
import org.apache.commons.collections4.CollectionUtils;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Mapper
public interface CardSnapshotMapper {
    CardSnapshotMapper INSTANCE = Mappers.getMapper(CardSnapshotMapper.class);

    /**
     * Maps a CardSnapshot to a CardSnapshotItem excluding account details.
     *
     * @param cardSnapshot The CardSnapshot to be mapped.
     * @return The mapped CardSnapshotItem without account details.
     */
    CardSnapshotItem toCardSnapshotItemWithoutAccounts(CardSnapshot cardSnapshot);

    /**
     * Converts a list of CardsSnapshots to a list of CardSnapshotItems, including account and bank account details.
     * If the input CardsSnapshots is null or contains no CardSnapshots, an empty list is returned.
     *
     * @param cardsSnapshots The CardsSnapshots to be converted.
     * @return A list of CardSnapshotItems with mapped details.
     */
    default List<CardSnapshotItem> toCardSnapshotItemList(CardsSnapshots cardsSnapshots) {
        if (cardsSnapshots == null || CollectionUtils.emptyIfNull(cardsSnapshots.getCardSnapshots()).isEmpty()) {
            return Collections.emptyList();
        }

        List<CardSnapshot> cardSnapshots = cardsSnapshots.getCardSnapshots();
        List<CardSnapshotItem> cardSnapshotItems = new ArrayList<>();

        for (CardSnapshot cardSnapshot : cardSnapshots) {
            List<Account> accountList = Optional.ofNullable(cardSnapshot.getAccounts())
                    .map(Accounts::getAccounts).orElse(Collections.emptyList());

            if (accountList.isEmpty()) {
                cardSnapshotItems.add(toCardSnapshotItemWithoutAccounts(cardSnapshot));
                continue;
            }

            for (Account account : accountList) {
                List<BankAccount> bankAccountList = Optional.ofNullable(account.getBankAccounts())
                        .map(BankAccounts::getBankAccounts).orElse(Collections.emptyList());

                if (bankAccountList.isEmpty()) {
                    cardSnapshotItems.add(toCardSnapshotItemWithoutBankAccount(cardSnapshot, account));
                    continue;
                }

                for (BankAccount bankAccount : bankAccountList) {
                    CardSnapshotItem cardSnapshotItem = toCardSnapshotItemWithoutBankAccount(cardSnapshot, account);
                    addBankAccount(cardSnapshotItem, bankAccount);
                    cardSnapshotItems.add(cardSnapshotItem);
                }
            }
        }

        return cardSnapshotItems;
    }

    /**
     * Maps a CardSnapshot and an Account to a CardSnapshotItem excluding bank account details.
     *
     * @param cardSnapshot The CardSnapshot to be mapped.
     * @param account      The Account associated with the CardSnapshot.
     * @return The mapped CardSnapshotItem without bank account details.
     */
    default CardSnapshotItem toCardSnapshotItemWithoutBankAccount(CardSnapshot cardSnapshot, Account account) {
        CardSnapshotItem cardSnapshotItem = toCardSnapshotItemWithoutAccounts(cardSnapshot);

        cardSnapshotItem.setAccountId(account.getAccountId());
        cardSnapshotItem.setAccountStatus(account.getAccountStatus());
        cardSnapshotItem.setAccountStatusDate(account.getAccountStatusDate());
        cardSnapshotItem.setAccountStatusChangeSource(account.getAccountStatusChangeSource());
        cardSnapshotItem.setAccountStatusChangeReasonCode(account.getAccountStatusChangeReasonCode());
        cardSnapshotItem.setAccountStatusChangeNote(account.getAccountStatusChangeNote());
        cardSnapshotItem.setAccountStatusChangeOriginatorId(account.getAccountStatusChangeOriginatorId());
        cardSnapshotItem.setAccountLimitsGroupName(account.getAccountLimitsGroupName());
        cardSnapshotItem.setAccountLimitsGroupId(account.getAccountLimitsGroupId());
        cardSnapshotItem.setAccountFeeGroupName(account.getAccountFeeGroupName());
        cardSnapshotItem.setAccountFeeGroupId(account.getAccountFeeGroupId());
        cardSnapshotItem.setAvailableBalance(account.getAvailableBalance());
        cardSnapshotItem.setBlockedAmount(account.getBlockedAmount());
        cardSnapshotItem.setCurrentBalance(account.getCurrentBalance());
        cardSnapshotItem.setReservedBalance(account.getReservedBalance());
        cardSnapshotItem.setAccountCurrency(account.getAccountCurrency());

        return cardSnapshotItem;
    }

    /**
     * Adds bank account details to an existing CardSnapshotItem.
     *
     * @param cardSnapshotItem The CardSnapshotItem to which bank account details will be added.
     * @param bankAccount      The BankAccount whose details will be added.
     */
    default void addBankAccount(CardSnapshotItem cardSnapshotItem, BankAccount bankAccount) {
        cardSnapshotItem.setBankAccountNumber(bankAccount.getBankAccountNumber());
        cardSnapshotItem.setBankAccountSortCode(bankAccount.getBankAccountSortCode());
        cardSnapshotItem.setBankAccountIban(bankAccount.getBankAccountIban());
        cardSnapshotItem.setBankAccountBic(bankAccount.getBankAccountBic());
        cardSnapshotItem.setBankAccountStatus(bankAccount.getBankAccountStatus());
        cardSnapshotItem.setBankAccountDirectDebitsIn(bankAccount.getBankAccountDirectDebitsIn());
        cardSnapshotItem.setBankAccountDirectDebitsOut(bankAccount.getBankAccountDirectDebitsOut());
        cardSnapshotItem.setBankAccountInstantPaymentsIn(bankAccount.getBankAccountInstantPaymentsIn());
        cardSnapshotItem.setBankAccountInstantPaymentsOut(bankAccount.getBankAccountInstantPaymentsOut());
    }
}
