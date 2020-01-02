/**
 * PrintNumber
 */
public class PrintNumberFromUser {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        int Number=Integer.parseInt(System.console().readLine());
        for (int i=0; i<=Number; i++) {
                System.out.println(i);
        }
    }
}