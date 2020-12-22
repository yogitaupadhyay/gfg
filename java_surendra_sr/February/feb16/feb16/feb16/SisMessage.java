import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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

public class SisMessage {

	 
	public static void main(String[] args) {
		 
		String fileName = "sis_msg.sis";
	     BufferedReader br  = null;
	     String[] messageList = new String[10];
	     
	     try {
			br  = new BufferedReader(new FileReader(fileName));
			String line;
			int pos=1;
			while((line=br.readLine())!=null) {
				 messageList[pos-1]=line;
				 pos++;
			}
			
		} catch (IOException e ) {
			e.printStackTrace();
		} catch (Exception e ) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//if
		}//finally
	     
	   
	     for(String msg : messageList) {
	    	 if(msg!=null) {
	    		 try {Thread.sleep(2000);} catch (Exception e) {	}
		    	 System.out.println(msg);
		    	 System.out.println("__________________");
	    	 }
	     }
	     
		
		
		
		

	}//main

}//class
