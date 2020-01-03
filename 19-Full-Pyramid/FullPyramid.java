/**
 * FullPyramid
 */
public class FullPyramid {

    public static void main(String[] args) {
        System.out.println("Enter the number to print Star");
        int Number = Integer.parseInt(System.console().readLine());
        ;
        for (int i = 1; i <= Number; i++) {

            for (int k = 1; k <= Number - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}