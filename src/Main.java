import co.istad.banking.Account;
import co.istad.banking.BankProgram;
import co.istad.banking.CreditCard;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("Apple");
        myHashSet.add("Banana");
        System.out.println("Original HashSet: " + myHashSet);
        myHashSet.remove("Apple");
        myHashSet.add("Mango");
        System.out.println("Updated HashSet: " + myHashSet);
    }
}