import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Scanner;

/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2019 
 */

public class SisTodoUtil {
	public static final String DATE_PATTERN="EEEE dd-MMM-yyyy hh:mm:ss";
	public static void showAll() {
		Connection con = null;
		PreparedStatement  pstmt  = null;
		 ResultSet rs  = null;
		  try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  String url ="jdbc:oracle:thin:@localhost:1521:XE";
			  con = DriverManager.getConnection(url,"system","root");
			  String sql  = "select ID, TITLE, DETAILS, WHEN from todo";
			  pstmt  = con.prepareStatement(sql);
			  rs  = pstmt.executeQuery();
			  
			  java.text.SimpleDateFormat sdf =null;
			  sdf  =new java.text.SimpleDateFormat(DATE_PATTERN);
			  
			  while(rs.next()){
				  long id  =rs.getLong("id");
				  String title = rs.getString("TITLE");
				  String details = rs.getString("DETAILS");
				  java.sql.Timestamp when = rs.getTimestamp("when");
				  String userFormateDate  = sdf.format(when);
				  
				  //System.out.println(id+"\t"+title+"\t"+details+"\t"+timestamp.toString());
				  System.out.println(id+"\t"+title+"\t"+details+"\t"+userFormateDate);
				  
			  }
			  
			  
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
	}
	
	
	public static void addDodo() {
		Scanner scan  = new  Scanner(System.in);
		String title = null;
		String details = null;
		String whenStr = null;
			System.out.println("enter title(50 char)");
			title = scan.nextLine();
			System.out.println("enter details(100 char)");
			details = scan.nextLine();
			//String to date object
			java.util.Date d1  = null;
			  java.text.SimpleDateFormat sdf =null;
			  sdf  =new java.text.SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
			 
			  while(d1==null) {
				 try {
					 System.out.println("enter todo time (dd-MM-yyyy hh:mm:ss)");
					 whenStr = scan.nextLine();
					 //String to Date
					d1  = sdf.parse(whenStr);
				} catch (ParseException e) {
					System.out.println("invalid date formate required (dd-MM-yyyy hh:mm:ss)");
				}
				 
			  }//loop
			 
			//date to Timestamp
		   java.sql.Timestamp when=null;	 
		   when  = new java.sql.Timestamp(d1.getTime());
		   
		   
		 //jdbc code for insert data
		    Connection con = null;
			PreparedStatement  pstmt  = null;
			 
			  try{
				  Class.forName("oracle.jdbc.driver.OracleDriver");
				  String url ="jdbc:oracle:thin:@localhost:1521:XE";
				  con = DriverManager.getConnection(url,"system","root");
				  String sql  = "insert into todo"
				  		+ "(ID, TITLE, DETAILS, WHEN) "
				  		+ "values(TODO_SEQ.nextval,?,?,?)";
				  	pstmt  = con.prepareStatement(sql);
				  	
				  	//set input data
				  	pstmt.setString(1, title);
				  	pstmt.setString(2, details);
				  	pstmt.setTimestamp(3, when);
				  	int r = pstmt.executeUpdate();
				  	System.out.println(r==1?"added ":" NOt added");
				  
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
		   
		    
			 
		
	}// 
	public static void updateDodo() {
		Scanner scan  = new  Scanner(System.in);
		Long id = null;
		String title = null;
		String details = null;
		String whenStr = null;
		System.out.println("enter id");
		id  = Long.parseLong(scan.nextLine());
		System.out.println("enter title(50 char)");
		title = scan.nextLine();
		System.out.println("enter details(100 char)");
		details = scan.nextLine();
		//String to date object
		java.util.Date d1  = null;
		java.text.SimpleDateFormat sdf =null;
		sdf  =new java.text.SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		
		while(d1==null) {
			try {
				System.out.println("enter todo time (dd-MM-yyyy hh:mm:ss)");
				whenStr = scan.nextLine();
				d1  = sdf.parse(whenStr);
			} catch (ParseException e) {
				System.out.println("invalid date formate required (dd-MM-yyyy hh:mm:ss)");
			}
			
		}//loop
		
		//date to Timestamp
		java.sql.Timestamp when=null;	 
		when  = new java.sql.Timestamp(d1.getTime());
		
		
		//jdbc code for insert data
		Connection con = null;
		PreparedStatement  pstmt  = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:XE";
			con = DriverManager.getConnection(url,"system","root");
			String sql  = "update todo "
					+ " set TITLE=?, DETAILS=?, WHEN=? "
					+ " where id=?";
			pstmt  = con.prepareStatement(sql);
			
			//set input data
			pstmt.setString(1, title);
			pstmt.setString(2, details);
			pstmt.setTimestamp(3, when);
			pstmt.setLong(4, id);
			int r = pstmt.executeUpdate();
			System.out.println(r==1?" update ":" NOt update");
			
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
		
		
		
		
	}// 

}
