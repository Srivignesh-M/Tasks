package Tasks;
import java.sql.*;
import java.util.Scanner;
public class JDBC {
	public static void main(String[] args) {
	String Url="jdbc:mysql://localhost:3306/vikky";
	String user="root";
	String pass="";
	Scanner s=new Scanner(System.in);
	int id=s.nextInt();
	String name=s.next();
	s.nextLine();
	String password=s.nextLine();
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(Url,user,pass);
		String query="Insert into usersample values (?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,id );
		ps.setString(2, name);
		ps.setString(3, password);
		int updated=ps.executeUpdate();
		String sql="select * from usersample";
		PreparedStatement ps2=con.prepareStatement(sql);
		ResultSet rs=ps2.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("password"));
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
