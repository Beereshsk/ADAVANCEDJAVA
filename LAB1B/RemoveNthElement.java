package LAB1B;
import java.util.ArrayList;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        int n = 2; // Example: remove 3rd element (index = n)

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing element at index " + n + ": " + colors);
        } else {
            System.out.println("Invalid index");
        }
    }
}