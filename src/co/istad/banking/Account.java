package co.istad.banking;

public abstract class Account {
    private Integer number;
    private String name;
    private Double balance;
    public Account(){}
    public Account(Integer number, String name, Double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    protected void deposit(Double amount) {
        if (amount < 0) {
            System.out.println("Yey leng yy ment ?");
            return;
        }
        if (amount == 0) {
            System.out.println("You can not deposit ");
            return;
        }
        balance += amount;
    }

    protected void withdrawal(Double amount) {
        if (amount < 0) {
            System.out.println("Your amount is negative ");
            return;
        }
        if (amount == 0) {
            System.out.println("You can not deposit ");
            return;
        }
        if (amount > balance) {
            System.out.println("Insuficient balance");
            return;
        }
        balance -= amount;
    }

    protected abstract void showBalance();
}
