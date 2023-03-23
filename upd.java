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
		l1=new Label("Enter Name:");
		t1=new TextField(20);
		l2=new Label("Enter ID:");
		t2=new TextField(30);
		b1=new Button("update");
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
				PreparedStatement pst=c.prepareStatement("update  rev  set ENAME=? where EID=?");
				String EID=t2.getText();
				String ENAME=t1.getText();
				pst.setString(2,EID);
				pst.setString(1,ENAME);
				pst.execute();
				System.out.println("updated");
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


		