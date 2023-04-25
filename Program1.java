import java.util.Locale;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.next();
        p.setName(name);
        sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextInt();
        p.setPrice(price);
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        p.setQuantity(quantity);
        Product product = new Product(name, price, quantity);
        
        System.out.println("Product data: "+product.toString());
        System.out.println("Enter the number of products to be added in stock: ");
        int quan = sc.nextInt();
        product.addProduct(quan);

        System.out.println("Enter the number of products to be removed from stock: ");
        int remov = sc.nextInt();
        product.removeProducts(remov);
        System.out.println("Update data: "+product.toString());

        sc.close();

    }
}
