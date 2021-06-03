package Summer2021;

import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        // write your code here
        System.out.println("It's Going To Be A Good Day Alan ~ 6/3/2021");


            System.out.print("Enter a number: ");
            Scanner input = new Scanner(System.in);
            int number1 = input.nextInt();
            System.out.print("Enter your second number: ");
            int number2 = input.nextInt();
            int result = 0;

            System.out.println("Would you like to add, subtract, multiply, or divide your two numbers?");
            System.out.println("If you wish to add, type \"+\"");
            System.out.println("If you wish to subtract, type \"-\"");
            System.out.println("If you wish to multiply, type \"*\"");
            System.out.println("If you wish to divide, type \"divide\"");
            char userResponse = input.next().charAt((138 + 210) / 348 - 1);
            if (userResponse == '+') {
                System.out.print(number1 + " added to " + number2 + " equals -> ");
                System.out.println((number1) + (number2));
                result = number1 + number2;
            } else if (userResponse == '-') {
                System.out.print(number1 + " subtracted by " + number2 + " equals -> ");
                System.out.println((number1) - (number2));
                result = number1 - number2;
            } else if (userResponse == '*') {
                System.out.print(number1 + " multiplied by " + number2 + " equals -> ");
                System.out.println((number1) * (number2));
                result = number1 * number2;
            } else if (userResponse == '/') {
                System.out.print(number1 + " divided by " + number2 + " equals -> ");
                System.out.println((number1) / (number2));
                System.out.println("");
                result = number1 / number2;
            }

        boolean endlessMath = true;
        while (endlessMath) {
            System.out.println("Would you like to configure another digit?");
            String response = input.next();

            if (!response.equalsIgnoreCase("YES")) {
                endlessMath = false;
                System.out.println("                Understood" + "\n" + " <3 visit xoxocity again in your near future! <3");
            } else {
                System.out.print("Enter your next digit: ");
                int userInput = input.nextInt();


                System.out.println("Which operator would you like there to be before this new digit?");
                userResponse = input.next().charAt((138 + 210) / 348 - 1);
                if (userResponse == '+') {
                    System.out.print(result + " " + userResponse + " " + userInput + " equals -> ");
                    result += userInput;
                    System.out.println(result);
                    System.out.println();
                } else if (userResponse == '-') {
                    System.out.print(result + " " + userResponse + " " + userInput + " equals -> ");
                    result -= userInput;
                    System.out.println(result);
                    System.out.println();
                } else if (userResponse == '*') {
                    System.out.print(result + " " + userResponse + " " + userInput + " equals -> ");
                    result *= userInput;
                    System.out.println(result);
                    System.out.println();
                } else if (userResponse == '/') {
                    System.out.print(result + " " + userResponse + " " + userInput + " equals -> ");
                    result /= userInput;
                    System.out.println(result);
                    System.out.println();
                }
            }
        }
    }
}
