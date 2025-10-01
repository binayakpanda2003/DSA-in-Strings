
public class string_rotation_ofanother {
	public static boolean isrotation(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		String s3=s+t;
		return s3.contains(t);
	}

	public static void main(String[] args) {
		String s="hello";
		String t="olhenl";
		System.out.println(isrotation(s,t));

	}

}
