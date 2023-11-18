import java.util.*;

class Product implements Comparable<Product> {
    private double price; 
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}

class User {
    
}

class Order {
   
}

class ECommercePlatform {
    private Map<Integer, User> users;
    private Map<Integer, Product> products;
    private Map<Integer, Order> orders;

   
    public List<Product> recommendProducts(User user) {
        
        return new ArrayList<>(); 
    }
}




