import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Search extends Frame implements ActionListener 
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	String num;
	Search()
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("Enter id:");
		t1=new TextField(20);
		l2=new Label("Enter new id:");
		t2=new TextField(30);
		b1=new Button("insert");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae){

		try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver registered sucfesfully");
				Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
				PreparedStatement pst=c.prepareStatement("insert into rev values(?,?)");
				String EID=t1.getText();
				String ENAME=t2.getText();
				pst.setString(1,EID);
				pst.setString(2,ENAME);
				pst.executeUpdate();
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class pavan
{
	public static void main(String args[]){
	Search o=new Search();
	}
}


		