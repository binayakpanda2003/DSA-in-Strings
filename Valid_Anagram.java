import java.util.Arrays;

public class Valid_Anagram {
	public static boolean anagram(String s,String t) {
		char []s1=s.toCharArray();
		char []t1=t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		if(Arrays.equals(s1,t1)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
	    String s="anagram";
	    String t="nagaram";
	    System.out.println(anagram(s,t));

	}

}
