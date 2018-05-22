package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by andriusbaltrunas on 5/22/2018.
 */
public class MyDbUtils {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String NAME = "root";
    private static final String PASSWORD = "MySQL";

    public static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Prisijungti nepavyko " + e);
        }
        return connection;
    }


}
