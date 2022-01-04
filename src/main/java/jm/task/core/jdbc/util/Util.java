package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/first_db";
    private static final String USER = "root";
    private static final String PASS = "barri11088";

    static{

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn;

        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
