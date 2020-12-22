import java.util.Comparator;


public class IntegerSortByDesc implements Comparator<Integer> {
	public int compare(Integer num1, Integer num2) {
			if(num1.intValue()>num2.intValue()){
		     return -1;
		   }else if(num1.intValue()<num2.intValue()){
		     return +1;
		   }else{
		     return 0;
		   }
	}

}
