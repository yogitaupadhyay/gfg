public class BinaryTreeHeight{
	public static void main(String args[]){
		System.out.println("enter no of node");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		int hEntered=scan.nextInt();
		int rEntered=scan.nextInt();
		int total_height=(int)(Math.log(n+1)/Math.log(2))-1;
		if(total_height!=((Math.log(n+1)/Math.log(2))-1)){
			total_height=total_height+1;
		}
		System.out.println("heigfht="+total_height);
		if(hEntered<total_height){
			System.out.println(Math.pow(2,hEntered));
		}else if(hEntered==total_height){
			double r=n-Math.pow(2,hEntered)+1;
			System.out.println(r);
		}
		rEntered=total_height-rEntered;
		System.out.println("rEntered="+rEntered);
				if(rEntered<total_height){
			System.out.println(Math.pow(2,rEntered));
		}else if(rEntered==total_height){
			double r=n-Math.pow(2,rEntered)+1;
			System.out.println(r);
		}
		
	}
}