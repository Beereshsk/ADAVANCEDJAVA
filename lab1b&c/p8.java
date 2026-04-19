package arraylist2;

import java.util.LinkedList;

public class p8 {

    public static void main(String[] args) {

        LinkedList<String> l_listobj = new LinkedList<>();

        l_listobj.add("Red");
        l_listobj.add("Blue");
        l_listobj.add("Green");

        System.out.println("Original List: " + l_listobj);

        l_listobj.offerLast("Pink");

        System.out.println("After adding 'Pink' at end: " + l_listobj);
    }
}