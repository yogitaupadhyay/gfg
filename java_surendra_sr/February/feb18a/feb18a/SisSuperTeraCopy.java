import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

public class SisSuperTeraCopy {

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
        BufferedInputStream bis  = null;
        
        FileOutputStream fos  = null;
        BufferedOutputStream bos = null;
        
		try {
			fis  = new FileInputStream(srcFile);
			bis = new BufferedInputStream(fis);
			
			fos  = new FileOutputStream(destFile);
			bos  = new BufferedOutputStream(fos);
			long start = System.currentTimeMillis();
			//byte[]containerByteArray = new byte[1024];//1kb
			byte[]containerByteArray = new byte[100*1024];//100kb
			int dataSize;
			while((dataSize=bis.read(containerByteArray))!=-1) {
				bos.write(containerByteArray,0,dataSize);
			}
			long end = System.currentTimeMillis();
			System.out.println("total copy time "+(end-start)+"ms");
		} catch (IOException e) {
			System.out.println("FIle Error "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Error "+ e.getMessage());
		}finally {
			if(bis!=null) {
				try {
					bis.close();
				} catch (IOException e) {
					System.out.println("opened file not closed"+e.getMessage()); 
				}
			}
			
			if(bos!=null) {
				try {
					bos.close();
					System.out.println("copy successfuly done");
				} catch (IOException e) {
					System.out.println("Copy operation failed : "+e.getMessage()); 
				}
			}
			
			
		}//finally
		
		
		
		
		
		
		
	}
	
	
}
