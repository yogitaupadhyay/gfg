import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
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

public class Req3 {

	public static void main(String[] args) throws Exception {

		writeData();
		// readData();

	}

	private static void readData() throws FileNotFoundException, IOException {
			DataInputStream dis = null;
			dis  = new DataInputStream(new FileInputStream("data3"));
			int i1 = dis.readInt();
			int i2 = dis.readInt();
			int i3 = dis.readInt();
			int i4 = dis.readInt();
			boolean b1 = dis.readBoolean();
			float f1 = dis.readFloat();
			System.out.println(i1);
			System.out.println(i2);
			System.out.println(i3);
			System.out.println(i4);
			System.out.println(b1);
			System.out.println(f1);
			
	}

	private static void writeData() throws IOException {
		
		File file  = new File("data3");
		DataOutputStream dos =null;
	    dos = new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(65);
		dos.writeInt(45);
		dos.writeInt(65);
		dos.writeInt(75);
		dos.writeBoolean(true);
		dos.writeFloat(10.5f);
		dos.close();
		System.out.println("done saved");
		file.setReadOnly();
	}

}
