import java.io.*;
import java.util.*;
public class   FileWriter2Append{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		java.util.Random rand=new java.util.Random();
		
		String filepath="writedemo.txt";
		FileWriter fw=null;
		try{
			 fw  = new FileWriter(filepath,true);//over write
			 fw.write("\ndate :"+new Date()+"\n");
			for(int i=0;i<6;i++){
				int data=rand.nextInt(6)+1;
				fw.write("\n");
				fw.write("dice no "+i+"::"+data+"\n");//can write int, char ,string
			}
		
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