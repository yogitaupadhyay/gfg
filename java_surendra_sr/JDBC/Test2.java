import java.sql.*;

public class Test2{
	public static void main(String...sis)throws Exception{
		System.out.println("hellow");
		Connection con=null;
		Statement stmt=null;
		
		//load driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//required only when run
		System.out.println("driver loaded successfully");
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="System";
		String password="Ig32mind$";
		con=DriverManager.getConnection(url,user,password);
		System.out.println("******connection stablished : "+con);
	    stmt=con.createStatement();
	    System.out.println("statement created : "+stmt);
		String sql="create table ball1(id number(10),color varchar2(2),price number(10,2))";
	    int rs=stmt.executeUpdate(sql);		
	   System.out.println("total row updated : "+rs);		
		if(con!=null){
			
			con.close();
			System.out.println("*****connection close*****");
			
		}
		
		
		
		
		
	}
}
