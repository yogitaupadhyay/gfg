import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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

public class Req1 {

	 
	public static void main(String[] args) throws Exception{
		
		//writeData();
		readData();
		
	}

	private static void readData() throws FileNotFoundException, IOException {
		BufferedReader br  = new BufferedReader(new FileReader("data"));
		String dataLine = br.readLine();
		System.out.println(dataLine);
		String[] splitData = dataLine.split(" ");
		int d1 = Integer.parseInt(splitData[0]);	
		int d2 = Integer.parseInt(splitData[1]);	
		int d3 = Integer.parseInt(splitData[2]);	
		int d4 = Integer.parseInt(splitData[3]);	
		int d5 = Integer.parseInt(splitData[4]);
		System.out.println(d1+d2+d3+d4+d5);
	}

	private static void writeData() throws IOException {
		FileWriter fw  = new FileWriter("data");
		
		fw.write(10 +" ");
		fw.write(20 +" ");
		fw.write(30 +" ");
		fw.write(40 +" ");
		fw.write(50 +" ");
		fw.write("\n");
		fw.close();
		System.out.println("done saved");
	}

}
