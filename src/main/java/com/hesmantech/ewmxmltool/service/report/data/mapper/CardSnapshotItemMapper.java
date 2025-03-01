package com.hesmantech.ewmxmltool.service.report.data.mapper;

import net.sf.jasperreports.engine.JRStyle;
import net.sf.jasperreports.engine.design.JRDesignExpression;
import net.sf.jasperreports.engine.design.JRDesignStaticText;
import net.sf.jasperreports.engine.design.JRDesignTextField;
import net.sf.jasperreports.engine.type.TextAdjustEnum;

import static com.hesmantech.ewmxmltool.service.report.data.mapper.constant.ItemMapperConstants.JASPER_REPORT_GET_FIELD_VALUE_FORMAT;

public final class CardSnapshotItemMapper {
    private CardSnapshotItemMapper() {

    }

    public static Integer getColumnWidth(String fieldName) {
        CardSnapshotItemField field = CardSnapshotItemField.valueFrom(fieldName);

        return field == null ? 0 : field.getWidth();
    }

    public static JRDesignStaticText getColumnHeader(String fieldName, JRStyle style) {
        JRDesignStaticText columnHeader = new JRDesignStaticText();
        columnHeader.setX(0);
        columnHeader.setY(0);
        columnHeader.setStyle(style);
        columnHeader.setBold(true);
        columnHeader.setHeight(30);

        CardSnapshotItemField field = CardSnapshotItemField.valueFrom(fieldName);

        if (field == null) {
            return columnHeader;
        }

        columnHeader.setWidth(field.getWidth());
        columnHeader.setText(field.getColumnHeaderText());

        return columnHeader;
    }

    public static JRDesignTextField getColumnDetail(String fieldName, JRStyle style) {
        JRDesignTextField textField = new JRDesignTextField();
        textField.setX(0);
        textField.setY(0);
        textField.setHeight(30);
        textField.setStyle(style);
        JRDesignExpression textFieldExpression = new JRDesignExpression();
        textField.setExpression(textFieldExpression);

        CardSnapshotItemField field = CardSnapshotItemField.valueFrom(fieldName);

        if (field == null) {
            return textField;
        }

        textField.setWidth(field.getWidth());
        textFieldExpression.setText(String.format(JASPER_REPORT_GET_FIELD_VALUE_FORMAT, field.getName()));

        switch (field) {
            case FIELD_ACCOUNT_FEE_GROUP_NAME:
            case FIELD_ACCOUNT_LIMITS_GROUP_NAME:
            case FIELD_ADDRESS:
            case FIELD_BANK_ACCOUNT_IBAN:
            case FIELD_CARD_EVENT:
            case FIELD_DELIVERY_ADDRESS:
            case FIELD_DELIVERY_FIRST_NAME:
            case FIELD_DELIVERY_LAST_NAME:
            case FIELD_EMAIL_ADDRESS:
            case FIELD_FEE_GROUP_NAME:
            case FIELD_FIRST_NAME:
            case FIELD_LAST_NAME:
            case FIELD_LIMITS_GROUP_NAME:
            case FIELD_PRODUCT_NAME:
            case FIELD_PROGRAM_NAME:
            case FIELD_USAGE_GROUP_NAME:
                textField.setTextAdjust(TextAdjustEnum.STRETCH_HEIGHT);
                break;
            default:
                break;
        }

        return textField;
    }

    private enum CardSnapshotItemField {
        FIELD_FILE_DATE("fileDate", 80, "File Date"),
        FIELD_WORK_DATE("workDate", 110, "Work Date"),
        FIELD_ISSUER_IDENTIFICATION_NUMBER("issuerIdentificationNumber", 150, "Issuer Identification Number"),
        FIELD_PROGRAM_NAME("programName", 120, "Program Name"),
        FIELD_PROGRAM_ID("programId", 80, "Program ID"),
        FIELD_PRODUCT_NAME("productName", 110, "Product Name"),
        FIELD_PRODUCT_ID("productId", 80, "Product ID"),
        FIELD_SUB_PRODUCT_ID("subProductId", 80, "Sub Product ID"),
        FIELD_HOLDER_ID("holderId", 90, "Holder ID"),
        FIELD_ACCOUNT_ID("accountId", 95, "Account ID"),
        FIELD_ACCOUNT_STATUS("accountStatus", 110, "Account Status"),
        FIELD_ACCOUNT_STATUS_DATE("accountStatusDate", 120, "Account Status Date"),
        FIELD_ACCOUNT_STATUS_CHANGE_SOURCE("accountStatusChangeSource", 150, "Account Status Change Source"),
        FIELD_ACCOUNT_STATUS_CHANGE_REASON_CODE("accountStatusChangeReasonCode", 180, "Account Status Change Reason Code"),
        FIELD_ACCOUNT_STATUS_CHANGE_NOTE("accountStatusChangeNote", 150, "Account Status Change Note"),
        FIELD_ACCOUNT_STATUS_CHANGE_ORIGINATOR_ID("accountStatusChangeOriginatorId", 180, "Account Status Change Originator ID"),
        FIELD_ACCOUNT_LIMITS_GROUP_NAME("accountLimitsGroupName", 180, "Account Limits Group Name"),
        FIELD_ACCOUNT_LIMITS_GROUP_ID("accountLimitsGroupId", 160, "Account Limits Group ID"),
        FIELD_ACCOUNT_FEE_GROUP_NAME("accountFeeGroupName", 170, "Account Fee Group Name"),
        FIELD_ACCOUNT_FEE_GROUP_ID("accountFeeGroupId", 150, "Account Fee Group ID"),
        FIELD_BANK_ACCOUNT_NUMBER("bankAccountNumber", 120, "Bank Account Number"),
        FIELD_BANK_ACCOUNT_SORT_CODE("bankAccountSortCode", 130, "Bank Account Sort Code"),
        FIELD_BANK_ACCOUNT_IBAN("bankAccountIban", 150, "Bank Account IBAN"),
        FIELD_BANK_ACCOUNT_BIC("bankAccountBic", 110, "Bank Account BIC"),
        FIELD_BANK_ACCOUNT_STATUS("bankAccountStatus", 140, "Bank Account Status"),
        FIELD_BANK_ACCOUNT_DIRECT_DEBITS_IN("bankAccountDirectDebitsIn", 180, "Bank Account Direct Debits In"),
        FIELD_BANK_ACCOUNT_DIRECT_DEBITS_OUT("bankAccountDirectDebitsOut", 190, "Bank Account Direct Debits Out"),
        FIELD_BANK_ACCOUNT_INSTANT_PAYMENTS_IN("bankAccountInstantPaymentsIn", 200, "Bank Account Instant Payments In"),
        FIELD_BANK_ACCOUNT_INSTANT_PAYMENTS_OUT("bankAccountInstantPaymentsOut", 210, "Bank Account Instant Payments Out"),
        FIELD_AVAILABLE_BALANCE("availableBalance", 150, "Available Balance"),
        FIELD_BLOCKED_AMOUNT("blockedAmount", 140, "Blocked Amount"),
        FIELD_CURRENT_BALANCE("currentBalance", 145, "Current Balance"),
        FIELD_RESERVED_BALANCE("reservedBalance", 155, "Reserved Balance"),
        FIELD_ACCOUNT_CURRENCY("accountCurrency", 130, "Account Currency"),
        FIELD_CARD_NUMBER("cardNumber", 150, "Card Number"),
        FIELD_CARD_NUMBER_ID("cardNumberId", 110, "Card Number ID"),
        FIELD_CARD_REQUEST_ID("cardRequestId", 120, "Card Request ID"),
        FIELD_IS_VIRTUAL("isVirtual", 90, "Is Virtual"),
        FIELD_CARD_EXPIRATION_DATE("cardExpirationDate", 140, "Card Expiration Date"),
        FIELD_CARD_CREATION_DATE("cardCreationDate", 135, "Card Creation Date"),
        FIELD_CARD_ACTIVATION_DATE("cardActivationDate", 145, "Card Activation Date"),
        FIELD_CARD_STATUS_DATE("cardStatusDate", 130, "Card Status Date"),
        FIELD_CARD_STATUS_CODE("cardStatusCode", 120, "Card Status Code"),
        FIELD_CARD_STATUS_CODE_DESCRIPTION("cardStatusCodeDescription", 180, "Card Status Code Description"),
        FIELD_CARD_STATUS_CHANGE_SOURCE("cardStatusChangeSource", 190, "Card Status Change Source"),
        FIELD_CARD_STATUS_CHANGE_REASON_CODE("cardStatusChangeReasonCode", 200, "Card Status Change Reason Code"),
        FIELD_CARD_STATUS_CHANGE_NOTE("cardStatusChangeNote", 180, "Card Status Change Note"),
        FIELD_CARD_STATUS_CHANGE_ORIGINATOR_ID("cardStatusChangeOriginatorId", 220, "Card Status Change Originator ID"),
        FIELD_LIMITS_GROUP_NAME("limitsGroupName", 160, "Limits Group Name"),
        FIELD_LIMITS_GROUP_ID("limitsGroupId", 120, "Limits Group ID"),
        FIELD_FEE_GROUP_NAME("feeGroupName", 150, "Fee Group Name"),
        FIELD_FEE_GROUP_ID("feeGroupId", 120, "Fee Group ID"),
        FIELD_USAGE_GROUP_NAME("usageGroupName", 160, "Usage Group Name"),
        FIELD_USAGE_GROUP_ID("usageGroupId", 130, "Usage Group ID"),
        FIELD_FIRST_NAME("firstName", 110, "First Name"),
        FIELD_LAST_NAME("lastName", 100, "Last Name"),
        FIELD_ADDRESS("address", 220, "Address"),
        FIELD_CITY("city", 90, "City"),
        FIELD_STATE("state", 100, "State"),
        FIELD_ZIP_CODE("zipCode", 110, "Zip Code"),
        FIELD_COUNTRY_CODE("countryCode", 120, "Country Code"),
        FIELD_COUNTRY_CODE_ALPHA("countryCodeAlpha", 150, "Country Code Alpha"),
        FIELD_COUNTRY_NAME("countryName", 120, "Country Name"),
        FIELD_DOB("dob", 90, "DOB"),
        FIELD_EMAIL_ADDRESS("emailAddress", 140, "Email Address"),
        FIELD_PHONE_NUMBER("phoneNumber", 130, "Phone Number"),
        FIELD_PHONE_NUMBER_COUNTRY_CODE("phoneNumberCountryCode", 190, "Phone Number Country Code"),
        FIELD_APPLICATION_IP_ADDRESS("applicationIpAddress", 200, "Application IP Address"),
        FIELD_KYC_VERIFICATION("kycVerification", 150, "KYC Verification"),
        FIELD_CARD_EVENT("cardEvent", 300, "Card Event"),
        FIELD_DEFAULT_CARD_CURRENCY("defaultCardCurrency", 180, "Default Card Currency"),
        FIELD_NETWORK("network", 100, "Network"),
        FIELD_DELIVERY_TITLE("deliveryTitle", 110, "Delivery Title"),
        FIELD_DELIVERY_FIRST_NAME("deliveryFirstName", 160, "Delivery First Name"),
        FIELD_DELIVERY_LAST_NAME("deliveryLastName", 150, "Delivery Last Name"),
        FIELD_DELIVERY_ADDRESS("deliveryAddress", 220, "Delivery Address"),
        FIELD_DELIVERY_CITY("deliveryCity", 130, "Delivery City"),
        FIELD_DELIVERY_STATE("deliveryState", 120, "Delivery State"),
        FIELD_DELIVERY_ZIP_CODE("deliveryZipCode", 140, "Delivery Zip Code"),
        FIELD_DELIVERY_COUNTRY_CODE("deliveryCountryCode", 170, "Delivery Country Code"),
        FIELD_DELIVERY_COUNTRY_NAME("deliveryCountryName", 180, "Delivery Country Name"),
        FIELD_ACTIVE_WALLET("activeWallet", 150, "Active Wallet");

        private final String name;
        private final int width;
        private final String columnHeaderText;

        CardSnapshotItemField(String name, int width, String columnHeaderText) {
            this.name = name;
            this.width = width;
            this.columnHeaderText = columnHeaderText;
        }

        public static CardSnapshotItemField valueFrom(String fieldName) {
            for (CardSnapshotItemField value : CardSnapshotItemField.values()) {
                if (value.name.equals(fieldName)) {
                    return value;
                }
            }
            return null;
        }

        public String getName() {
            return name;
        }

        public int getWidth() {
            return width;
        }

        public String getColumnHeaderText() {
            return columnHeaderText;
        }
    }
}
