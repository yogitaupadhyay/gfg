import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
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

public class ATMService extends HttpServlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("+++++++++++++init start at "+ new Date());
		//initialize printer service
		try {
			Thread.sleep(5000);
			System.out.println("printer service started...");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//initialize security service
				try {
					Thread.sleep(5000);
					System.out.println("security service started...");
				} catch (Exception e) {
					// TODO: handle exception
				}
				
	 //initialize other service
				try {
					Thread.sleep(2000);
					System.out.println("other required service started...");
				} catch (Exception e) {
					// TODO: handle exception
				}	
				System.out.println("+++++++++++++++init end at "+ new Date());
				
	}//end init metho
	
	
	
	
	@Override   //service 
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 
			 StringBuffer htmlCode = new StringBuffer();
				htmlCode.append("<html>");
				htmlCode.append("<head>");
				htmlCode.append("<title>sis</title>");
				htmlCode.append("</head>");
				htmlCode.append("<body>");
				htmlCode.append("<h1>ATM Service called time "+new Date() +"</h1><hr>");
				htmlCode.append("</body>");
				htmlCode.append("</html>");
				PrintWriter pw  = response.getWriter();
				response.setContentType("text/html");
				pw.print(htmlCode);
	}

}
