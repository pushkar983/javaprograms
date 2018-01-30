import java.util.Scanner;
import java.io.*;

public class IsPrime {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter number to check");
		int num=sr.nextInt();
		int i,flag=0;
		for(i=2;i<10;i++) {
			
			if(num!=i && num>i) {
				
				if(num%i==0) {
				flag=1;
				break;
				}
			}
		}
		if(flag==1)
		    System.out.println("not a prime number");
		else if(flag==0)
			System.out.println("a prime number");

		}
}