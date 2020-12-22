import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

public class SearchEmployeeServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// get parameter
		String emp_search_text = request.getParameter("emp_search_text");
		//parse
		
        List<Employee> empList  =new ArrayList<Employee>();
		
        
        //db logic start
        String errors = "";
        Connection con  = null;
        Statement stmt = null;
        ResultSet rs  = null;
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
			String user="system";
			String password="root";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			con  = DriverManager.getConnection(url, user, password);
			stmt  = con.createStatement();
			String sql="select * from emp where lower(ename) like lower('%"+emp_search_text+"%')";
			rs = stmt.executeQuery(sql);
			//get data and put inside list
			while(rs.next()) {
				
				  long id = rs.getLong("empno");
				  String name = rs.getString("ename");
				  String job=rs.getString("job");
				  float salary =rs.getFloat("sal");
				  long deptNo = rs.getLong("deptno");
				  Employee emp  = new Employee();
				  emp.setId(id);
				  emp.setName(name);
				  emp.setJob(job);
				  emp.setSalary(salary);
				  emp.setDeptno(deptNo);
				  //put into list
				  empList.add(emp);
			}
			
        	
		} catch (Exception e) {
			errors = errors+e.getMessage();
			e.printStackTrace();
		}finally {
			 if(con!=null) {
				 try {
					con.close();
				} catch (SQLException e) {
					errors = errors+e.getMessage();
					e.printStackTrace();
				}
				 
			 }
		}
        
        
        if(empList.isEmpty()==false) {
	        request.setAttribute("allemplist", empList);
	        RequestDispatcher  rd  = null;
	        rd  = request.getRequestDispatcher("searchempview");
	        rd.forward(request, response);
	        
        }else {
        	//String location="url?key=value";
        	String location="https://www.google.com?#q="+emp_search_text;
			response.sendRedirect(location);
        }
        
		
		
		
	}

}
