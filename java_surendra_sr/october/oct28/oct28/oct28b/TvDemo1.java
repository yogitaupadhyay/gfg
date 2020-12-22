import java.util.Random;

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

public class TvDemo1 {

	public static void main(String[] args) {
	 
		Tv tv1  = new NormalTv();
		Tv tv2  = new AbajTv();
		Tv tv3  = new LGLedTv();
		
		Tv[] myTvList= {tv1,tv2,tv3};
		Random rand  = new Random();
		int pickIndex = rand.nextInt(myTvList.length);
		Tv selectedTv = myTvList[pickIndex];
		
		System.out.println(selectedTv);
		
		selectedTv.on();
		selectedTv.display();
		selectedTv.volUp();
		selectedTv.volDown();
		selectedTv.off();
		
		
		
		
		
		

	}

}
