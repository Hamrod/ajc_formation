package ajc.formation.alten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJdbcBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	Connection connection=null;
	try {
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/alten","postgres","postgres");
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into client(id_client,prenom,nom) value (10,yannick,bertheau)");
		ResultSet rs=statement.executeQuery("select * from client");
		while(rs.next()) {
			System.out.println(rs.getString("prenom")+" "+rs.getString("nom"));
		}
	}
	catch(SQLException e){
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	}
}
