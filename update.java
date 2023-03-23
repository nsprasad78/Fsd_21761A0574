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
		String sql="update rev set ename='prasad' where eid=22";
		stmt.executeUpdate(sql);
		System.out.println("records get updated");
		
	}
}