
public class IsPalindrome {

	public static void main(String[] args) {
		int num = 12321;
		System.out.println(is_Palindrome(num));

	}
	
	public static int reverse(int num) {
		int rev_num = 0;
		while(num > 0) {
			int r =num % 10;
			rev_num=rev_num * 10 + r;
			num = num/10;
		}
		return rev_num;
	}
	public static boolean is_Palindrome(int num) {
		if(num==reverse(num))
			return true;
		return false;
	}

}
