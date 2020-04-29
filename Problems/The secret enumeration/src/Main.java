public class Main {

    public static void main(String[] args) {
        Secret[] secrets = Secret.values();
        int counter = 0;

        for (Secret s : secrets) {
            if (s.name().startsWith("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}