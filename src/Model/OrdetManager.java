
package Model;

import View.Validation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrdetManager {
    private List<Order> listOrder = new ArrayList<>();
    private Product pr = new Product();
    private Validation val = new Validation();
    private FileManager file = new FileManager();

    public void Ordering(Map<Fruit, Integer> order) {
        String name = Validation.getString(">Enter your name: ");
        for (Order customer : listOrder) {
            if(customer.getCustomer().equalsIgnoreCase(name)) {
                order.putAll(customer.getOrder());          //chèn map mới vào map cũ
            }
        }
    }
    
    public void showAllOrder() {
        for (Order customer : listOrder) {
            System.out.println("Customer: "+ customer.getCustomer());
            System.out.println("|  Product  | Quantity |   Price   | Amount");
            for (Map.Entry<Fruit, Integer> entry : customer.getOrder().entrySet()) {
                Fruit fruit = entry.getKey();
                int quantity = entry.getValue();
                System.out.printf("|%-11s| %-10d | %-11.3f | %.3f |",
                     fruit.getName(), quantity, fruit.getPrice(), (quantity * fruit.getPrice()) );
            }
            System.out.println();
        }
    }
    
}
