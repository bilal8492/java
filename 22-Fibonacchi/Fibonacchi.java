/**
 * Fibonacchi
 */
public class Fibonacchi {

    public static void main(String[] args) {
        System.out.println("enter a number to find fibonacchi series");
        int Number = Integer.parseInt(System.console().readLine());
        int x = 0;
        int y = 1;
        int z = 0;
        System.out.print(x + " " + y + " ");
        for (int i = 2; i < Number; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }

    }
}
