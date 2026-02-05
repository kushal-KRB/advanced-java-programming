import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Simplejdbc {

    public static void main(String args[]) {

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/test";
            Connection conn = DriverManager.getConnection(url, "root", "password");

            // Create a statement
            Statement st = conn.createStatement();

            // Execute a statement
            ResultSet rs = st.executeQuery("SELECT * FROM student");

            // Process the result
            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2)
                );
            }

            // Close the connection
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
        } catch (SQLException e) {
            System.out.println("SQL Error");
        }
    }
}
