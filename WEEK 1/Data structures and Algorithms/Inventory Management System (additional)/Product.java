 public class Product {
    private String productId; //product attributes
    private String productName;
    private int quantity;
    private double price;

    public Product(String productId, String productName, int quantity, double price) {  // Constructor to create new product 
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    
    public String getProductId() {
         return productId;            // Getter to get product id
         }   
    public void setQuantity(int quantity) { 
        this.quantity = quantity;     // setter for quantity
    
    }  
    public int getQuantity() {
         return quantity; 
        }
    public void setPrice(double price) {
         this.price = price;
         }
    
    public double getPrice() 
    {
    return price;
         }

    public void displayProduct() {   //displaying the product details
        System.out.println("ID: " + productId + ", Name: " + productName + ", Qty: " + quantity + ", Price: " + price);
    }
}


