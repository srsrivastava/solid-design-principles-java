package example;

public class DiscountService {

    public double calculateDiscount(String customerType, double amount) {

        if (customerType.equals("REGULAR")) {
            return amount * 0.05;
        } else if (customerType.equals("PREMIUM")) {
            return amount * 0.10;
        } else if (customerType.equals("VIP")) {
            return amount * 0.20;
        }

        return 0;
    }

    public static void main(String[] args) {
        DiscountService discountService = new DiscountService();
        System.out.println(discountService.calculateDiscount("REGULAR", 1000));
        System.out.println(discountService.calculateDiscount("PREMIUM", 1000));
        System.out.println(discountService.calculateDiscount("VIP", 1000));
    }
}