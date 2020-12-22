import java.io.File;
import java.io.FileInputStream;

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

public class InputstreamDemo1 {
	public static void main(String[] args) throws Exception{
		  if(args.length<1) {
			  System.out.println("plz pass file name");
			  System.exit(0);
		  }		
		  File file  =new File(args[0]);
		  if(file.exists()==false) {
			  System.out.println(file  +" not exists");
			  System.exit(0);
		  }
		  if(file.isDirectory()) {
			  System.out.println(" we can not process folder");
			  System.exit(0);
		  } 
		 FileInputStream fis  = null;
		 fis = new FileInputStream(file);
		 int data;
		 long start =System.nanoTime();
		 while((data=fis.read())!=-1) {
			 //System.out.print((char)data);
			 System.out.print(data);
			 //System.out.println("TODO");
		 }
		 long end =System.nanoTime();
		 System.out.println("total read time "+ (end-start)+"ns");
	 fis.close();
		 
	}

}
