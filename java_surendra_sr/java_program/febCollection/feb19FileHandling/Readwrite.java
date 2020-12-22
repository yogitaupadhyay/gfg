import java.io.*;
import java.util.*;
public class  Readwrite{
	public static void main(String args[])throws Exception{
		File file1=new File("C:\\Users\\pc\\Desktop\\yogita_upadhyay\\images\\backlit-dawn-dusk-693857.jpg");
		File file2=new File("file3");
		
		FileInputStream fis=new FileInputStream(file1);
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream(file2);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int datasize;
		byte [] bdata=new byte[(int)file1.length()];
		long start=System.nanoTime();
		while((datasize=bis.read(bdata))!=-1){
			bos.write(bdata,0,datasize);
		}
		long end=System.nanoTime();
		System.out.println("time="+(end-start));
		System.out.println("file saved successfully");
		fis.close();
		fos.close();
	}
}