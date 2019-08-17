package com.example.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokApplication {


    public static TransactionDetailModel setData()
    {
        TransactionDetailModel model=new TransactionDetailModel();
        model.setEvent("Received Event");
        model.setFromCompanyName("TenantA");
        model.setToCompanyName("PartnerB");
        model.setSubtransactionId("25b34d706-16adf3588a3");
        model.setSubtransactionState("Success");
        model.setSubTrnasactionStartTime("17-08-2019 11:03:19 UTC");
        return model;

    }

    public static void main(String[] args) {

        SpringApplication.run(LombokApplication.class, args);
        TransactionDetailModel model=setData();
        System.out.println();System.out.println();System.out.println();System.out.println();
        System.out.println("Event Name - "+model.getEvent());
        System.out.println("From Company - "+model.getFromCompanyName());
        System.out.println("To Company - "+model.getToCompanyName());
        System.out.println("SubTransaction Id - "+model.getSubtransactionId());
        System.out.println("Sub Transaction State - "+model.getSubtransactionState());
        System.out.println("Sub Transaction Time - "+model.getSubTrnasactionStartTime());



    }

}
