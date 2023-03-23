import java.sql.*;
class pavan
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver registered sucfesfully");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established sucessfully");
		Statement stmt=c.createStatement();
		String sql="select * from rev";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString("ename"));
		System.out.println("records get fetched");
		}
		
	}
}
