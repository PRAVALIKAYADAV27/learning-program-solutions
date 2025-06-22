import java.util.Arrays;
import java.util.Comparator;

public class Search {
    
    public static Product linearSearch(Product[] products, String name) { //searches in unsorted array
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;  //returns product if found
            }
        }
        return null;  //returns null if not found
    }

    
    public static Product binarySearch(Product[] products, String name) { //(searches in sorted way)
       
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase())); //sorting array by product name before implementing binary search

        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) {
                return products[mid];  //found
            } else if (cmp < 0) {
                left = mid + 1;  //searches right side
            } else {
                right = mid - 1; //searches left side
            }
        }

        return null;  //not found
    }
}

