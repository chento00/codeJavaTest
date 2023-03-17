package co.istad.banking;

public class DollarRate implements Interests{
    @Override
    public Double calcaulate(Double amount) {
        return amount*0.5;
    }
}
