// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("ulla");

        int result1 = metodoMoltiplicazione1 (30, 3);
        System.out.println("Il mio numero è: " + result1);

        String result2 = concatena2("ciao, tu hai ",23);
        System.out.println(result2);
    }
    public static int metodoMoltiplicazione1 (int a, int b) {
        return a * b;
    }

    public static String concatena2 (String a, int b) {
        return a + b;
    }

}