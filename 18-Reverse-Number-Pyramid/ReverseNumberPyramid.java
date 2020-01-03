/**
 * ReversePyramid
 */
public class ReverseNumberPyramid {

    public static void main(String[] args) {
        System.out.println("Enter the number to print Star");
        int Number=Integer.parseInt(System.console().readLine());
        for (int i=Number; i>=1; i--) {
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}