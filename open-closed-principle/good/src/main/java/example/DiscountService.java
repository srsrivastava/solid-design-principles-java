package example;

public class DiscountService {

    private final DiscountStrategy discountStrategy;

    public DiscountService(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(double amount) {
        return discountStrategy.calculate(amount);
    }

    public static void main(String[] args) {
        DiscountService regular =
                new DiscountService(new RegularCustomerDiscount());
        DiscountService premium =
                new DiscountService(new PremiumCustomerDiscount());
        DiscountService vip =
                new DiscountService(new VipCustomerDiscount());

        System.out.println(regular.calculateDiscount(1000));
        System.out.println(premium.calculateDiscount(1000));
        System.out.println(vip.calculateDiscount(1000));
    }
}