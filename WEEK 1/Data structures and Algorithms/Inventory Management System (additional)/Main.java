public class Main {
     public static void main(String[] args) {
        Inventory inventory = new Inventory(); //creating an inventory object for managing products

        Product p1 = new Product("A101", "Books", 27, 1499.00); // creating product objects
        Product p2 = new Product("A102", "Calculators", 16, 2800.00);

        inventory.addProduct(p1);
        inventory.addProduct(p2); //adding them to inventory

        inventory.updateProduct("A101", 50, 2800.00); //updating books(p1)
        inventory.deleteProduct("A102");  //deleting calc (p2)

        inventory.displayAllProducts();  //displaying all products left in inventory
    }
    
}
