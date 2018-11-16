import java.util.ArrayList;
public class encryption {
    private String input;
    private String key; 
    private int check = 0;
    public encryption(String UserInput, String number) {
        input = UserInput;
        key = number;
    }
    public void setInput(String newInput) {input = newInput;}
    public String getInput() {return input;}
    public String getKey() {return key;}
    public void encrypt(encryption Object) {
        int numberLength = Object.getKey().length();
        int inputLength = Object.getInput().length();
        int divisor = (inputLength + numberLength - 1)/numberLength;//round up
        String[][] inputChart = new String[divisor][numberLength]; //create 2d array
        while (inputLength < divisor * numberLength) { //check if length is less than cells available in array
            Object.setInput(Object.getInput() + " "); //add spaces so no nulls in 2d array if necessary
            inputLength = Object.getInput().length(); //set to new length
        }
        for (int i = 0; i < divisor; i++) { //adding characters of input to list
            for (int j = 0; j < numberLength; j++) {
                inputChart[i][j] = Object.getInput().substring(check,check+1); //setting array elements to characters in string
                if (check + 1 == inputLength) {break;} else{check++;} //check if string length already met
            }
        }
        System.out.print("Encrypted message:");
        for (int i = 0; i < numberLength; i++) {
            for (int j = 0; j < divisor; j++) {
                String temp = String.valueOf(i); //i has to be converted to string
                System.out.print(inputChart[j][Object.getKey().indexOf(temp)]); //j is row, the indexOf is column
            }
        }
        System.out.println("\nWhen you copy, copy everything after the colon.");
    }
}