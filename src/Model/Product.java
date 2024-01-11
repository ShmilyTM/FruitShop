package Model;

import View.Validation;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<Fruit> listOfFruit  = new ArrayList<>();
    private Validation val = new Validation();
    private FileManager file = new FileManager();

    public Product() {
    }
    
    public boolean isEmptyProduct() {
        return (listOfFruit == null);
    }
    
    public void addFruit() {
        int id = listOfFruit.size() + 1;
        String name = val.getAndValidValue(">Enter fruit name: ", "[\\pL ]+", "Fruit name just contain letter");
        for (Fruit fruit : listOfFruit) {
            if(fruit.getName().equals(name)) { System.out.println("This fruit is available!");   return; }
        }
        
        double price = val.getAndValidMoney(">Enter price of fruit: ");
        int quality = val.getInt("Enter quanlity: ");
        String origin = val.getAndValidValue(">Enter fruit origin: ", "[\\pL ]+", "Origin just contain letter");
        listOfFruit.add(new Fruit(id, name, price, quality, origin));
    //    writeInFile();
    }
    
    public void showFruitManage() {
        System.out.println("|+Iteam+| +++Fruit Name+++ | +++Origin+++ | +++Price+++ |");
        for (Fruit fruit : listOfFruit) {
            System.out.printf("|%-7d| %-16s | %-12s | %-11.3f |\n",
                    fruit.getID(), fruit.getName(), fruit.getOrigin(), fruit.getPrice() );
        }
    }
    
    public Fruit searchFruit(String name){
        for (Fruit fruit : listOfFruit) {
            if(fruit.getName().equalsIgnoreCase(name)) {return fruit;}
        }
        return null;
    }
    
    public void updateQuantity(String name, int newQuantity) {
        Fruit temp = searchFruit(name);
        if(temp == null) {
            System.out.println("Can't find that fruit!");
        } else {        //nếu nó ko đổi thì chạy search trực tiếp trong hàm này
            temp.setQuanlity(newQuantity);
        }
    }
    
    //getFromFile
    
    //writeInFile
    
}
