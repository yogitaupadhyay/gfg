import java.sql.*;
 public class  PreparedStatementdemo{
	 public static void main(String args[]){
		 Connection conn=null;
		 PreparedStatement pstmt=null;
		 java.util.Scanner scan=new java.util.Scanner(System.in);
		 int id=0;
		 String name=null;
		 String loc=null;
		 try{
		 System.out.println("insert id (2 digit max)");
		  id=Integer.parseInt(scan.nextLine());
		 System.out.println("insert dept name");
		 name=scan.nextLine();
		 System.out.println("insert dept location");
		 loc=scan.nextLine();
		 }catch(NumberFormatException e){
			System.out.println("NumberFormatException"); 
			System.out.println("NumberFormatException ="+e.getMessage());
return;			
		 }
		 try{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");		
		String sql="insert into dept values(?,?,?)";
	     pstmt=conn.prepareStatement(sql);
		 pstmt.setInt(1,id);
		 pstmt.setString(2,name);
		 pstmt.setString(3,loc);
		 int r  =pstmt.executeUpdate();
		 if(r==1){
			 System.out.println("successfully insert rows= "+r);
		 }
		 }catch(SQLException e){
			 System.out.println("SQLException 1");
			e.printStackTrace();
		 }catch(Exception e){
			 System.out.println("Exception");
			 
		 }finally{
			 try{
			 if(conn!=null){
				 conn.close();
			 }
			 }catch(SQLException e){
				 System.out.println("SQLException ");
			 }
		 }
		 
		 
	 }
	 
	 
 }