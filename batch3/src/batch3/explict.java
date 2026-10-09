package batch3;

public class explict {
public static void  main(String[] args) {
	//typecast operator ::(int),(float),(long),(double)
	//explicit highest to lowest-->manually using type-cast(int) operator
	// there is a chance to loss of dta
	float i=92.3f;
	int h=12;
	int res=h=(int)i;
	System.out.println(res);
	//lont---> to float
	long l=1234455778;
	float f=1.67f;
	float res=l+f;//implicit
	System.out.println(res);
	long res1=l=(long)f;// explicit
	System.out.println(res1);
	
}
}
