import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int n;
        boolean contains = false;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        n = scanner.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == n) {
                contains = true;
                break;
            }
        }

        System.out.println(contains);
    }
}