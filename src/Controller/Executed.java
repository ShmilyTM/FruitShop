
package Controller;

import Model.Product;
import view.Menu;

public class Executed extends Menu{
    Product pr = new Product();
    
    public Executed() {
        super("-*-*-*-*-*Round-Robin*-*-*-*-*-", new String[] {"Enter process.", 
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
                pr.addFruit();
                break;
            case 2:
                pr.showFruitManage();
                break;
            case 3:
                System.out.println("close!");
                break;
            default:
                throw new AssertionError();
        }
    }
}
