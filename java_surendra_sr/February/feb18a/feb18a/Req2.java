import java.io.FileInputStream;
import java.io.FileOutputStream;

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

public class Req2 {

	public static void main(String[] args)throws Exception {
	       	
		 
		
        FileInputStream fis1  = null;
        FileInputStream fis2  = null;
         
        
		 
        System.out.println(args[0] );
        fis1  = new FileInputStream(args[0]);
         int data1 ;
         while((data1=fis1.read())!=-1) {
        	 System.out.print((char)data1);
         }
        fis1.close();
        
        
        System.out.println(args[1] );
        
        fis2  = new FileInputStream(args[1]);
        int data2 ;
        while((data2=fis2.read())!=-1) {
        	System.out.print((char)data2);
        }
        fis2.close();
        
			 
        
        
		fis2.close();	 
			 
		
		
		
	}
	
	
}
