public class SisBoolean {
	 public static boolean parseBoolean(java.lang.String args)throws MyCheckedException {
		 
		 if(args==null){
			throw new MyCheckedException("nothing is passed"); 
		 }
		 Boolean c1=args.equalsIgnoreCase("true");
		Boolean c2=args.equalsIgnoreCase("ha");
		Boolean c3=args.equalsIgnoreCase("yes");
		Boolean c4=args.equalsIgnoreCase("ya");
		Boolean c5=args.equalsIgnoreCase("false");
		Boolean ok=c1||c2||c3||c4||c5;
		if(ok==false){
			throw new MyCheckedException("invalid argument"); 
		}
		if(c1||c2||c3||c4){
			return true;
		}else{
			return false;
		}
		 
	 }
}