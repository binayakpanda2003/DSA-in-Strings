
public class largest_odd_number {
	public static String largestodd(String s) {
		int n=s.length();
		for(int i=n-1;i>=0;i--) {
			if(s.charAt(i)%2!=0) {
				return s.substring(0,i+1);
			}
		}
		return " "; 
	}

	public static void main(String[] args) {
	String num="1234";
	String ans=largestodd(num);
	System.out.println(ans);
	}

}
