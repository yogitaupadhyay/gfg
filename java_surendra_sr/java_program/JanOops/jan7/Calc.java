public class Calc{
	public static void main(String args[]){
		String str1=null;
		String str2=null;
		Integer a=null;
		Integer b=null;
		
		//try
		try{
		str1=args[0];
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("plz enter first number");
		e.printStackTrace();
		return;
		}
		
		
		//try
		try{
		str2=args[1];
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("plz enter second number");
				e.printStackTrace();
		return;
		}
		
		//try
		try{
		 a=Integer.parseInt(str1);
		}catch(NumberFormatException e){
		System.out.println("plz enter first argument as interger");
		//e.printStackTrace();
		return;
		}
		
		//try
		try{
		 b=Integer.parseInt(str2);
		}catch(NumberFormatException e){
		System.out.println("plz enter second argument as interger");
		//e.printStackTrace();
		return;
		}
		int c=0;
		
		c=a+b;
		
		System.out.println(a+" + "+b+" = "+c);
		
	}
}