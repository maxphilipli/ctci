public class ctci1_5{
	public static boolean oneAway(String first, String second){
		if (first.length() - second.length() > 1 || first.length() - second.length() < -1){
			return false;
		}
		else if (first.length() == second.length()){
			int length = first.length();
			char[] firstArr = first.toCharArray();
			char[] secondArr = second.toCharArray();
			int numOfEdits = 0;
			for (int i = 0; i < length; i++){
				if (firstArr[i] != secondArr[i]){
					numOfEdits++;
				}
			}
			if (numOfEdits > 1){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			if (first.length() > second.length()){
				char[] longArr = first.toCharArray();
				char[] shortArr = second.toCharArray();
				int length = first.length();
				int secondIt = 0;
				int numOfEdits = 0;
				for (int i = 0; i < length; i++){
					if (longArr[i] == shortArr[secondIt]){
						secondIt++;
						if (secondIt > second.length() - 1){
							return true;
						}
					}
					else{
						numOfEdits++;
					}
				}
				if (numOfEdits > 1){
					return false;
				}
				else{
					return true;
				}
			}
			else{
				char[] longArr = second.toCharArray();
				char[] shortArr = first.toCharArray();
				int length = second.length();
				int secondIt = 0;
				int numOfEdits = 0;
				for (int i = 0; i < length; i++){
					if (longArr[i] == shortArr[i]){
						secondIt++;
						if (secondIt > first.length() - 1){
							return true;
						}
					}
					else{
						numOfEdits++;
					}
				}
				if (numOfEdits > 1){
					return false;
				}
				else{
					return true;
				}
			}
		}	
	}

	public static void main(String args[]){
		System.out.println(oneAway("pale", "ple"));
	}
}