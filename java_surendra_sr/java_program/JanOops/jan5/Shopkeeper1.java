public class Shopkeeper1{
	Toy []toys={
		new mobile(),new Car(),new Train(),
		new Gun(),new Teddy(),new Sword()
	};
	Toy []returntoyaddress(){
		return toys;
	}
	 void whereAboutOfToy(Toy toy){
		
		if(toy instanceof Washable){
			System.out.println(toy +": toy is washable");
		}
		if(toy instanceof Dangerous){
			System.out.println(toy +" : toy is Dangerous");
			
		}
		
	}
}