import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Product extends Program1 {
    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double totaValueInStock() {
        return price * quantity;

    }

    public void addProduct(int quantity) {
        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + ", Total: $ "
                + String.format("%.2f", totaValueInStock());

    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public double price() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
