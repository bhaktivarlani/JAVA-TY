
// Program 5: Sort an ArrayList using Collections.sort()
import java.util.ArrayList;
import java.util.Collections;

public class exp5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(3);
        numbers.add(56);

        System.out.println("Before sorting : " + numbers);

        Collections.sort(numbers);             
        System.out.println("Ascending order  : " + numbers);

        Collections.sort(numbers, Collections.reverseOrder()); 
        System.out.println("Descending order : " + numbers);
    }
}