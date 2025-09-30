
public class Reverse_a_String {
	public static String reverse (String s) {
		
		String[] words =s.split(" +");
	
		StringBuilder result=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			result.append(words[i]);
			result.append(" ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		String s="My name is Binayak Panda .";
		String ans=reverse(s);
		System.out.println(ans);

	}

}
