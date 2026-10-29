import java.sql.*;

public class Program3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "Bhakti08");

            // ? are placeholders filled below
            PreparedStatement ps = con.prepareStatement(
                "UPDATE Student SET percentage = ? WHERE rollno = ?");
            ps.setDouble(1, 90.0); // new percentage
            ps.setInt(2, 2);       // roll number to update

            int rows = ps.executeUpdate(); // returns rows changed
            System.out.println(rows + " record updated.");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
