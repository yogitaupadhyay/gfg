import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

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

public class Req3 {

	public static void main(String[] args)throws Exception {
	       	
		 
		
        FileInputStream fis1  = null;
        FileInputStream fis2  = null;
         
		 
        fis1  = new FileInputStream(args[0]);
        fis2  = new FileInputStream(args[1]);
        SequenceInputStream sis  = new SequenceInputStream(fis1, fis2);
        int data ;
        while((data=sis.read())!=-1) {
        	System.out.print((char)data);
        }
        sis.close();
        
			 
        
        
		fis2.close();	 
			 
		
		
		
	}
	
	
}
