


public class PartyDemo {

	public static void main(String[] args) throws Exception {
		Host host = new Host("Sujay");
		
		Human []manyHumans = { 
				new  Trainer("Surendra"), 
				new Dancer("Mithun"),	
				new  Painter("Om Prakash"),
			    new Player("Yogita"),
			    new Human("Ravi"), 
			    new Singer("Lata"),
			    new  Swimmer("Vishal"),
			    new Player("Arjun"),
				new  Docter("Patel"),
		};
		System.out.println(manyHumans.length);
		
		for(int h=1;h<=manyHumans.length;h++) {
			Human selectHuman  = manyHumans[h-1];
			host.identify(selectHuman);
			
			Thread.sleep(1000);
		}
		
		
	}

}
