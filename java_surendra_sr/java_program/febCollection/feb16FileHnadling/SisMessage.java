import java.io.*;
public class SisMessage{
	public static void main(String args[]){
		String filepath="sis_msg.txt";
		FileReader fr=null;
		LineNumberReader lnr=null;
		String [] sis_array=new String[10];
		try{
			fr=new FileReader(filepath);//file open
			lnr=new LineNumberReader(fr);
			String data;
			int pos=1;
			while((data=lnr.readLine())!=null){
	            sis_array[pos-1]= data;
				pos++;
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
		for(String data:sis_array){
			System.out.println(data);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
	}
}