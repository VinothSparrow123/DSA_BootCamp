import java.util.ArrayList;
import java.util.List;

public class reverse {
	public static void main(String[] args) {
		String input = "vinothkumar anbazhagan";
		reverseWithoutSpace(input);
	}
	
	public static String reverseWithoutSpace(String input){
		char[] inputChar = input.toCharArray();
		int left = 0, right = input.length()-1;
		List<Integer> spaceIndex = new ArrayList<>();
		while(left < right){
			if(inputChar[left] == ' '){
				spaceIndex.add(left);
				left++;
			}
			if(inputChar[right] == ' '){
				spaceIndex.add(right);
				right--;
			}
			if(inputChar[left] != ' '){
				char temp = inputChar[left];
				inputChar[left] = inputChar[right];
				inputChar[right] = temp;
			}	
		}
	}
}
