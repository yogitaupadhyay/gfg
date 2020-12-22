import java.sql.*;

public class Req1Update{

public static void main(String []args){

Connection con = null;
PreparedStatement pstmt  = null;
 
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	  
		String sql= "insert into t1 (c1)values(?)";
	    pstmt  = con.prepareStatement(sql);
	  
	  
	  java.util.Random rand  = new java.util.Random();
	  
	  long start = System.nanoTime();
	  for(int i=1;i<=10000;i++){
	  int temp =rand.nextInt(100000);
		//String sql= "insert into t1 (c1)values("+temp+")";
		//stmt.executeUpdate(sql);
		pstmt.setInt(1,temp);
		pstmt.executeUpdate();
	}
	  long end = System.nanoTime();
	System.out.println("total time "+(end-start)+"ns");
	System.out.println("done");
	  
  }catch(SQLException e){
     System.out.println("db Error : " + e.getMessage());
	 e.printStackTrace();
  }catch(Exception e){
     System.out.println("Error : " + e.getMessage());
	 e.printStackTrace();
  }finally{
			  if(con!=null){
			       try{
						con.close();
						System.out.println("db  closed");
				  }catch(SQLException e){
						System.out.println("db close error " + e.getMessage());
						e.printStackTrace();
				  }
			  }//if not null
}//finally

}//main

}//class