import java.io.*;
public class CreatingNewFile{
	public static void main(String args[]){
		String path="testing1";
		File file =new File(path);
		if(file.exists()){
			System.out.println("file found");
			if(file.isDirectory()){
				System.out.println("given path is of dir");
			}else{
				System.out.println("given path is of file");
				
			}
				
		}else{
			System.out.println("file not found");
			try{
			boolean isCreated=file.createNewFile();
			System.out.println(isCreated?"file created":"file not created");
			System.out.println("path : "+file.getPath()	);
			System.out.println("name : "+file.getName());
			System.out.println("absolute path :"+file.getAbsolutePath());
			System.out.println("last modified :"+file.lastModified());
			}catch(IOException e){
				System.out.println("io exception");
				
			}
		}
	}
}