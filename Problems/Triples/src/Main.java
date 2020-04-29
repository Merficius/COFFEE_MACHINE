import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int counter = 0;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayLength - 2; i++) {
            if (array[i] - array[i + 1] == -1 && array[i + 1] - array[i + 2] == -1) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}