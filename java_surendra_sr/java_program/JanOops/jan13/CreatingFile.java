public class CreatingFile{
    public static void main(String args[]){
	if(args.length<1){
			System.out.println("plz enter th file name");
			System.exit(0);
		}
		String filename=args[0];
		java.io.File file=new java.io.File(filename);
		try{
		if(!file.exists()){
			boolean iscreated=file.createNewFile();
			System.out.println(iscreated?"file is created":"file not created");
			System.out.println(file.getName());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			
		}else{
			
			System.out.println("file  already exists");
		}
		}catch(java.io.IOException e){
			System.out.println("file could not be created ");
			System.out.println(e.getMessage());
			
		}
    }
}