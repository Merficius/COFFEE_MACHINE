import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int min;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        min = array[0];
        for (int i = 1; i < arrayLength; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);
    }
}