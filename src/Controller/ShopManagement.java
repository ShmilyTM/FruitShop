package Controller;

import Model.Fruit;
import java.util.ArrayList;
import java.util.Scanner;

public class ShopManagement {
    public ArrayList<Fruit> listFruit = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void printList() {
        for (Fruit i : listFruit) {
            System.out.println(i.toString());
        }
        System.out.println("ShopManager: " + listFruit.size());
    }
    public String UpdateFruit(){
        String Fruit;
        do{
            System.out.print("Enter Fruit: ");
            Fruit = sc.nextLine();
            if(Fruit.isEmpty())
                System.out.println("Invalid value!");
        }while(Fruit.isEmpty());    
        return Fruit;
    }
    public String InputID(){
        String ID;
        do{
            System.out.print("Enter ID: ");
            ID = sc.nextLine();
            if(ID.isEmpty())
                System.out.println("Invalid value!");
        }while(ID.isEmpty());    
        return ID;
    }
        public int Number(){
        int Number;
            System.out.print("Enter Number: ");
            Number = sc.nextInt();  
        return Number; 
    }
}      
