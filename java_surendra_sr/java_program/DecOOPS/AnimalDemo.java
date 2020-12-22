public class AnimalDemo{
public static void main(String args[])throws Exception{
  java.util.Scanner scan=new java.util.Scanner(System.in);
  System.out.println("enter ur type");
  String  type=scan.nextLine();
  Class c=Class.forName(type);
  Object obj=c.newInstance();
  System.out.println(obj);
  if(obj instanceof Animal){
	  Animal a=(Animal)obj;
		a.speak();
		a.eat();
		a.sleep();
		a.makenoise();
	  
  }
  
  
}
}