public class shoopkeeper{
	Ball []toys={
		new FancyBall(),new SteelBall(),new WoodBall(),
		new GlassBall(),new RubberBall()
	};
	Ball []returntoyaddress(){
		return toys;
	}
	 void whereAboutOfToy(Ball toy){
		
		if(toy instanceof Bounceable){
			System.out.println(toy +" ball bounce");
			Bounceable b=(Bounceable)toy;
			b.bounce();
		}
		if(toy instanceof Breakable){
			System.out.println(toy +" ball breaks");
			Breakable br=(Breakable)toy;
			br.break1();
		}
		
	}
}