package example;

public class OrderService {

    private final MySqlDatabase database = new MySqlDatabase();

    public void processOrder(String order) {
        database.saveOrder(order);
    }

    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.processOrder("ORDER-123");
    }
}
