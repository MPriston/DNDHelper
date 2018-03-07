package app;

import java.sql.*;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Connection conn = SQLConnect.dbConnect();
		try {
			String query = "select Monsters, AC, AD1, Spellcaster from Monsters";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				System.out.printf("%s\n",rs.getString("Monsters"));
				System.out.printf("%d\n",rs.getInt("AC"));
				System.out.printf("%s\n",rs.getString("AD1"));
				System.out.printf("%b\n",rs.getBoolean("Spellcaster"));
			}
			pst.close();
			rs.close();
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}

}
