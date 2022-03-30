package collections;

import java.util.ArrayList;

/**
 * Converting ArrayList to list
 */
class ArrayListToList {

    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);

        System.out.println("contents of al: " +ints);

        //Get the array
        Integer ia[] = new Integer[ints.size()];
        ia = ints.toArray(ia);

        int sum = 0;
        for (int i: ia){
            sum = sum+i;
        }
        System.out.println("The sum of the array is: " + sum);
    }


}
