
public class Host extends Human {

	public Host(String name) {
	   super(name);
	}

	public void identify(Human selectHuman) {
		System.out.println("Host " + name  +" Welcome " +selectHuman.getName());
		selectHuman.speak();
		selectHuman.drink();
		selectHuman.eat();
		selectHuman.walk();
		selectHuman.sit();
		
		if(selectHuman instanceof Dancer) {
			System.out.println("He or She is Dancer"  + selectHuman );
			//selectHuman.dance();
			((Dancer)selectHuman).dance();
			/*Dancer temp  = (Dancer) selectHuman;
			temp.dance();*/
			
		}
		if(selectHuman instanceof Singer) {
			System.out.println("He or She is Singer"   + selectHuman );
			((Singer)selectHuman).sing();
		}
		if(selectHuman instanceof Swimmer) {
			System.out.println("He or She is Swimmer " + selectHuman );
			((Swimmer)selectHuman).swim();
			
		}
		if(selectHuman instanceof Trainer) {
			System.out.println("He or She is Trainer  " + selectHuman );
			((Trainer)selectHuman).train();
		}
		if(selectHuman instanceof Painter) {
			System.out.println("He or She is Painter " + selectHuman );
			((Painter)selectHuman).paint();
		}
		if(selectHuman instanceof Player) {
			System.out.println("He or She is Player " + selectHuman );
			((Player)selectHuman).play();
		}
		
		if(selectHuman instanceof Docter) {
			System.out.println("He or She is Docter " + selectHuman );
			((Docter)selectHuman).checkup();
		}
			
		 
		
		
		System.out.println("++++++++++++++++++++");
		
			
		
	}

}
