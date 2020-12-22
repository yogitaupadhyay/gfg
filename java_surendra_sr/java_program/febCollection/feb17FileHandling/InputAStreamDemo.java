import java.io.*;
import java.util.*;

public class InputAStreamDemo{
	public static void main(String args[]){
		if(args.length<1){
			System.out.println("pls enter file name");
			System.exit(0);
		}
		String filename=args[0];
		File file =new File(filename);
		FileInputStream fis=null;
		int data;
		try{
		fis=new FileInputStream(file);
		long start=System.nanoTime();
		while((data=fis.read())!=-1){
			//System.out.println((char)data);
			//System.out.println(data);
			
		}
		long end=System.nanoTime();
			System.out.println((end-start));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			try{
			fis.close();
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
	}
}