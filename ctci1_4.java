import java.util.*;

public class ctci1_4{
	public static boolean isPalindrome(String s){
		String lower = s.toLowerCase();
		String temp = lower.replaceAll("\\s", "");
		char[] tempArray = temp.toCharArray();
		int isOdd = 0;
		Arrays.sort(tempArray);
		for (int i = 0; i < temp.length() - 1; i++){
			if (tempArray[i] == tempArray[i+1]){
				i++;
			}
			else if (tempArray[i] != tempArray[i+1]){
				isOdd++;
			}
		}
		if (isOdd > 1){
			return false;
		}
		else{
			return true;
		}
	}

	public static void main(String args[]){
		System.out.println(isPalindrome("Tact Coa"));
	}
}