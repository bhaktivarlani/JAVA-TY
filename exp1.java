
// Program 1: List interface - insertion, deletion, searching, displaying
import java.util.ArrayList;
import java.util.List;

public class exp1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();   // List reference, ArrayList object

        // Insertion
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        System.out.println("After adding     : " + list);

        list.add(1, "Orange");                   // insert at index 1
        System.out.println("Insert at index 1 : " + list);

        // Deletion
        list.remove("Banana");                   // remove by value
        System.out.println("After removing Banana : " + list);

        // Searching
        System.out.println("Contains Mango  : " + list.contains("Mango"));
        System.out.println("Contains Grapes : " + list.contains("Grapes"));
        System.out.println("Index of Mango  : " + list.indexOf("Mango"));

        // Displaying each element
        System.out.println("Elements are:");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("Size of list : " + list.size());
    }
}