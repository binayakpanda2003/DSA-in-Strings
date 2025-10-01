import java.util.HashMap;

public class Isomorphic_strings {
	public static boolean isisomorphic (String s1,String s2) {
		HashMap<Character,Integer> hm1=new HashMap<>();
		HashMap<Character,Integer> hm2=new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			if(!hm1.containsKey(s1.charAt(i))) {
				hm1.put(s1.charAt(i), i);
			}
		
	
			if(!hm2.containsKey(s2.charAt(i))) {
				hm2.put(s2.charAt(i), i);
			}
		
		if(!hm1.get(charAt(i)).equals(!hm2.get(charAt(i)))) {
			return false;
		}
		}
	return true;
	}
	public static void main(String[] args) {
		

	}

}
