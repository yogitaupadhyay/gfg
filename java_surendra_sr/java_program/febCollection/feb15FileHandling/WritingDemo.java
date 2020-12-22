import java.io.*;
import java.util.*;
public class WritingDemo{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		java.util.Random rand=new java.util.Random();
		
		String filepath="charStringInt.txt";
		FileWriter fw=null;
		try{
			 fw  = new FileWriter(filepath,true);//over write
			 fw.write(65);
			 fw.write('a');
			 fw.write("java is simple");
			
		
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception :"+e.getMessage());
			
		}finally{
			try{
				fw.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
		}
	}
}