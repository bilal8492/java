/**
 * Circumference
 */
public class Circumference {

    public static void main(String[] args) {
        System.out.println("Enter The Radius To Find Circumference");
        int Number=Integer.parseInt(System.console().readLine());
        Double Result=2*3.14*Number;
        System.out.println("The Radius Of Circumference is"+Result);
    }
}