package Model;
public class Fruit {
    private int ID;
    private String Name;
    private Double Price;
    private int quanlity;
    private String Origin;
    
    public Fruit() {}
    public Fruit(int ID, String Name, Double Price, int quanlity, String Origin) {
        this.ID = ID;
        this.Name = Name;
        this.Price = Price;
        this.quanlity = quanlity;
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

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }
    @Override
    public String toString() {
        return "Fruit{" + "ID=" + ID + ", Name=" + Name + ", Price=" + Price + ", quanlity=" + quanlity + ", Origin=" + Origin + '}';
    }
    
}
