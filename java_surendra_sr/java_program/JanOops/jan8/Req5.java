public class Req5{
	public static void main(String args[]){
	try{
		String s1=args[0];
		String s2=args[1];
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		System.out.println("enter two numbers");
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
	}catch(ArithmeticException e){
		System.out.println("second no should not be 0:didvide by zero error");
		
	}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("eneter two numbers");
		
	}catch(NumberFormatException e){
		System.out.println("both args should be int");
		
	}
	}
}