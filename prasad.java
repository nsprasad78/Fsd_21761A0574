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
		String sql="create table rev(eid number,ename varchar(40))";
		stmt.execute(sql);
		System.out.println("records inserted");
		
	}
}