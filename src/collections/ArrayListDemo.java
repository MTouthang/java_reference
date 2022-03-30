package collections;

import java.util.ArrayList;

/**
 * ArrayList support dynamic arrays that can grow as needed.
 * ArrayList is  a variable-length array of object reference
 * The capacity grow automatically as elements are added to an array list
 */

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println("Initial size of the arraylist: " + al.size());

        // adding element to the arraylist
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("F");
        al.add(1,"A1");

        System.out.println(" Size of the the arraylist after adding ele: " + al.size());

        al.remove("F");
        al.remove(2);

        System.out.println(" Size of the arraylist after adding and remove ele: " + al.size());
        System.out.println(" The content of the arraylist is: " + al);

    }
}
