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
		l1=new Label("Enter name");
		t1=new TextField(20);
		l2=new Label("Enter name:");
		t2=new TextField(30);
		b1=new Button("Insert");
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
				PreparedStatement pst=c.prepareStatement("select * from rev where Eid=?");
				String sql=t1.getText();
				pst.setString(1,sql);
				ResultSet rs=pst.executeQuery();
				int x=0;
				while(rs.next())
				{
					t2.setText(rs.getString(2));
					x++;
				}
				if(x==0)
				{
					t2.setText("records not found");
				}
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


		