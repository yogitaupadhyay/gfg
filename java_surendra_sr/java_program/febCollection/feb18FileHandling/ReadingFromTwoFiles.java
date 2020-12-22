import java.io.*;
import java.util.*;
public class ReadingFromTwoFiles{
	public static void main(String args[]) throws Exception{
		File file1=new File("file1.txt");
		File file2=new File("file2.txt");
		
		FileInputStream fis1=new FileInputStream(file1);
		FileInputStream fis2=new FileInputStream(file2);
		int data;
		while((data=fis1.read())!=-1){
			System.out.print((char)data);
		}
		while((data=fis2.read())!=-1){
			System.out.print((char)data);
		}
		
	}
}
