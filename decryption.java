import java.util.ArrayList;
public class decryption extends encryption{ //reuse methods in encrypt so don't need to type out again
    private String input;
    private String key;
    public decryption(String userInput, String userKey) {
        super(userInput, userKey);
    }
    public void decrypt(decryption Object) {
        int numberLength = Object.getKey().length();
        int inputLength = Object.getInput().length();
        int divisor = (inputLength + numberLength - 1)/numberLength;//round up
        String[][] inputChart = new String[divisor][numberLength];
        int check = 0;
        while (Object.getInput().length() < divisor * numberLength) { //check whether string length is less than array size
            Object.setInput(Object.getInput() + " "); //add spaces so no nulls in 2d array if necessary
        }
        for (int i = 0; i < numberLength; i++) { //adding characters of input to list
            for (int j = 0; j < divisor; j++) {
                inputChart[j][Object.getKey().indexOf(String.valueOf(i))] = Object.getInput().substring(check,check+1); 
                //setting array elements to characters in string
                if (check + 1 == Object.getInput().length()) {break;} else{check++;} //check if string length already met
            }
        }
        for (int i = 0; i < divisor; i++) {
            for (int j = 0; j < numberLength; j++) {
                System.out.print(inputChart[i][j]); //printing; i = row, j = column
            }
        }
    }
}