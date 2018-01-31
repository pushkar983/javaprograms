import java.util.Scanner;
import java.io.*;

public class IsArray2
{

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter array");
		int arr[];
		arr=new int[5];
		int i,j;
		System.out.println("enter number");
		for(i=0;i<arr.length;i++) {
			arr[i]=sr.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			int temp=arr[i];
			for(j=0;j<arr.length;j++)
			if(arr[i]<arr[j]) {
				arr[i]=arr[j];
				arr[j]=temp;
				temp=arr[i];
			}
		}
		for(i=0;i<arr.length;i++) {
			if(i>2) {
				break;
			}
		System.out.println(arr[i]);
		}
		
		}
}