import java.sql.*;
class pavan
{
	public static void main(String  args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver registered sucfesfully");
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
				CallableStatement pst=c.prepareCall("{? = call nice(?,?)}"); 
				pst.setInt(2,7);
				pst.setInt(3,5);
				pst.registerOutParameter(1, Types.INTEGER);
				pst.execute();
				System.out.println(pst.getInt(1));
				c.close();
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}	
		