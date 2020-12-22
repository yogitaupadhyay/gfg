import java.io.*;
import java.util.*;
public class SequenceInputStreamDemo{
	public static void main(String args[]) throws Exception{
		File file1=new File("file1.txt");
		File file2=new File("file2.txt");
		
		FileInputStream fis1=new FileInputStream(file1);
		FileInputStream fis2=new FileInputStream(file2);
		SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		int data;
		while((data=sis.read())!=-1){
			System.out.print((char)data);
		}
		sis.close();
	}
}
