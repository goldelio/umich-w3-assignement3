

public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        if (order.getItemCost() > 200) {
            order.setDiscount(20.0);
            System.out.println("PriceObserver: Applied $20 discount for order over $200");
        }
    }
}