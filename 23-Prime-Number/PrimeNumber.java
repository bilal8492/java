/**
 * PrimeNumber
 */
public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("Write number to find prime number or not");
        int Number=Integer.parseInt(System.console().readLine());
        int count=0;
        for(int i=1;i<=Number;i++){
            if (Number%i==0) {
                count++;    
            }
            
        }
        if (count==2){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}