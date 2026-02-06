package org.example;

import java.sql.*;

public class Simplejdbc {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "";
        String query = "select * from students";

        String insert = "INSERT INTO students (student_id, name, age, grade) VALUES (94, 'Alice', 20, 'A'), (78, 'Bob', 21, 'B'), (75, 'Charlie', 19, 'A')";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        PreparedStatement ps = con.prepareStatement(insert);
        int rows = ps.executeUpdate();

        System.out.println(rows + " rows affected");


        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }

        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}
