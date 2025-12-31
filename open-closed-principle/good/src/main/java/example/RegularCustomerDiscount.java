package example;

public class RegularCustomerDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}