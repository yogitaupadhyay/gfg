import java.io.*;
public class CharFileReading{
	public static void main(String args[]){
		String filepath="info.txt";
		FileReader fr=null;
		try{
			fr=new FileReader(filepath);//file open
			/*char data =(char)fr.read();
			System.out.println("data :"+data);
			 data =(char)fr.read();
			System.out.println("data :"+data);*/
			int data;
			while((data=fr.read())!=-1){
			System.out.print((char)data);
				Thread.sleep(5);
			}
			 
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception :"+e.getMessage());
			
		}finally{
			try{
				fr.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
		}
	}
}