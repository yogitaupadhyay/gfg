import java.io.File;
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

public class OuputStreamDemo1 {

 
	public static void main(String[] args) throws Exception{
		 
		File file  = new File("mydata1");
		FileOutputStream fos  = null;
		
		//fos = new FileOutputStream("myData");
		fos = new FileOutputStream(file);
		
		fos.write(65);
		byte[]bdata = new byte[] {22,45,23,77,88};
		fos.write(bdata);
		//fos.write("java is simple");
		fos.write("java is simple".getBytes());
		System.out.println("data save in "+file.getAbsolutePath());
		fos.close();
		
		 
		 
	}

}
