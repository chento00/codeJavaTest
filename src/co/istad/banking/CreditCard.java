package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class CreditCard extends Account {
    Integer pin;
    Double limitAmount;
    LocalDate thruDate;
    public CreditCard(){
        super();
    }

    public CreditCard(Integer number, String name, Double balance) {
        super(number, name, balance);
    }



    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }

    @Override
    public final void deposit(Double amount) {
        if (isExpired(thruDate)) {
            System.out.println("Card is expired");
            return;
        }

        super.deposit(amount);
    }

    @Override
    protected final void withdrawal(Double amount) {
        if (amount > limitAmount) {
            System.out.println("Over the limit amount");
            return;
        }
        if (isExpired(thruDate)) {
            System.out.println("Your card is expired ... !");
            return;
        }
        super.withdrawal(amount);
    }
    private boolean isExpired(LocalDate date){
        LocalDate today=LocalDate.now();
        return today.isAfter(date);
    }
    @Override
    public void showBalance() {
        System.out.println("==========================================");
        System.out.println("Act No : "+getNumber());
        System.out.println("Act Name : "+getName());
        System.out.println("Balance : "+getBalance());
        System.out.println("Pin : " + pin);
        System.out.println("LimitAmount : " + limitAmount);
        System.out.println("Through Date : "+thruDate);
        System.out.println("==========================================");
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "pin=" + pin +
                ", limitAmount=" + limitAmount +
                ", thruDate=" + thruDate +
                '}';
    }
    protected void withdrawal(){
        withdrawal(getBalance());
    }
}
