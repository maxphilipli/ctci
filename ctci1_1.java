import java.util.*;

public class ctci1_1{
	public static boolean unique(String n){
		ArrayList<Character> seen = new ArrayList<Character>();
		for (char ch: n.toCharArray()){
			for (int i = 0; i < seen.size(); i++){
				if (ch == seen.get(i)){
					return false;
				}
			}
			seen.add(ch);
		}
		return true;
	}

	public static void main(String args[]){
		System.out.println(unique("TEST"));
	}
}