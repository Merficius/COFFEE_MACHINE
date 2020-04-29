import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int max;
        int maxIndex = 0;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        max = array[0];
        for (int i = 1; i < arrayLength; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        System.out.println(maxIndex);
    }
}