import java.io.*;
import java.util.*;
public class NormalReadingWriting{
	public static void main(String args[])throws Exception{
		File file1=new File("file2.txt");
		File file2=new File("file3.txt");
		
		FileInputStream fis=new FileInputStream(file1);
		FileOutputStream fos=new FileOutputStream(file2);
		int data;
		long start=System.nanoTime();
		while((data=fis.read())!=-1){
			fos.write(data);
		}
		long end=System.nanoTime();
		System.out.println("time="+(end-start));
		System.out.println("file saved successfully");
		fis.close();
		fos.close();
	}
}