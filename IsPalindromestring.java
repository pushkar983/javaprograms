
public class IsPalindromestring {

	public static void main(String[] args) {
		String str = "hannAh";
		String rev = reverse(str);
		System.out.println(str.equalsIgnoreCase(rev));
	}
	
	 public static String reverse(String str) {
		 StringBuilder instr = new StringBuilder();
		 instr.append(str);
		 instr.reverse();
		 return instr.toString();
	}

}
