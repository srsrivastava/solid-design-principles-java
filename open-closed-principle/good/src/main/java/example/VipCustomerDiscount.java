package example;

public class VipCustomerDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.20;
    }
}