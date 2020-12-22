import java.io.*;
public class  LineNumberreader{
	public static void main(String args[]){
		String filepath="info.txt";
		FileReader fr=null;
		LineNumberReader lnr=null;
		
		try{
			fr=new FileReader(filepath);//file open
			lnr=new LineNumberReader(fr);
			String data;
			while((data=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber() +"\t"+ data);
			}
			 
		}catch(IOException e){
			System.out.println("IOException :"+e.getMessage());
			
		}catch(Exception e){
			System.out.println("Exception :"+e.getMessage());
			
		}finally{
			try{
				lnr.close();
			}catch(IOException e){
				System.out.println("IOException :"+e.getMessage());
			}
		}
	}
}