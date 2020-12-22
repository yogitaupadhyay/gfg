import java.io.*;
import java.util.*;
public class Req1{
	public static void main(String args[])throws IOException, FileNotFoundException{
		//write();
		read();
	}
	public static void read()throws IOException, FileNotFoundException{
		BufferedReader br=new BufferedReader(new FileReader("data.txt"));
		String dataread=br.readLine();
		String [] splittedData=dataread.split(" ");
		System.out.println(splittedData[0]);
		System.out.println(splittedData[1]);
		System.out.println(splittedData[2]);
		System.out.println(splittedData[3]);
		System.out.println(splittedData[4]);
		
		
		
	}
	
	public static void write()throws IOException, FileNotFoundException{
		FileWriter fw=new FileWriter("data.txt");
		fw.write(10+" ");
		fw.write(20+" ");
		fw.write(30+" ");
		fw.write(40+" ");
		fw.write(50+" ");
		fw.write("\n");
		System.out.println("file saved successfully");
		fw.close();
	}
}