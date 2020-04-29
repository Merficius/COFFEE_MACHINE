import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = scanner.nextLong();
        String operation = scanner.next();
        long number2 = scanner.nextLong();

        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(number1 / number2);
                }
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}