package Model;
public class Fruit {
    private static int tempId = 1;
    private int ID;
    private String Name;
    private Double Price;
    private int Quantity;
    private String Origin;
    
    public Fruit() {}
    
    public Fruit(String Name, Double Price, int quantity, String Origin) {
        this.ID = tempId++;         //tự động tăng id
        this.Name = Name;
        this.Price = Price;
        this.Quantity = quantity;
        this.Origin = Origin;
    }
    
    public int getID() {
        return ID;
    }

    public void setFruit(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quanlity) {
        this.Quantity = quanlity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
    @Override
    public String toString() {
        return "Fruit{" + "ID=" + ID + ", Name=" + Name + ", Price=" + Price + ", quanlity=" + Quantity + ", Origin=" + Origin + '}';
    }
    
}
