package example;

public class MySqlOrderRepository implements OrderRepository {

    @Override
    public void save(String order) {
        System.out.println("Saving order to MySQL: " + order);
    }
}
