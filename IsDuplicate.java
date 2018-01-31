import java.util.Scanner;

public class IsDuplicate {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("enter limit");
		int n=sr.nextInt();
		int arr[]=new int[n];
		int i,j;
		System.out.println("enter array");
		for(i=0;i<arr.length;i++) {
			arr[i]=sr.nextInt();
		}
		for(i=0;i<arr.length;i++) {
			
			for(j=i+1;j<arr.length;i++) {
				if(arr[i]==arr[j]) {
					arr[j]=0;
				}
		}
		}
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			System.out.println(arr[i]);
			}
		}
	}
}
