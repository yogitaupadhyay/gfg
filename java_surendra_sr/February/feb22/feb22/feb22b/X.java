import java.io.Serializable;

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

public class X implements Serializable{
   private int i; 
   private int j; 
   private int k;
   
   
  transient private int l; 
  transient  private int m;
  private String featureX;
  private int featureY;
  static int totalObject; 
  public X(){
	  totalObject++;
	  
  }
   
  
public X(int i, int j, int k, int l, int m) {
	this();
	this.i = i;
	this.j = j;
	this.k = k;
	this.l = l;
	this.m = m;
}


public int getI() {
	return i;
}


public void setI(int i) {
	this.i = i;
}


public int getJ() {
	return j;
}


public void setJ(int j) {
	this.j = j;
}


public int getK() {
	return k;
}


public void setK(int k) {
	this.k = k;
}


public int getL() {
	return l;
}


public void setL(int l) {
	this.l = l;
}


public int getM() {
	return m;
}


public void setM(int m) {
	this.m = m;
}


public void  show() {
	String str = "X [i=" + i + ", j=" + j 
			+ ", k=" + k 
			+ ", l=" + l 
			+ ", m=" + m
			+ ", totalObject" + totalObject
			+ "]";
	System.out.println(this+str);
}
   
   
   
   
   
}
