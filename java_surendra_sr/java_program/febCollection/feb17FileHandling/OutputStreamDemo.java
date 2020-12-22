import java.io.*;
import java.util.*;

public class OutputStreamDemo{
	public static void main(String args[]){
		File file=new File("Myfile.txt");
		FileOutputStream fos=null;
		try{
		if(file.exists()==false){
			boolean isCreated=file.createNewFile();
		}
		//fos=new FileOutputStream(file);
		fos=new FileOutputStream(file,true);
		fos.write(65);
		byte []bdata=new byte[]{22,65,35,78,9,35};
		fos.write(bdata);
		fos.write("java is simple".getBytes());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}finally{
			try{
			fos.close();
			System.out.println("file saved successfully at "+file.getAbsolutePath());
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}
}