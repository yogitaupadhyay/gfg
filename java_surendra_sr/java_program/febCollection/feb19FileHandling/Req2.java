import java.io.*;
import java.util.*;
public class Req2{
	public static void main(String args[])throws IOException, FileNotFoundException{
		//write();
		read();
	}
	public static void read()throws IOException, FileNotFoundException{
	FileInputStream fis=new FileInputStream("data2.txt");
		int data;
		while((data=fis.read())!=-1){
		System.out.print((char)data);
		}
		fis.close();
	}
	
	public static void write()throws IOException, FileNotFoundException{
	FileOutputStream  fos=new FileOutputStream("data2.txt");
	fos.write((10+" ").getBytes());
	fos.write((20+" ").getBytes());
	fos.write((30+" ").getBytes());
	fos.write((40+" ").getBytes());
	fos.write((50+" ").getBytes());
	System.out.println("file closed successfully");
		fos.close();
	}
}