import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int[] copyArray;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        copyArray = array.clone();

        for (int i = 0; i < arrayLength; i++) {
            array[(i + 1) % arrayLength] = copyArray[i];
        }

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}