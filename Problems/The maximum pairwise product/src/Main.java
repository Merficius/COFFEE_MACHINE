import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int n;
        int m;
        int product = 0;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        n = array[0];
        m = array[1];
        product = n * m;
        for (int i = 1; i < arrayLength - 1; i++) {
            n = array[i];
            m = array[i + 1];

            if (product < n * m) {
                product = n * m;
            }
        }

        System.out.println(product);
    }
}