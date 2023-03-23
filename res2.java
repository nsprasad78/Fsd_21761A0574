import java.sql.*;
import java.util.*;
class pavan
{
	public static void main(String args[])throws Exception
	{
		int id;
		String name;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver registered sucfesfully");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established sucessfully");
		String sql="insert into rev values(?,?)";
		PreparedStatement stmt=c.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter Name:");
		name=sc.next();
		stmt.setInt(1,id);
		stmt.setString(2,name);
		int i=stmt.executeUpdate();
		System.out.println("records inserted"+(i));
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString("ename"));
		System.out.println("records get fetched");
		}
		
	}
}
