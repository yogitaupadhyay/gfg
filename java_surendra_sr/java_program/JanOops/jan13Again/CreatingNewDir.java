import java.io.*;
public class  CreatingNewDir{
	public static void main(String args[]){
		String path="testingdir2";
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
			
			boolean isCreated=file.mkdir();
			System.out.println(isCreated?"folder created":"folder not created");
			System.out.println("path : "+file.getPath()	);
			System.out.println("name : "+file.getName());
			System.out.println("absolute path :"+file.getAbsolutePath());
			
		}
	}
}