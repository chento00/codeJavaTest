package co.istad.banking;

public class SavingAccount extends Account implements Interests{
    private Double interest;
    private Interests interestI;

    public SavingAccount(Integer number, String name, Double balance) {
        super(number, name, balance);
    }

    public SavingAccount(){
        setInterestI(new Interests() {
            @Override
            public Double calcaulate(Double amount) {
                return amount*0.02;
            }
        });
    }
    class DefaultInterest implements Interests{
        @Override
        public Double calcaulate(Double amount) {
            return amount*0.02;
        }
    }
    public void setInterestI(Interests interestI) {
        this.interestI = interestI;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    @Override
    public void showBalance() {
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Act No : "+getNumber());
        System.out.println("Act Name : "+getName());
        System.out.println("Balance : "+getBalance());
        System.out.println("Interest  : " + interest);
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
    }
    public void calculateInterest(){
       interest= interestI.calcaulate(getBalance());
    }
    @Override
    public Double calcaulate(Double amount) {
        return null;
    }
}
