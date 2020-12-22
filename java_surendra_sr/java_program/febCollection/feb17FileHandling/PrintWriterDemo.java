import java.util.*;
import java.io.*;

public class  PrintWriterDemo{
	public static void main(String args[]){
		String filename="trainlog2.txt";
			PrintWriter pr=null;
			try{
		Random rand=new Random();
			pr=new PrintWriter(filename);
		for(int i=1;i<=10;i++){
			int id=rand.nextInt(1000000);
			int price=rand.nextInt(210)+100;
			String name="name"+i;
			boolean isAvailable=rand.nextBoolean();
			
			pr.format("%10d",id);
			pr.format("%20s",name);
			pr.format("%10d",price);
			pr.format("%15s",isAvailable);
			pr.println();
		}
			
			
			}catch(Exception e){
				System.out.println("exception "+e.getMessage());
			}finally{
				try{
				pr.close();
				System.out.println("file saved successfully");
				}catch(Exception e){
					System.out.println("message"+e.getMessage());
				}
			}
			
	}
}