import java.io.*;
public class TimeCalculationFileReader{
	public static void main(String args[]){
		String filepath="info1.txt";
		FileReader fr=null;
		try{
			fr=new FileReader(filepath);
			int data;
			long start =System.currentTimeMillis();
			while((data=fr.read())!=-1){
			//System.out.print((char)data);
				}
			long end=System.currentTimeMillis();
			System.out.println("total time taken :"+(end-start));
			 
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception 1:"+e.getMessage());
			
		}finally{
			if(fr!=null){
			try{
				
				fr.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
			}
		}
	}
}