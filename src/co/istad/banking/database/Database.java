package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard() {
        CreditCard creditCard=new CreditCard(1001,"Chea Chento",1000.0)  ;
        creditCard.setPin(2002);
        creditCard.setLimitAmount(1000.0);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
    public static SavingAccount savingAccount() {
        SavingAccount savingAccount=new SavingAccount(1001,"Chea Chento",1000.0)  ;
        savingAccount.setName("Chea Chento");
        savingAccount.setNumber(1001);
        return savingAccount;
    }
}
