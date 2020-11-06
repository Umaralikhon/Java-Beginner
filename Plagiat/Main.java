package Platform;
/**
 * @version 1.0
 * @author Kayumov Umaralikhon
 */

import java.util.Scanner;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        Letter letter = new Letter();
        String text;

        System.out.println("Enter your text");
        text = scan.nextLine();

        letter.setStr(text);
        letter.arrCreator();

        System.out.println("Remaking...");
        System.out.println("Your text: ");
        letter.print();
    }
}
