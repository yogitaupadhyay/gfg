public class Host extends Human{
	Host(String name){
		super(name);
		}
		
		void identify(Human h1){
			if(h1 instanceof Human){
			  h1.eat();
			  h1.walk();
			  h1.talk();
			  h1.drink();
}
			
			if(h1 instanceof  Dancer){
				System.out.println(name+"is Dancer...");
				((Dancer)h1).dance();
				
			}
			if(h1 instanceof Singer){
				System.out.println(name+"is singer...");
				((Singer)h1).sing();
				
			}
			if(h1 instanceof Player){
				System.out.println(name+"is palyer...");
				((Player)h1).play();
				
			}
			if(h1 instanceof Trainer){
				System.out.println(name+"is trainer  ...");
				((Trainer)h1).train();
				
			}
			if(h1 instanceof  Doctor){
				System.out.println(name+"is Doctor...");
				((Doctor)h1).examin();
				
			}
			
		}
	

 }//end of class