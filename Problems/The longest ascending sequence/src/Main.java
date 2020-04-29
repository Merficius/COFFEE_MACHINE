import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        int maxSequence = 0;
        int currentSequence = 1;

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayLength - 1; i++) {
            if (array[i] < array[i + 1]) {
                currentSequence++;
            } else if (maxSequence < currentSequence) {
                maxSequence = currentSequence;
                currentSequence = 1;
            } else {
                currentSequence = 1;
            }
        }

        if (arrayLength == 1) {
            maxSequence = 1;
        } else if (maxSequence < currentSequence) {
            maxSequence = currentSequence;
        }

        System.out.println(maxSequence);
    }
}