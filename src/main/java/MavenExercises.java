import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {
        System.out.println("Please type a sentence:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        if(StringUtils.isBlank(userInput)) {
            System.out.println("You didn't type anything, silly!");
        } else if (StringUtils.isNumeric(userInput)) {
            System.out.println("You entered a number!");
        } else {
            System.out.println("You did not enter a number.");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
    }

}
