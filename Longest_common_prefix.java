import java.util.Arrays;

public class Longest_common_prefix {
	public static String longestcommonprefix(String arr[]) {
	Arrays.sort(arr);
	String str1=arr[0];
	String str2=arr[arr.length-1];
	int i=0;
	while(i<str1.length()&&str1.charAt(i)==str2.charAt(i))
	{
		i++;
	}
	if(i==0) {
		return " ";
	}
	else {
		return str1.substring(0,i);
	}
	
	
	
	}	
	
	public static void main(String[] args) {
		String arr[]= {"flower","flow","flight"};
		
		System.out.println(longestcommonprefix(arr));
		
	

	}

}
