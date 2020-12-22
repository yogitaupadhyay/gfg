import java.io.*;
public class  FileWriter1{
	public static void main(String args[]){
		String filepath="writedemo.txt";
		FileWriter fw=null;
		try{
			 fw  = new FileWriter(filepath);//over write
			fw.write("hello");
		
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