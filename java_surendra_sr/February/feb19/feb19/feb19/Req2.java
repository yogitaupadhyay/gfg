import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class Req2 {

	 
	public static void main(String[] args) throws Exception{
		
		writeData();
		//readData();
		
	}

	private static void readData() throws FileNotFoundException, IOException {
		FileInputStream fis  = new  FileInputStream("data2");
		
	}

	private static void writeData() throws IOException {
		FileOutputStream fos  = new FileOutputStream("data2");
		
		fos.write((10 +" ").getBytes());
		fos.write((20 +" ").getBytes());
		fos.write((30 +" ").getBytes());
		fos.write((40 +" ").getBytes());
		fos.write((50 +" ").getBytes());
		fos.write("\n".getBytes());
		fos.close();
		System.out.println("done saved");
	}

}
