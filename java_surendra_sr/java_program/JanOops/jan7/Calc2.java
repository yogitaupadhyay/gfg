public class Calc2{
	public static void main(String args[]){
		String str1=null;
		String str2=null;
		Integer a=null;
		Integer b=null;
		
		//try
		try{
		str1=args[0];
		str2=args[1];
		a=Integer.parseInt(str1);
		  b=Integer.parseInt(str2);
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("plz enter 2 numbers number");
		e.printStackTrace();
		return;
		}catch(NumberFormatException e){
		System.out.println("plz enter both argument as interger");
		//e.printStackTrace();
		return;
		}
		
		
		int c=0;
		c=a+b;
		System.out.println(a+" + "+b+" = "+c);
		
	}
}