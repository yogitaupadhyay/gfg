import java.io.*;
import java.util.*;

public class OutputStreamDemo2{
	public static void main(String args[]){
		File file=new File("Myfile2.txt");
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		try{
		if(file.exists()==false){
			boolean isCreated=file.createNewFile();
		}
		//fos=new FileOutputStream(file);
		fos=new FileOutputStream(file,true);
		bos=new BufferedOutputStream(fos);
		bos.write(65);
		byte []bdata=new byte[]{22,65,35,78,9,35};
		bos.write(bdata);
		bos.write("java is simple".getBytes());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}finally{
			try{
			bos.close();
			System.out.println("file saved successfully at "+file.getAbsolutePath());
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
	}
}