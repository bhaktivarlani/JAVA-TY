
// Program 2: ArrayList to store and display student names
import java.util.ArrayList;

public class exp2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        //  student names
        students.add("bhakti");
        students.add("iraa");
        students.add("sharayu");
        students.add("divija");

        // Display names using a normal for loop
        System.out.println("Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i)); // get(i) reads element at index i
        }

        System.out.println("Total students : " + students.size());

        students.set(1, "Bhakti");               
        System.out.println("After replacing    : " + students);
    }
}