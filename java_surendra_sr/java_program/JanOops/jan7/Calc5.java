public class Calc5{
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
		  int c=0;
		c=a+b;
		System.out.println(a+" + "+b+" = "+c);
		}catch(IndexOutOfBoundsException e){
		System.out.println("plz enter 2 numbers number");
		e.printStackTrace();
		
		}catch(ArrayIndexOutOfBoundsException e){    //error
		System.out.println("plz enter 2 numbers number");
		e.printStackTrace();
		
		}catch(NumberFormatException e){
		System.out.println("plz enter both argument as interger");
		
		}
		System.out.println("happy ending");
		
		
		
		
	}
}