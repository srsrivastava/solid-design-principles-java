package example;

public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void processOrder(String order) {
        orderRepository.save(order);
    }

    public static void main(String[] args) {

        OrderRepository repository = new MySqlOrderRepository();
        OrderService service = new OrderService(repository);

        service.processOrder("ORDER-123");
    }
}
