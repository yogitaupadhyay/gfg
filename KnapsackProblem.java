import java.util.*;

public class KnapsackProblem{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter max weight");
		float maxvalue=scan.nextInt();
		System.out.println("enter no item");
		int noOfItem=scan.nextInt();
		ArrayList<Integer>amount=new ArrayList<Integer>();
		ArrayList<Integer>value=new ArrayList<Integer>();
		ArrayList<Float>density=new ArrayList<Float>();
		System.out.println("enter weight-value");
		for(int i=0;i<noOfItem;i++){
			amount.add(scan.nextInt());
			value.add(scan.nextInt());
		    density.add(i,(float)value.get(i)/amount.get(i));   
	    }
	ArrayList<Float>temp=new ArrayList<Float>(density);
	Collections.sort(temp);
	
	float profit=0;
	float weight=0;
	for(int i=noOfItem-1;i>=0;i--){
		weight=weight+amount.get(density.indexOf(temp.get(i)));
					if(weight<= maxvalue){
		profit=profit+value.get(density.indexOf(temp.get(i)));	
					}else{
				weight=weight-amount.get(density.indexOf(temp.get(i)));
						profit=profit+(maxvalue-weight)*temp.get(i);
						weight=maxvalue;
				break;
			}
		}
	System.out.println("profit="+profit);
	System.out.println("weight="+weight);
}
}