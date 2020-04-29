import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = new int[3];
        int[] secondArray = new int [3];

        for (int i = 0; i < 3; i++) {
            firstArray[i] = scanner.nextInt();
        }
        Arrays.sort(firstArray);

        for (int i = 0; i < 3; i++) {
            secondArray[i] = scanner.nextInt();
        }
        Arrays.sort(secondArray);

        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("Box 1 = Box 2");
        } else if (firstArray[0] <= secondArray[0] && firstArray[2] <= secondArray[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (firstArray[0] >= secondArray[0] && firstArray[2] >= secondArray[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }

    }
}