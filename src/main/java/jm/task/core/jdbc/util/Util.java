package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/db_Users";
    private static final String USER = "root";
    private static final String PASS = "barri11088";

    public static Connection getConnection() {

        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
