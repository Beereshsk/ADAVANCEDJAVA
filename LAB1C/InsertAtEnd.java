package LAB1C;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.offerLast("Pink");

        System.out.println("Updated List: " + list);
    }
}
