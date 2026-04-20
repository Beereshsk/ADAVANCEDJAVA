package LAB1B;
import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Red");
        colors.add("Yellow");

        // Extract elements at index 0 and 1
        List<String> subList = colors.subList(0, 2);

        System.out.println("SubList (1st & 2nd elements): " + subList);
    }
}