import java.io.*;
import java.util.*;
public class ReadingWriting{
	public static void main(String args[])throws Exception{
		FileInputStream fis=null;
		FileOutputStream fos=null;
		String filename="C:\\Users\\pc\\Desktop\\yogita_upadhyay\\images\\ball-ball-shaped-blur-302743.jpg";
		fis =new FileInputStream(filename);
        //byte[] byteArraySize=new byte[1024];//1 kb
        byte[] byteArraySize=new byte[1024*1024];//1 mb
		int totalFileSize=0;
		int fileno=0;
		int totaldatareadOnce=0;
		while((totaldatareadOnce=fis.read(byteArraySize))!=-1){
			System.out.println("totaldatareadOnce "+totaldatareadOnce);
			totalFileSize=totalFileSize+totaldatareadOnce;
			fos=new FileOutputStream("file_"+ ++fileno);
			fos.write(byteArraySize,0,totaldatareadOnce);
		}
		System.out.println("total size"+totalFileSize);
		fos.close();
		
	}
}