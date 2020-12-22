public class Mother{
	public static void main(String args[]){
		shoopkeeper sh=new shoopkeeper();
		Ball toys[]=sh.returntoyaddress();
		for(int i=1;i<=toys.length;i++){
			System.out.println( "toy selected  :  "+toys[i-1]);
			sh.whereAboutOfToy(toys[i-1]);
			
		}
		
	}
}