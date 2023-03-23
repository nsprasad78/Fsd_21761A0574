import java.sql.*;
class pavan
{
	public static void main(String args[])throws Exception
	{
		int id=3;
		String name="vijay";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver registered sucfesfully");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		System.out.println("connection established sucessfully");
		String sql="insert into rev values(?,?)";
		PreparedStatement stmt=c.prepareStatement(sql);
		stmt.setInt(1,id);
		stmt.setString(2,name);
		stmt.executeUpdate();
		System.out.println("records inserted");
		
	}
}