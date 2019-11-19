package nit.com;

import java.util.Scanner;

public class DateSoftware {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		
		int []month_Days={31,28 ,31,30,31,30,31,31,30,31,30,31};
		
		   System.out.println("enter the year month date");
		    Scanner scan=new Scanner(System.in);
		    int year=scan.nextInt();
		    int month1=scan.nextInt();
		    int date1=scan.nextInt();
		  
		    int new_year=year%400;
		    int odd_days=(new_year/100)*5;
		    new_year=(new_year-1)%100;
		    int normal_year=new_year-new_year/4;
		    odd_days=odd_days+(new_year/4)*2+normal_year;
		    odd_days=odd_days%7;
		    
		    
		    int sum_of_days=0;
		    for(int i=0;i<(month1-1);i++){
		    	sum_of_days=sum_of_days+month_Days[i];
		    }
		    if(year%4==0&&year%100!=0||year%400==0&&month1>2){
		    	sum_of_days=sum_of_days+1;
		    }
		    sum_of_days=sum_of_days+date1;
		    odd_days=(odd_days+sum_of_days%7)%7;
		    String day="";
		   switch(odd_days){
		   case 0:
			   day="Sunday";
			   break;
		   case 1:
			   day="Monday";
			   break;
		   case 2:
			   day="Tuesday";
			   break;
			   
		   case 3:
			   day="WednesDay";
			   break;
		   case 4:
			   day="Thursday";
			   break;
		   case 5:
			   day="Friday";
			   break;
		   case 6:
			   day="Saturday";
			   break;
		  
		   }
		   System.out.println(day);
	}

}
