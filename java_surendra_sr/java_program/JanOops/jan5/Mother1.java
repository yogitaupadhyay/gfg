public class Mother1 {
	public static void main( String args[]){
		Shopkeeper1 sh=new Shopkeeper1();
		Toy toys[]=sh.returntoyaddress();
		for(int i=1;i<=toys.length;i++){
			System.out.println( "toy selected  :  "+toys[i-1]);
			sh.whereAboutOfToy(toys[i-1]);
			
		}
	}
}