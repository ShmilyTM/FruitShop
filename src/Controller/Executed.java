
package Controller;

import Model.Order;
import View.Menu;

public class Executed extends Menu{
//    Product pr = new Product();
    OrderManager or = new OrderManager();
    ShopManagement sm = new ShopManagement();
            
    public Executed() {
        super("-*-*-*-*-*Fruit Management*-*-*-*-*-", 
             new String[] {"Create Fruit.", "View orders", "Shopping (for buyer)",
                    "Exit!"});
    }
    
    public static void main(String[] args) {
        Executed hi = new Executed();
        hi.run();
        
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                sm.addFruit();              ///pr.addFruit();
                break;
            case 2:
                or.showAllOrder();      //in all order
                break;
            case 3:
                Order customerNew = sm.getChoiceFruit();
                customerNew = sm.printAllProductWillBuy(customerNew);
                or.Ordering(customerNew);       //lưu trữ
                break;
            case 4:
                System.out.println("Program closing!!!");
                break;
            default:
                throw new AssertionError();
        }
    }
}
