package com.example.lombok;

public class TransactionDetailModel {

    private String event;
    private String expectedMessage;
    private String fromCompanyName;
    private String toCompanyName;
    private String subtransactionId;
    private String subtransactionState;
    private String subTrnasactionStartTime;
    private String subtransactionTo;
    private String subtransactionFrom;
    private String subtransactionMessage;
    private String subtransactionProtocolId;
    private boolean fieldPresent;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getExpectedMessage() {
        return expectedMessage;
    }

    public void setExpectedMessage(String expectedMessage) {
        this.expectedMessage = expectedMessage;
    }

    public String getFromCompanyName() {
        return fromCompanyName;
    }

    public void setFromCompanyName(String fromCompanyName) {
        this.fromCompanyName = fromCompanyName;
    }

    public String getToCompanyName() {
        return toCompanyName;
    }

    public void setToCompanyName(String toCompanyName) {
        this.toCompanyName = toCompanyName;
    }

    public String getSubtransactionId() {
        return subtransactionId;
    }

    public void setSubtransactionId(String subtransactionId) {
        this.subtransactionId = subtransactionId;
    }

    public String getSubtransactionState() {
        return subtransactionState;
    }

    public void setSubtransactionState(String subtransactionState) {
        this.subtransactionState = subtransactionState;
    }

    public String getSubTrnasactionStartTime() {
        return subTrnasactionStartTime;
    }

    public void setSubTrnasactionStartTime(String subTrnasactionStartTime) {
        this.subTrnasactionStartTime = subTrnasactionStartTime;
    }

    public String getSubtransactionTo() {
        return subtransactionTo;
    }

    public void setSubtransactionTo(String subtransactionTo) {
        this.subtransactionTo = subtransactionTo;
    }

    public String getSubtransactionFrom() {
        return subtransactionFrom;
    }

    public void setSubtransactionFrom(String subtransactionFrom) {
        this.subtransactionFrom = subtransactionFrom;
    }

    public String getSubtransactionMessage() {
        return subtransactionMessage;
    }

    public void setSubtransactionMessage(String subtransactionMessage) {
        this.subtransactionMessage = subtransactionMessage;
    }

    public String getSubtransactionProtocolId() {
        return subtransactionProtocolId;
    }

    public void setSubtransactionProtocolId(String subtransactionProtocolId) {
        this.subtransactionProtocolId = subtransactionProtocolId;
    }

    public boolean isFieldPresent() {
        return fieldPresent;
    }

    public void setFieldPresent(boolean fieldPresent) {
        this.fieldPresent = fieldPresent;
    }
}
