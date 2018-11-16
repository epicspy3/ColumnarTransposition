import java.util.Scanner;
public class ImitationGame {
    public static void main(String[] args) {
        System.out.print('\u000C'); //clears terminal window
        Scanner scanner = new Scanner(System.in);
        int check = 0;
        while (check < 1) {
            System.out.println("Enter encryption, decryption, or exit.");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("exit")) {System.exit(0);}
            System.out.println("Input string.");
            String input = scanner.nextLine();
            if (decision.equalsIgnoreCase("encryption")) {
                System.out.println
                ("Input a number with n digits that includes each digit from 0 to n-1." + 
                "\nFor example, 3120 has 4 digits and contains the digits from 0 to 4-1. This number will be your key.");
                String number = scanner.nextLine();
                encryption Object = new encryption(input,number);
                Object.encrypt(Object);
            }
            else if (decision.equalsIgnoreCase("decryption")) {
                System.out.println("Input the key.");
                String key = scanner.nextLine();
                decryption Object = new decryption(input,key);
                Object.decrypt(Object);
            }
            else {System.out.println("Input invalid");}
        }
    }
}