
// Program 3: LinkedList - insert, delete and traverse integers
import java.util.LinkedList;

public class exp3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Insertion
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original list    : " + list);

        list.addFirst(5);                        // insert at the beginning
        list.addLast(40);                        // insert at the end
        list.add(2, 15);                         // insert 15 at index 2
        System.out.println("After insertion  : " + list);

        // Deletion
        list.remove(Integer.valueOf(20));        // remove the value 20
        list.removeFirst();                      // remove the first element
        System.out.println("After deletion   : " + list);

        // Traversal
        System.out.print("Traversing list  : ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}