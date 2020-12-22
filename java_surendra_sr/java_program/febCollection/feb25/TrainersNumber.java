import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TrainersNumber{
	public static void main(String args[]){
		HashSet<Integer>trainerno=new HashSet<Integer>();
		java.util.Random rand=new java.util.Random();
		do{
			int num=rand.nextInt(40)+1;
			System.out.print(num+"  ");
			trainerno.add(num);
		}while(trainerno.size()!=15);
			System.out.println("size="+trainerno.size());
			System.out.println(trainerno);
			System.out.println("================================");
			System.out.println();
			LinkedHashSet<Integer>ltrainerno=new LinkedHashSet<Integer>();
		
		do{
			int num1=rand.nextInt(40)+1;
			System.out.print(num1+"  ");
			ltrainerno.add(num1);
		}while(ltrainerno.size()!=15);
			System.out.println("lsize="+ltrainerno.size());
			System.out.println(ltrainerno);
			System.out.println("================================");
		System.out.println();
		
		TreeSet<Integer>ttrainerno=new TreeSet<Integer>();
		
		do{
			int num2=rand.nextInt(40)+1;
			System.out.print(num2+"  ");
			ttrainerno.add(num2);
		}while(ttrainerno.size()!=15);
			System.out.println("tsize="+ttrainerno.size());
			System.out.println(ttrainerno);
	}
}