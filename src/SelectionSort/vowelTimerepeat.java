package SelectionSort;

public class vowelTimerepeat {
	public static void main(String[] args) {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(incrementVowelTimes(input));
    }
    
    public static String incrementVowelTimes(String input){
        int vowelPosition = 0;
        String output = "";
        for(Character eachChar:input.toCharArray()){
            if(eachChar.equals('A') || eachChar.equals('E') || eachChar.equals('I') || eachChar.equals('O')||eachChar.equals('U')){
                output=output+eachChar;
                vowelPosition=vowelPosition+1;
            }else{
                for(int i=0;i<vowelPosition;vowelPosition++){
                    output=output+eachChar;
                }
            }
        }
        return output;
    }
}
