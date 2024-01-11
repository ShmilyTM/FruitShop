package View;

import java.util.Scanner;

public static class Validation {
    public String getValue(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("msg");
        return sc.nextLine().trim();
    }
    public String getAndValidValue(String msg, String regex, String cause) {
        String value;
        while (true) {
            try {
                value = getValue(msg);
                if (value.isEmpty()) {
                    throw new Exception("Input cannot empty");
                }
                break;
            }catch(Exception e) {
                System.out.println{e.getMessage());
            }
            return value;
        }
    public double getAndValidMoney(String msg) {
        String Money;
        while(true) {
            try {
                Money = getAndValidValue(msg);
                if(Double.paraseDouble(Money) <= 0)
                    throw new Exveption ("Amout of money is a positive number");
                return Double.parseDouble(Money);
            }catch (NumberFormatEXception e ) {
                System.out.println("invalid amount of money"); 
            }catch(Exception ex) {
                System.out.println{ex.getMessage);
            }
        }    
    }        
            
