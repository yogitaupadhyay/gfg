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

public class Req {

	public static void main(String[] args)throws Exception {
	       	
		 
		
        FileInputStream fis  = null;
         
        
		 
			fis  = new FileInputStream("1.mp3");
			//byte[]containerByteArray = new byte[1024];//1kb
			byte[]containerByteArray = new byte[1024*1024];//1m
			
			int fileNo=0;
			int totalLength =0;
			int totalReadDataSize;
			while((totalReadDataSize=fis.read(containerByteArray))!=-1) {
				System.out.println("reading each loop " +totalReadDataSize);
				totalLength = totalLength +totalReadDataSize;
			 FileOutputStream fos= 	new FileOutputStream("file_"+ ++fileNo);
			 fos.write(containerByteArray,0,totalReadDataSize);
			 fos.close();
			 
			}
			 
			System.out.println(totalLength);
			fis.close();
		
		
		
		
		
	}
	
	
}
