package models;
import java.sql.*;

import javax.swing.JOptionPane;

public class AuthModel {

    public AuthModel() {

    }

    public void login(String user, String pwd) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try {
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://sql.freedb.tech:3306/freedb_db_test_2024", "freedb_master_chief", "DNe&VqDBJm9?3Sf");

                String query = "SELECT * FROM users WHERE username = ? AND password = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, user);
                pstmt.setString(2, pwd);

                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    System.out.println("Login successful!");
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    System.out.println("Invalid credentials.");
                    JOptionPane.showMessageDialog(null, "Invalid credentials.", "Warning", JOptionPane.WARNING_MESSAGE);
                }

                con.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
