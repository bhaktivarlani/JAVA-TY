import java.sql.*;

public class Program4 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "Bhakti08");

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM Student WHERE rollno = ?");
            ps.setInt(1, 3); // roll number to delete

            int rows = ps.executeUpdate();
            System.out.println(rows + " record deleted.");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}