import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        // write your code here
        System.out.println("It's Going To Be A Good Day Alan ~ 6/3/2021");

        boolean newCalculation = true;
        while (newCalculation) {
            System.out.print("Enter your first number: ");
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
                System.out.println();
                result = number1 / number2;
            }

            boolean endlessMath = true;
            while (endlessMath) {
                System.out.println("Would you like to configure another digit or reset your calculation?" + "\n");
                System.out.println("If you wish to continue using the calculator, type \"yes\"" + "\n");
                System.out.println("If you wish to reset the calculator, type \"reset\"" + "\n");
                System.out.println("To exit: type \"bye\"" + "\n");
                // collecting user selection
                String response = input.next();


                if (response.equalsIgnoreCase("reset")) {
                    endlessMath = false;
                    newCalculation = true;
                } else if (response.equalsIgnoreCase("bye")) {
                    endlessMath = false;
                    newCalculation = false;
                    System.out.println("                Goodbye" + "\n" + " <3 visit xoxocity again in your near future! <3");

                } else if (response.equalsIgnoreCase("yes")) {
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
                } else {
                    System.out.println("Incorrect input!");
                    System.out.println("Please enter a correct keyword :0");
                }
            }
        }
    }
}
