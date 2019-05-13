package by.itacademy.java.dserbunou.home.practice7.datalayer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDBDao {

    protected Connection createConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ds-cars",
                "postgres", "postgres");

    }


}
