import java.util.HashMap;

public class Inventory {
  
private HashMap<String, Product> products = new HashMap<>(); // for storing product Id as key, product as value

    public void addProduct(Product product) {   // for adding a new product to inventory
        products.put(product.getProductId(), product);
    }

    public void updateProduct(String productId, int newQty, double newPrice) {  // Update product quantity & price based on its ID
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQty);    // update quantity
            product.setPrice(newPrice);     // update price
        }
    }

    public void deleteProduct(String productId) {   // to delete a product from inventory using its ID
        products.remove(productId);
    }

    public void displayAllProducts() {     // displaying all the products in inventory
        for (Product product : products.values()) {
            product.displayProduct();
        }
    }
}

