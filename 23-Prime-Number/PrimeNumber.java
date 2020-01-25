/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Write number to find prime number or not");
        int Number = Integer.parseInt(System.console().readLine());
        boolean IsPrime=true;
        for (int i = 2; i < Number; i++) {
            if (Number % i == 0) {
                IsPrime=false;
                break;
            }

        }
        if (IsPrime == false) {
            System.out.println("Number is not prime");
        } else {
            System.out.println("Number is  prime");
        }
    }
}