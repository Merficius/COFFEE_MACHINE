import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        boolean ordered = true;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                ordered = false;
                break;
            }
        }

        System.out.println(ordered);
    }
}