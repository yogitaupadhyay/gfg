package travel.com.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Availability implements Comparable<Availability>{
Date arrival;
Date departure;
 public Availability(){
	
}
 /*@Override
 public int compareTo(Availability avail){
	 if(this.arrival.before(avail.arrival)){
		 return -1;
	 }else if(this.arrival.after(avail.arrival)){
		 return 1;
	 }else{
		 return 0;
	 }
 }
 */
 
		
public Date getArrival() {
	return arrival;
}

public void setArrival(Date arrival) {
	this.arrival = arrival;
}

public Date getDeparture() {
	return departure;
}

public void setDeparture(Date departure) {
	this.departure = departure;
}	


@Override
public int compareTo(Availability avail){
 if(this.arrival.before(avail.arrival)){
	 return -1;
 }else if(this.arrival.after(avail.arrival)){
	 return 1;
 }else{
	 return 0;
 }
}
}


