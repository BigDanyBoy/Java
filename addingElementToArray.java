/* 
 Using an ArrayList (Recommended)

If you need a dynamic array that can change size easily, it's better to use ArrayList, which is part of Java's java.util package. 
An ArrayList allows you to add or remove elements without worrying about the size of the array.

Here's an example using ArrayList:
*/
import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();  // Create an ArrayList

        // Add elements to the ArrayList
        list.add(1);
        list.add(2);
        list.add(3);

        int newValue = 4;  // Value to add
        list.add(newValue);  // Dynamically adds the new value

        // Print the ArrayList
        System.out.println(list);
    }
}
