public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a String: ");
        String str = sc.nextLine(); 

        String rev = ""; // Variable to store the reversed string

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);

        sc.close(); 
    }
}