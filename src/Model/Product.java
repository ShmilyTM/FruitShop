package Model;

import View.Validation;
import java.io.File;
import java.util.List;

public class Product
private List<Fruit> listofFruit;
Validation val = new Validation();
FileManager = new FileManager();

public Product()...8 lines)

public boolean isEmptyProduct ()1...3 lines

public void addFruit () (

int id;
String name;
39
40
double price;
int quality;
41
String origin;
42
id listofFruit.size() + 1;
43
44
name val.getAndValidValue("Enter fruit name: ", "[\\pL ]+", "Fruit name just contain letter").toUpperCase();
List<Fruit> searchList;
if ((searchList search (f->f.getName().equalsIgnoreCase (name))) != null) {
46
System.out.println("This fruit is available");
47
48
49
return;
price val.getAndValidMoney("Enter price of fruit: ");
quality= Integer.parseInt(val.getAndValidValue("Enter quanlity: ", "[\\d]", "Quanlity just contain number"));
50
51
52
origin val.getAndValidValue("Enter fruit origin: ", "[\\pL ]+", "Origin just contain letter").toUpperCase(); listofFruit.add(new Fruit (id, name, price, quality, origin));
53
54
writeInFile();
}
