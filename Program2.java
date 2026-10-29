import java.sql.*;

public class Program2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "Bhakti08");

            Statement st = con.createStatement();

            // SELECT query, result stored in ResultSet
            ResultSet rs = st.executeQuery(
                "SELECT rollno, name FROM Student WHERE percentage > 70");

            System.out.println("Roll No\tName");
            // rs.next() moves to the next row
            while (rs.next()) {
                System.out.println(rs.getInt("rollno") + "\t" + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// run commands
//javac Program1.java
// java -cp ".:lib/mysql-connector-j-26.7.0.jar" Program1