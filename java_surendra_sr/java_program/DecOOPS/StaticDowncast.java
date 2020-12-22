public class StaticDowncast{
	 public static void main(String args[]){
		Singer s=new Singer("ramesh");
		Human h=new Human("suresh");
		
		 Singer h1=s;
		// Singer h2=h;  cte
		//Singer h2=(Singer)h; rte
		 
		 s.eat();//static method from child as 
		 
		 s.sing();//method from child
		 System.out.println("************************");
		 Human h4=s;
		 h4.eat();//static method from parent
		 //h4.sing();not overrided method
	 }
	 
 }