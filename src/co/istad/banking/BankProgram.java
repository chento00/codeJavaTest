package co.istad.banking;

import co.istad.banking.database.Database;

public class BankProgram {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.setNumber(1001);
        creditCard.setPin(2002);


        // check credit card exit or not
        if(Database.creditCard().getNumber().equals(creditCard.getNumber())){
            creditCard=Database.creditCard();
        }else{
            System.out.println("Invalid card...");
            return;
        }
        creditCard.deposit(100.0);
        creditCard.withdrawal(1000.0);
        creditCard.withdrawal();
        creditCard.showBalance();


        SavingAccount savingAccount1=Database.savingAccount();

        savingAccount1.setInterestI(new DollarRate());
        savingAccount1.calculateInterest();
        System.out.println(savingAccount1.getInterest());
        savingAccount1.showBalance();

    }
}
