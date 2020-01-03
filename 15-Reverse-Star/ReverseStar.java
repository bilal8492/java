/**
 * Star
 */
public class ReverseStar {

    public static void main(String[] args) {
        System.out.println("Enter the number to print Star");
        int Number=Integer.parseInt(System.console().readLine());
        for (int i=Number; i>=1; i--) {
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
       
    }
}