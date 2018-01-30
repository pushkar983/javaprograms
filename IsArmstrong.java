import java.util.Scanner;
import java.io.*;


public class IsArmstrong {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a);
		boolean b = check(a);
		if(b==true)
			System.out.println("Is a armstrong number");
		else
			System.out.println("not a armstrong number");
		
	}
	public static boolean check(int num) {
		int rev = 0;
		int arm = num;
		while(num > 0) {
			int res = num % 10;
			rev = rev + (int)Math.pow(res,3);
			num = num / 10;
		}
		if(rev == arm)
			return true;
		else
			return false;
	}
}
	
