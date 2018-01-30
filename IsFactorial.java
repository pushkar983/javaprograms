import java.util.Scanner;
import java.io.*;

public class IsFactorial {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter number");
		int num=sr.nextInt();
		int i,fact=1;
		for(i=2;i<=num;i++) {
			
			fact=fact*i;
			
		}
			System.out.println(fact);
		
	}

}
