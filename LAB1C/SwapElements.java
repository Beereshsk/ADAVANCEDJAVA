package LAB1C;

import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Swap index 0 and 2 (1st and 3rd elements)
        Collections.swap(list, 0, 2);

        System.out.println("After swapping: " + list);
    }
}
