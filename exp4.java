
// Program 4: Compare ArrayList and LinkedList performance while inserting
import java.util.ArrayList;
import java.util.LinkedList;

public class exp4 {
    public static void main(String[] args) {
        int n = 50000;                           // number of elements to insert

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Insert at the beginning of ArrayList (all elements must shift)
        long start = System.nanoTime();          // start time
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }
        long end = System.nanoTime();            // end time
        System.out.println("ArrayList  time : " + (end - start) / 1000000 + " ms");

        // Insert at the beginning of LinkedList (only links change)
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList time : " + (end - start) / 1000000 + " ms");

        System.out.println("LinkedList is faster for insertion at the beginning.");
    }
}