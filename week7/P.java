import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P{
    public static void main(String[] args) {
        ArrayList<Product> List = ProductData.getProducts();
        // desplay
        List.forEach((x)-> System.out.println(x));
        // sort by price
        System.out.println("Sorted by price:");
        java.util.List<Product> sortedByPrice = List.stream().sorted((a,b) -> a.price.compareTo(b.price)).toList();
        sortedByPrice.forEach((x)-> System.out.println(x));
        // sort by price from big to small
        System.out.println("Sorted by price from big to small:");
        List<Product> sortedByPriceDesc = List.stream().sorted((a,b)-> b.price.compareTo(a.price)).toList();
        sortedByPriceDesc.forEach((x)-> System.out.println(x));
        
    }
}


class ProductData {
    public static ArrayList<Product> getProducts() {
        return new ArrayList<>(Arrays.asList(
            new Product(1001,"Iphone 14 Pro Max", 999.99, 4.8,1200,50),
            new Product(1002,"Samsung Galaxy S23 Ultra", 1199.99, 4.7,800,100),
            new Product(1003,"Google Pixel 7 Pro", 899.99, 4.6,600,30),
            new Product(1004,"OnePlus 11", 749.99, 4.5,500,20),
            new Product(1005,"Xiaomi 13 Pro", 899.99, 4.4,400,25),
            new Product(1006,"Sony Xperia 1 IV", 1299.99, 4.3,300,150),
            new Product(1007,"Oppo Find X5 Pro", 1099.99, 4.2,250,80),
            new Product(1008,"Vivo X80 Pro", 999.99, 4.1,200,60),
            new Product(1009,"Asus ROG Phone 6", 999.99, 4.0, 150, 70),
            new Product(1010,"Motorola Edge 30 Pro", 799.99, 3.9, 100, 40)
        ));
    }
}

class Product {
    Integer id;
    String title;
    Double price;
    Double rate;
    Integer voter;
    Double discount;

    public Product(int id, String title, double price, double rate, int voter, double discount) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.rate = rate;
        this.voter = voter;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", title=" + title + ", price=" + price + ", rate=" + rate + ", voter=" + voter
                + ", discount=" + discount + "]";
    }

   
}