package bank.management.system;

import java.sql.*;

public class Conn {

    Connection connection;
    public Statement statement;

    public Conn() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem",
                    "root",
                    "root@4652935");

            statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}