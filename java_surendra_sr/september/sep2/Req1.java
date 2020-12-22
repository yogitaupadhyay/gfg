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

  //Date  02/09/2018
 public class Req1 {

	public static void main(String args[]){
	
	  String [] dayNames= {"MON","TUE","WED","THU","FRI","SAT","SUN"};
	  int [][] kmData ={
									   {20,40,30,35,20,67,20},
									   {20,43,60,70,20,20,76},
									   {40,60,20,20,96,20,20},
									   {30,20,50,80,20,70,48},
									   {20,80,20,43,20,40,90},
								};
	  
	System.out.printf("%10s",  "week/day");
	  for(int day=1;day<=dayNames.length;day++){
	     System.out.printf("%4s" ,dayNames[day-1]);
	  }
	  
	System.out.println();
	  System.out.println();
	  for(int week=1;week<=kmData.length;week++){
			System.out.printf("%10s" , "week "+ week);
			for(int day=1;day<=kmData[week-1].length;day++){
			  System.out.printf("%4d",kmData[week-1][day-1]);
			}//day
				System.out.println();
	}//week
	  
	  
	  int totalKm = 0;
	  int totalDays =0;
	  int minKm =kmData[0][0];
	  int maxKm =kmData[0][0];
	  
	    for(int week=1;week<=kmData.length;week++){
			for(int day=1;day<=kmData[week-1].length;day++){
			 totalKm = totalKm  +kmData[week-1][day-1];
			 totalDays++;
			 
			 if(minKm>kmData[week-1][day-1]){
			   minKm = kmData[week-1][day-1];
			 }
			 if(maxKm<kmData[week-1][day-1]){
			   maxKm = kmData[week-1][day-1];
			 }
			}//day
    	}//week
	  
	int [] weekWiseTotalKm = new int[kmData.length];
	     for(int week=1;week<=kmData.length;week++){
		     int wsum=0;
			for(int day=1;day<=kmData[week-1].length;day++){
			   wsum = wsum +  kmData[week-1][day-1];
			}
			weekWiseTotalKm[week-1] =wsum;
		}	

	int [] dayWiseTotalKm = new int[dayNames.length];

	for(int day=1;day<=dayNames.length;day++){
				int daySum=0;
	           for(int week=1;week<=kmData.length;week++){
			    daySum = daySum+ kmData[week-1][day-1];
			   }
			   dayWiseTotalKm[day-1] =daySum;
	}
		
		System.out.println("+++++++++++++++Report+++++++++++++++++++");
		
		System.out.printf("%10s",  "week/day");
	  for(int day=1;day<=dayNames.length;day++){
	     System.out.printf("%4s" ,dayNames[day-1]);
	  }
		System.out.printf("%12s",  "weekWiseSum");
	  
		System.out.println();
	   System.out.println();
	  for(int week=1;week<=kmData.length;week++){
			//part1
			System.out.printf("%10s" , "week "+ week);
			//part2
			for(int day=1;day<=kmData[week-1].length;day++){
			  System.out.printf("%4d",kmData[week-1][day-1]);
			}//day
			
			//part3
			System.out.printf("%12d", weekWiseTotalKm[week-1]);
			//part4
				System.out.println();
	}//week
	
		//part 5
		System.out.println("++++++++++++++++++++++++++++++++++++++");
		System.out.printf("%10s" , "dw sum");
		for(int day=1;day<=dayNames.length;day++){
			  System.out.printf("%4d", dayWiseTotalKm[day-1]);
		}
		
		System.out.println();
		System.out.println("____________________________");
 
		System.out.println("totalKm " + totalKm);
		System.out.println("totalDays " + totalDays);
		System.out.println("totalDays " +(totalKm/ totalDays));
		System.out.println("totalDays " +((float)totalKm/ totalDays));
		System.out.println("minKm " +minKm );
		System.out.println("maxKm " +maxKm );
		
		System.out.println("totalKm  req patrol " + totalKm/15);
		System.out.println("totalKm  req patrol " +( (totalKm/15)*75));
		
	}//end main

}//end class