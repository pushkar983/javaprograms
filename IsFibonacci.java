import java.util.Scanner;
import java.io.*;

public class IsFibonacci {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter limit");
		int n=sr.nextInt();
		int i,f1=0,f2=1,f;
		for(i=0;i<=n;++i) {
			
			System.out.println(f1);
			f=f1+f2;
			f1=f2;
			f2=f;
		
		}
		
		

	}

}
