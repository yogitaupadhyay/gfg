public class DynamicLoading{
	public static void main(String args[]){
		try{
		System.out.println("enter the class name");
		java.util.Scanner scan=new java.util.Scanner(System.in);
	String classname=scan.nextLine();
	Class c=Class.forName(classname);
	Object obj=c.newInstance();
		System.out.println(obj);
		}catch(ClassNotFoundException e){
		System.out.println("no such class exit");
			
		}catch(InstantiationException e){
			
		System.out.println("object cannot created for abstract class/interface/classhaving nodefault constructor");
		}catch( IllegalAccessException e){
			
		System.out.println("object cannot created for class having private constr");	}
	
	}
} 