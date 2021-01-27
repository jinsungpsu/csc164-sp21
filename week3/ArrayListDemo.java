import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        int[] iList = new int[2];

        aList.add(1);
        aList.add(2);

        iList[0] = 1;
        iList[1] = 2;

        for (int i = 0; i < iList.length; i++) {
            System.out.print(iList[i]);
        }

        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i));
        }
        System.out.println(aList);
        System.out.println(iList);

        // if i wanted to add a 3rd item...
        // can't do it in an array
        iList[2] = 3; // this is gonna be an array out of bounds exception

        // but i can do it in an ArrayList
        aList.add(3);

    }
}
