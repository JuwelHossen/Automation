package test;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTest {
    public static Connection connect = null;
    private static Statement statement = null;
    private static PreparedStatement ps = null;
    private static ResultSet resultSet = null;


    public static void main(String[] args) throws SQLException {
        String user = "root";
        String password = "Mysql2020";
        String url = "jdbc:mysql://localhost/PNT?serverTimezone=UTC&useSSL=false";

        setUp(url, user, password);


        String sql = "INSERT INTO STUDENTS (stName,stID,stDOB)values (?,?,?)";
        ps = connect.prepareStatement(sql);
        ps.setString(1, "sojol");
        ps.setInt(2, 2);
        ps.setString(3, "00,00,00");
        int row = ps.executeUpdate();

        statement = connect.createStatement();
        resultSet = statement.executeQuery("select * from Students");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("stName") + "  " + resultSet.getString("stDOB")
                    + "  " + resultSet.getInt("stID"));
        }


    }

    public static void setUp(String url, String user, String password) {
        try {
            connect = DriverManager.getConnection(url, user, password);
            if (connect != null) {
                System.out.println("connected");
            }

        } catch (SQLException e) {
            System.out.println("not connected");
        }
    }


}
