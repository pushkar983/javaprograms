import java.util.Scanner;
//import java.math.*;
import java.io.*;

public class calculator {
	
	public static void main(String [] args) {
		System.out.println("enter numbers");
		Scanner a = new Scanner(System.in);
		int n1 = a.nextInt();
		int n2 = a.nextInt();
		System.out.println("enter choice");
		int ch = a.nextInt();
		switch(ch) {
		case 1: 
			System.out.println(add(n1,n2));
			break;
		case 2:
			System.out.println(sub(n1,n2));
			break;
		case 3:
			System.out.println(mul(n1,n2));
			break;
		case 4:
			System.out.println(div(n1,n2));
			break;
		default :
				System.out.println("are 4 tak dalo bhyi");

	}
		
		

	}
public static int add(int a,int b) {
	return(a + b);
}
	public static int sub(int a,int b) {
		return(Math.abs(a - b));
	}
		public static int mul(int a,int b) {
			return(a * b);
		}
			public static int div(int a,int b) {
				return(a / b);
}
	

}
