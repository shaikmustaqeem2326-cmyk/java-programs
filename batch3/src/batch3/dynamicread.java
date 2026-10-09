package batch3;
import java.util.Scanner;

public class dynamicread {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
				System.out.println("premetive values");
				System.out.println("enter value");
				int a= sc.nextInt();
				long l= sc.nextLong();
				float f= sc.nextFloat();
				double d= sc.nextDouble();
				char c= sc.next().charAt(0);
				boolean b= sc.nextBoolean();
				System.out.println(a+" "+l+" "+f+" "+d+" "+c+" "+b);
			}

		

	}


