package LAB1C;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateFromSecond {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");

        // Start from index 1 (2nd position)
        ListIterator<String> iterator = list.listIterator(1);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}