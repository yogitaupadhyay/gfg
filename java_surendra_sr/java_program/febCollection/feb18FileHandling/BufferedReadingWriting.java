import java.io.*;
import java.util.*;
public class  BufferedReadingWriting
{
	public static void main(String args[])throws Exception{
		File file1=new File("file2.txt");
		File file2=new File("file3.txt");
		
		FileInputStream fis=new FileInputStream(file1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream(file2);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int data;
		long start=System.nanoTime();
		while((data=bis.read())!=-1){
			bos.write(data);
		}
		long end=System.nanoTime();
		System.out.println("time="+(end-start));
		System.out.println("file saved successfully");
		fis.close();
		fos.close();
	}
}