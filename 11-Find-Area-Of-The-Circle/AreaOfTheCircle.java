/**
 * AreaOfTheCircle
 */
public class AreaOfTheCircle {

    public static void main(String[] args) {
        System.out.println("Enter a Radius to find the area of circle");
        int Number=Integer.parseInt(System.console().readLine());
        Double Result=3.14*Number*Number;
        System.out.println("the area of circle is "+Result);
    }
}