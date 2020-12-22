public class Party {
	public static  void main(String args[]){
		Host ht=new Host("hari");
		Human[] h1={new Human("vaishali") ,new Dancer("savita"),
		new Singer("shraddha"),new Player("yogita"),
		new Trainer("niranjana"), new Doctor("madhu"),
			};
		for(int i=1;i<=h1.length;i++){
			ht.identify(h1[i-1]);
			
		}	
		
	}
	
}