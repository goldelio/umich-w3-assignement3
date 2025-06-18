

public class QuantityObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCount() > 5) {
            order.setShippingCost(0.0);
            System.out.println("QuantityObserver: Free shipping applied for order with more than 5 items");
        } else {
            order.setShippingCost(10.0);
        }
    }
}