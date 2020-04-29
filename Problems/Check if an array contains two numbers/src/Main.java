import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int n;
        int m;
        boolean nextToEachOther = false;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        m = scanner.nextInt();

        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] == n && array[i + 1] == m || array[i] == m && array[i + 1] == n) {
                nextToEachOther = true;
                break;
            }
        }

        System.out.println(nextToEachOther);
    }
}