public class Main {
    public static void main(String[] args) {
        // Creating product array
        Product[] products = {
            new Product("B1", "Pens", "Stationery"),
            new Product("B2", "Calculators", "Stationery"),
            new Product("B3", "jewellery", "Fashion"),
            new Product("B4", "Pens", "Stationery"),
            new Product("B5", "Uniforms", "Clothing"),
        };

        String searchName = "Pens";

        // linear Search
        Product foundLinear = Search.linearSearch(products, searchName);
        System.out.println("🔎 Linear Search Result:");
        if (foundLinear != null) {
            foundLinear.displayProduct();
        } else {
            System.out.println("❌ Product not found.");
        }

        // binary Search
        Product foundBinary = Search.binarySearch(products, searchName);
        System.out.println("\n🔎 Binary Search Result:");
        if (foundBinary != null) {
            foundBinary.displayProduct();
        } else {
            System.out.println("❌ Product not found.");
        }
    }

}
