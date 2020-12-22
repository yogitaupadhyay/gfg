import java.util.Arrays;

/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2018 
 */

public class StringUniqueRecord {
public static void main(String[] args) {
	String arr1[]= {
	 "rama", "ramesh", "rama", "gita", "rama", "gita", "ramesh",
	};
	
	System.out.println("total record " +arr1.length);
	String fillArr[] = new String[arr1.length];
	
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(fillArr));
	
	for(int n=1;n<=arr1.length;n++) {
	String searchName=arr1[n-1];
		boolean found  = SisSearchUtil.search(fillArr,searchName);
		if(found==false) {
			SisArrayFillUtil.fill(fillArr,searchName);
		}
	}
	
	System.out.println(Arrays.toString(fillArr));
	
	
	//resize array if found null values
	fillArr  = SisArrayResizeUtil.resize(fillArr);
	System.out.println(Arrays.toString(fillArr));
	
	
	
	
	
	
	
	
}
}
