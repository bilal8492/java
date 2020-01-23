/**
 * Fibonacchi
 */
public class Fibonacchi {

    public static void main(String[] args) {
        System.out.println("enter a number to find fibonacchi series");
        int Number=Integer.parseInt(System.console().readLine());
        int x=0;
        int y=1;
    
        for(int i=1; i<=Number; i++){
            int z=x+y;
            x=y;
            y=z;
            System.out.println(z);
        }
    }
}
