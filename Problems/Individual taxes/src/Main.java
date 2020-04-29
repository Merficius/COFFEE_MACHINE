import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCompanies = scanner.nextInt();
        int[] firstArray = new int[numberCompanies];
        int[] secondArray = new int[numberCompanies];
        int companyIndex;
        double quantity;


        for (int i = 0; i < numberCompanies; i++) {
            firstArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < numberCompanies; i++) {
            secondArray[i] = scanner.nextInt();
        }

        companyIndex = 1;
        quantity = firstArray[0] * (double) (secondArray[0]) / 100;

        for (int i = 1; i < numberCompanies; i++) {
            if (quantity < firstArray[i] * (double) (secondArray[i]) / 100) {
                quantity = firstArray[i] * (double) (secondArray[i]) / 100;
                companyIndex = i + 1;
            }
        }

        System.out.println(companyIndex);
    }
}