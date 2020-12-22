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
 */

  //Date  12/09/2018
 public class Demo1 {

	public static void main(String args[]){
/*	
	  char []vowelList =null;
	  vowelList = new char[5];
	  vowelList[0] = 'a';
	  vowelList[1] = 'e';
	  vowelList[2] = 'i';
	  vowelList[3] = 'o';
	  vowelList[4] = 'u';
	*/
	  char []vowelList ={'a','e','i','o','u'};

	
	  for(int vowel=1;vowel<=vowelList.length;vowel++){
	   System.out.println("vowel #" + vowel  +"  =  "  + vowelList[vowel-1]);
	  
	  }
	  
	  String [] daysName = null;
	  daysName = new String[7];
	  
	  daysName[0] = "mon";
	  daysName[1] = "tue";
	  daysName[2] = "wed";
	  daysName[3] = "thu";
	  daysName[4] = "fri";
	  daysName[5] = "sat";
	  daysName[6] = "sun";
	  
	  
	  System.out.println(daysName);
	  
	  for(int day=1;day<=daysName.length;day++){
	   System.out.println(daysName[day-1]);
	  }
	  
	  
	  
	  
	}//end main

}//end class