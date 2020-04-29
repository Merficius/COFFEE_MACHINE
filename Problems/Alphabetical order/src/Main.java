import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pre = scanner.nextLine();
        String[] array = pre.split(" ");
        boolean ordered = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                ordered = false;
                break;
            }
        }

        System.out.println(ordered);
    }
}