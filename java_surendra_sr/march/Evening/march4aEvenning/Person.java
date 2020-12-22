
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
 
   CurrentYear 2019 
 */

public class Person implements Comparable<Person> {
  int age;
  String name;
  
  
public Person(int age, String name) {
	this.age = age;
	this.name = name;
}


@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]\n";
}


@Override
public int compareTo(Person other) {
	  if(age>other.age) {
		  return -1;
	  }else  if(age<other.age) {
		  return +1;
	  }else {
		  return 0;
	  }
}
  
  
  
  
}
