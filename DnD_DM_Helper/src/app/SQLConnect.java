package app;

import java.sql.*;

import javax.swing.JOptionPane;

public class SQLConnect {
	public static Connection dbConnect() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Resources\\DnDDatabase.sqlite");
			return conn;
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
}
