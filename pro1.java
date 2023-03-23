import java.sql.*;
class pavan
{
	public static void main(String  args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver registered sucfesfully");
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
				CallableStatement pst=c.prepareCall("{call prasad(?,?)}"); 
				pst.setInt(1,6);
				pst.setString(2,"prudhvi");
				pst.execute();
				System.out.println("Inserted");
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}	
		