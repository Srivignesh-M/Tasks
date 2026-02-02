package Tasks;
import java.sql.*;
public class JDBC {
	public static void main(String[] args) {
	String Url="jdbc:mysql://localhost:3306/vikky";
	String user="root";
	String pass="*********";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(Url,user,pass);
		Statement s=con.createStatement();
		String query="Insert into usersample values(2,\"vikky\",\"password\");";
		s.executeUpdate(query);
		ResultSet rs=s.executeQuery("select*from usersample");
		while(rs.next()) {
			System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("password"));
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
