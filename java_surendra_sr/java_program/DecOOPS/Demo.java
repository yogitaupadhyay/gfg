public class Demo{
	public static void main(String args[]){
 int fontsize=10;
float height=100f;
float width=400f;
String title="yogita";
Calculator calc=new Calculator(title, height, width,fontsize);
System.out.println(calc.fontSize);
System.out.println(calc.width);
System.out.println(calc.height);
System.out.println(calc.title);

	}
	
	
}