package View;

import java.util.Scanner;

public class Validation {

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
                if (!value.matches(regex)) {
                    throw new Exception(cause);
                }
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return value;
    }

    public double getAndValidMoney(String msg) {
        String money;
        
        while (true) {            
            try {
                money = getAndValidValue(msg, "[\\d.]+", "Invalid amount of money");
                
                if(Double.parseDouble(money) <= 0){
                    throw new Exception("Amounr of money must a postive number");
                }
                return Double.parseDouble(money);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid amout of money!");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
