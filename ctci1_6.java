import java.util.*;

public class ctci1_6{
	public static String compression(String s){
		StringBuilder temp = new StringBuilder();
		for (int i = 0; i < s.length(); i++){
			int j = 0;
			while (s.charAt(i+j) == s.charAt(i)){
				j++;
				if (i+j >= s.length()){
					break;
				}
			}
			temp.append(s.charAt(i));
			temp.append(j);
			i += (j-1);
		}
		if (temp.length() < s.length()){
			return temp.toString();
		}
		else{
			return s;
		}
	}

	public static void main(String args[]){
		System.out.println(compression("aabcccccaaa"));
	}
}