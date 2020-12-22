public class  Existsfile{
	public static void main(String args[]){
		if(args.length<1){
			System.out.println("plz enter th file name");
			System.exit(0);
		}
		String filename=args[0];
		java.io.File file=new java.io.File(filename);
		if(file.exists()){
			System.out.println("file found ");
			if(file.isDirectory()){
			System.out.println("entered name is a directory");
			}else{
			System.out.println("entered name is a file");
				
			}
		}else{
			
			System.out.println("file  not found ");
		}
	}
}