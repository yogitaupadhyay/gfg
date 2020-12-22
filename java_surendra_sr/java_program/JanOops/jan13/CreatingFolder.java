public class CreatingFolder{
    public static void main(String args[]){
	if(args.length<1){
			System.out.println("plz enter th folder name");
			System.exit(0);
		}
		String filename=args[0];
		java.io.File file=new java.io.File(filename);
		
		if(!file.exists()){
			boolean iscreated=file.mkdir();
			System.out.println(iscreated?"folder is created":"file not created");
			System.out.println(file.getName());
			//System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			
		}else{
			
			System.out.println("folder  already exists");
		}
		
    }
}