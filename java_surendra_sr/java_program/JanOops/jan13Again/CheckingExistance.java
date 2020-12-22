import java.io.*;
public class CheckingExistance{
	public static void main(String args[]){
		String path="C:\\Users\\pc\\Desktop\\yogita_upadhyay\\images";
		File file =new File(path);
		if(file.exists()){
			System.out.println("file found");
			if(file.isDirectory()){
				System.out.println("given path is of dir");
			}else{
				System.out.println("given path is of file");
				
			}
				
		}else{
			System.out.println("file noit found");
		}
	}
}