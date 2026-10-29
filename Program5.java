import java.sql.*;

public class Program5 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "Bhakti08");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Student");

            System.out.println("Roll No\tName\tPercentage");
            while (rs.next()) {
                // 1, 2, 3 are the column numbers
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}