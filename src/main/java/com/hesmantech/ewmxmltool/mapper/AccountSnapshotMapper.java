package com.hesmantech.ewmxmltool.mapper;

import com.hesmantech.ewmxmltool.service.report.data.AccountSnapshotItem;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.AccountSnapshot;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.AccountsSnapshots;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.BankAccount;
import com.hesmantech.ewmxmltool.xml.data.accountssnapshots.BankAccounts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class AccountSnapshotMapper {
    private AccountSnapshotMapper() {

    }

    public static AccountSnapshotMapper getInstance() {
        return AccountSnapshotMapperHolder.INSTANCE;
    }

    public List<AccountSnapshotItem> toAccountSnapshotItems(AccountsSnapshots accountsSnapshots) {
        if (accountsSnapshots == null) {
            return Collections.emptyList();
        }

        List<AccountSnapshot> accountSnapshots = accountsSnapshots.getAccountSnapshots();

        if (accountSnapshots == null || accountSnapshots.isEmpty()) {
            return Collections.emptyList();
        }

        List<AccountSnapshotItem> accountSnapshotItems = new ArrayList<>();

        for (AccountSnapshot accountSnapshot : accountSnapshots) {
            List<BankAccount> bankAccounts = Optional.ofNullable(accountSnapshot.getBankAccounts())
                    .map(BankAccounts::getBankAccounts).orElse(Collections.emptyList());

            if (bankAccounts.isEmpty()) {
                accountSnapshotItems.add(toAccountSnapshotItemWithoutBankAccount(accountSnapshot));
                continue;
            }

            for (BankAccount bankAccount : bankAccounts) {
                AccountSnapshotItem item = toAccountSnapshotItemWithoutBankAccount(accountSnapshot);
                item.setBankAccount(toBankAccountMap(bankAccount));
                accountSnapshotItems.add(item);
            }
        }

        return accountSnapshotItems;
    }

    private AccountSnapshotItem toAccountSnapshotItemWithoutBankAccount(AccountSnapshot accountSnapshot) {
        AccountSnapshotItem item = new AccountSnapshotItem();

        item.setFileDate(accountSnapshot.getFileDate());
        item.setWorkDate(accountSnapshot.getWorkDate());
        item.setAccountId(accountSnapshot.getAccountId());
        item.setHolderId(accountSnapshot.getHolderId());
        item.setProgramId(accountSnapshot.getProgramId());
        item.setCurrencyIson(accountSnapshot.getCurrencyIson());
        item.setAvailableBalance(accountSnapshot.getAvailableBalance());
        item.setSettledBalance(accountSnapshot.getSettledBalance());
        item.setAccountStatus(accountSnapshot.getAccountStatus());
        item.setAccountStatusDescription(accountSnapshot.getAccountStatusDescription());
        item.setAccountStatusChangeDate(accountSnapshot.getAccountStatusChangeDate());
        item.setAccountStatusChangeSource(accountSnapshot.getAccountStatusChangeSource());
        item.setAccountStatusChangeReasonCode(accountSnapshot.getAccountStatusChangeReasonCode());
        item.setAccountStatusChangeNote(accountSnapshot.getAccountStatusChangeNote());
        item.setAccountStatusChangeOriginatorId(accountSnapshot.getAccountStatusChangeOriginatorId());
        item.setDateUpdated(accountSnapshot.getDateUpdated());
        item.setDateCreated(accountSnapshot.getDateCreated());

        return item;
    }

    private Map<String, String> toBankAccountMap(BankAccount bankAccount) {
        if (bankAccount == null) {
            return Collections.emptyMap();
        }

        Map<String, String> bankAccountMap = new HashMap<>();

        bankAccountMap.put("bankAccountId", bankAccount.getBankAccountId());
        bankAccountMap.put("bankAccountExternalId", bankAccount.getBankAccountExternalId());
        bankAccountMap.put("bankAccountStatus", bankAccount.getBankAccountStatus());
        bankAccountMap.put("bankAccountBankProviderId", bankAccount.getBankAccountBankProviderId());
        bankAccountMap.put("bankAccountAccountName", bankAccount.getBankAccountAccountName());
        bankAccountMap.put("bankAccountAccountNumber", bankAccount.getBankAccountAccountNumber());
        bankAccountMap.put("bankAccountSortCode", bankAccount.getBankAccountSortCode());
        bankAccountMap.put("bankAccountIban", bankAccount.getBankAccountIban());
        bankAccountMap.put("bankAccountBic", bankAccount.getBankAccountBic());
        bankAccountMap.put("bankAccountStatusChangeReasonCode", bankAccount.getBankAccountStatusChangeReasonCode());
        bankAccountMap.put("bankAccountStatusChangeNote", bankAccount.getBankAccountStatusChangeNote());
        bankAccountMap.put("bankAccountStatusChangeSource", bankAccount.getBankAccountStatusChangeSource());

        return bankAccountMap;
    }

    private static class AccountSnapshotMapperHolder {
        private static final AccountSnapshotMapper INSTANCE = new AccountSnapshotMapper();
    }
}
