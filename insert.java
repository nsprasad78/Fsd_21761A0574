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
		String sql="insert into rev values(21,'pavan')";
		stmt.executeUpdate(sql);
		String sql1="insert into rev values(23,'priya')";
		stmt.executeUpdate(sql1);
		System.out.println("records inserted");
		
	}
}