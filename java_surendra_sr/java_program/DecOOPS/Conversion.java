public class Conversion{
	public static void main( String args[]){
		int a=10;
		//primitive -object
		Integer i=new Integer(a);
		System.out.println("i="+i);
		
		//primitive to string
		String s=String.valueOf(a);
		System.out.println("s="+s);
		
		Integer b=new Integer(300);
		// object to primitive
		int c=b.intValue();
		System.out.println("c="+c);
		//object to string 
		String str=b.toString();
		System.out.println("str="+str);
		
		
		String s1=new String("500"); 
		//string to int
		int d=Integer.parseInt(s1);
		System.out.println("s1="+s1);
		//string to object
		int s3=new Integer(s1);
		System.out.println("s3="+s3);
		
		
		
	}
	
}