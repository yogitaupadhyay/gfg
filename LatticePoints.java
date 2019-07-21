public class  LatticePoints{
	public static void main(String args[]){
		System.out.println("enter trhe radius");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int radius =scan.nextInt();
		int res=4;
		if(radius<1){
			res=0;
			System.out.println("res="+res);
			System.exit(0);
		}
		
		for(int x=1;x<radius;x++){
			int temp=radius*radius-x*x;
			int y=(int)Math.sqrt(temp);
			if(y*y==temp){
				res=res+4;
			}
		}
		System.out.println("res="+res);
	}
}