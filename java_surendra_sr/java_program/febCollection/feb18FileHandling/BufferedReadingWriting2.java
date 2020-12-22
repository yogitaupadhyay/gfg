import java.io.*;
import java.util.*;
public class  BufferedReadingWriting2{
	public static void main(String args[])throws Exception{
		File file1=new File("file2.txt");
		File file2=new File("file3.txt");
		
		FileInputStream fis=new FileInputStream(file1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream(file2);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int datasize;
		byte [] bdata=new byte[1024*1024];
		long start=System.nanoTime();
		while((datasize=bis.read(bdata))!=-1){
			bos.write(bdata,0,datasize);
		}
		long end=System.nanoTime();
		System.out.println("time="+(end-start));
		System.out.println("file saved successfully");
		fis.close();
		fos.close();
	}
}