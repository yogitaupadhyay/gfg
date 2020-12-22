import java.sql.*;
import java.util.*;

public class Update{
	public static void main(String...sis)throws Exception{
		System.out.println("hellow");
		Connection con=null;
		Statement stmt=null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded successfully");
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="System";
		String password="Ig32mind$";
		con=DriverManager.getConnection(url,user,password);
	    stmt=con.createStatement();
	   Scanner scan=new Scanner(System.in);
		System.out.println("enter update  id");
		long id=Long.parseLong(scan.nextLine());
		System.out.println("enter update color");
		String color=scan.nextLine();
		System.out.println("enter update price");
		float price=Float.parseFloat(scan.nextLine());
		String sql="update ball1 set color= '"+color+"\',price ="+price+"where id="+id;
	    int rs=stmt.executeUpdate(sql);
		System.out.println("total row updated : "+rs);
		}catch(SQLException e){
				System.out.println(" db error:"+e.getMessage());
			e.printStackTrace();
		} catch(Exception e){
				System.out.println("error:"+e.getMessage());
			
		}finally{
		
		if(con!=null){
			try{
			con.close();
			System.out.println("*****connection close*****");
			}catch(SQLException e){
				System.out.println("error:"+e.getMessage());
			}
		}
		}
		
		
		
		
	}
}
