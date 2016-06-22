public class ctci1_2{
	public static boolean permutation(String first, String second){
		if (first.length() != second.length()){
			return false;
		}
		StringBuilder secondSB = new StringBuilder(second);
		for (char ch:first.toCharArray()){
			boolean found = false;
			for (int i = 0; i < secondSB.length(); i++){
				if (ch == secondSB.charAt(i)){
					secondSB.deleteCharAt(i);
					found = true;
					break;
				}
			}
			if (found == false){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		System.out.println(permutation("test", "test"));
	}
}