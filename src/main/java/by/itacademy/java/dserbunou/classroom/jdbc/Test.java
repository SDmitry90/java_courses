package by.itacademy.java.dserbunou.classroom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {
		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ds_cars", "postgres", "1");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM car");) {
			while (rs.next()) {
				System.out.printf("%s|%s|%s\n", rs.getInt("id"), rs.getString("vin"), rs.getDate("created"));
			}
		}
	}
}
