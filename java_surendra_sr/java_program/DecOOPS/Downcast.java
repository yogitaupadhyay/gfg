public class Downcast{
	 public static void main(String args[]){
		Singer s=new Singer("ramesh");
		Human h=new Human("suresh");
		
		 Singer h1=s;
		// Singer h2=h;  cte
		//Singer h2=(Singer)h;   rte
		
		/*Human h1=new Singer("vaishali");
		//h1.sing();
		
		Singer  s2=(Singer)h1;
		s2.sing();*/
		
		
		 
		 
	 }
	 
 }