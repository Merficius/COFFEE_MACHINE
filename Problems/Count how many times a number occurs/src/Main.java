import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int n;
        int counter = 0;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        n = scanner.nextInt();

        for (int currentNumber : array) {
            if (currentNumber == n) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}