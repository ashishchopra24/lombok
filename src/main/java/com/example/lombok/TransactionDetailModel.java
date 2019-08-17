package com.example.lombok;

import lombok.Data;

@Data
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


}
