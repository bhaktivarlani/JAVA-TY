import java.sql.*;

public class Program1 {
    public static void main(String[] args) {
        try {
            // load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // connect to database "college"
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/college", "root", "Bhakti08");

            Statement st = con.createStatement();

            // create Student table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS Student ("
                + "rollno INT PRIMARY KEY, name VARCHAR(50), percentage DOUBLE)");
            System.out.println("Table created.");

            // insert 4 records
            st.executeUpdate("INSERT INTO Student VALUES (10, 'Iraa', 88)");
            st.executeUpdate("INSERT INTO Student VALUES (35, 'Bhakti', 90)");
            st.executeUpdate("INSERT INTO Student VALUES (38, 'Divija', 92)");
            st.executeUpdate("INSERT INTO Student VALUES (44, 'Sharayu', 93)");
            System.out.println("Records inserted.");

            con.close(); // close connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


// display commands 
//    javac Program1.java
//    java -cp ".:lib/mysql-connector-j-26.7.0.jar" Program1