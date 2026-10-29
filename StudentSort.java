import java.util.*;

class StudentSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
            Arrays.asList("Riya", "Amit", "Neha", "Karan"));

        names.sort((a, b) -> a.compareTo(b));

        System.out.println(names);
    }
}