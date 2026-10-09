package batch3;
import java.util.Scanner;
public class dynamicread1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
        System.out.println("------------------------------");
		System.out.println("enter address");
		String addr=sc.nextLine();
        System.out.println("------------------------------");
		System.out.println("select your gender:m/f");
		char gender=sc.next().charAt(0);
        System.out.println("------------------------------");
		System.out.println("enter age");
		int age=sc.nextInt();
        System.out.println("------------------------------");
		System.out.println("the abow details are currect or wrong");
		boolean b=sc.nextBoolean();
        sc.nextLine();
        System.out.println("------------------------------");
		System.out.println("enter ur collage");
		String clg=sc.nextLine();
		System.out.println("------------------------------");
		System.out.println("student roll number");
		int roll=sc.nextInt();
        sc.nextLine();
		System.out.println("------------------------------");
		System.out.println("enter ur subjects u have");
		String sub=sc.nextLine();
		System.out.println("your details are hear");
		System.out.println(name+" "+addr+" "+gender+" "+age+" "+clg+" "+roll+" "+sub);
	}

}
