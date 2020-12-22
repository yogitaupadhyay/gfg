public class Bag extends  HouseHoldThings{
	void jipOpen(){
		
		System.out.println("Bag jip openend");
	}
	Bag(){
		System.out.println("Bag object created");
	}
	static  {
	System.out.println("Bag static block is called");
		}
  {
	System.out.println("Bag non-static block is called");
		}
		
}