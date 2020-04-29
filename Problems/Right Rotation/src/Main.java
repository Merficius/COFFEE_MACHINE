import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pre = scanner.nextLine();
        String[] preArray = pre.split(" ");
        int[] array = new int[preArray.length];
        int[] copyArray;
        int rotationNumber = scanner.nextInt();

        for (int i = 0; i < preArray.length; i++) {
            array[i] = Integer.parseInt(preArray[i]);
        }

        copyArray = array.clone();

        for (int i = 0; i < array.length; i++) {
            array[(i + rotationNumber) % array.length] = copyArray[i];
        }

        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}