package co.istad.banking;

public class RielRate implements Interests{
    @Override
    public Double calcaulate(Double amount) {
        return amount*0.9;
    }
}
