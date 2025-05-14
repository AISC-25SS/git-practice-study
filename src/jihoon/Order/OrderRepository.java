package jihoon.Order;
import java.util.List;
import java.util.ArrayList;
public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public void save(Order order) {
        orders.add(order);
    }

    public List<Order> findAll() {
        return orders;
    }

    public Order findById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }

        }
        return null;
    }

    public void clear() {
        orders.clear();
    }
}

