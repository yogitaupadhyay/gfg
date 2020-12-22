import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class SisCopy {

	public static void main(String[] args) {
	       	
		if(args.length<1) {
			System.out.println("plz pass source file ");
			System.exit(0);
		}
		

		if(args.length<2) {
			System.out.println("plz pass dest file ");
			System.exit(0);
		}
		
		String srcName = args[0];
		String destName= args[1];
		
		File srcFile  = new File(srcName);
		File destFile  = new File(destName);
		
		if(srcFile.exists()==false) {
			System.out.println("The system cannot find the file specified.");
			System.exit(0);
		}
		
        FileInputStream fis  = null;
        FileOutputStream fos  = null;
        
		try {
			fis  = new FileInputStream(srcFile);
			fos  = new FileOutputStream(destFile);
			long start = System.currentTimeMillis();
			int data;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("total copy time "+(end-start)+"ms");
		} catch (IOException e) {
			System.out.println("FIle Error "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Error "+ e.getMessage());
		}finally {
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("opened file not closed"+e.getMessage()); 
				}
			}
			
			if(fos!=null) {
				try {
					fos.close();
					System.out.println("copy successfuly done");
				} catch (IOException e) {
					System.out.println("Copy operation failed : "+e.getMessage()); 
				}
			}
			
			
		}//finally
		
		
		
		
		
		
		
	}
	
	
}
