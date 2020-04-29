import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();

        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                System.out.println(d * e);
                break;
            case "circle":
                double radius = scanner.nextDouble();
                System.out.println(3.14 * radius * radius);
                break;
            default:
                System.out.println("Unknown form");
                break;
        }
    }
}