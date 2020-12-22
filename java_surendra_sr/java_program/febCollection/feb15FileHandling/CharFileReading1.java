import java.io.*;
public class CharFileReading1{
	public static void main(String args[]){
		String filepath="info.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try{
			fr=new FileReader(filepath);//file open
			br=new BufferedReader(fr);
			String data;
			int line =1;
			while((data=br.readLine())!=null){
			System.out.println(line +"\t"+ data);
				
				line++;
			}
			 
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception :"+e.getMessage());
			
		}finally{
			try{
				br.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
		}
	}
}