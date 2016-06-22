public class ctci1_3{
	public static String urlify(String s, int n){
		char[] charString = s.toCharArray();
		int totalLength = 0;
		for (int i = 0; i < n; i++){
			if (charString[i] == ' '){
				totalLength ++;
			}
		}
		int newLength = n + totalLength * 2;
		for (int i = n - 1; i >= 0; i--){
			if (charString[i] == ' '){
				charString[newLength - 1] = '0';
				charString[newLength - 2] = '2';
				charString[newLength - 3] = '%';
				newLength -= 3;
			}
			else{
				charString[newLength - 1] = charString[i];
				newLength--;
			}
		}


		String answer = new String(charString);
		return answer;
	}

	public static void main(String args[]){
		System.out.println(urlify("Mr John Smith    ", 13));
	}
}