/**
 * OddEven
 */
public class OddEven {

    public static void main(String[] args) {
        boolean PrintYES= true;
        while (PrintYES) {
            System.out.println("enter number to find odd even values");
            double Number1 = Integer.parseInt(System.console().readLine());
            if (Number1 % 2 == 0) {
                System.out.println("The Number Is Even");
            } else {
                System.out.println("The Number Is Odd");
            }

            System.out.println("Type yes to exit");
            String Check=System.console().readLine();
            if(Check.equals("yes"))
            {
               PrintYES=false;
            }
        }
    }
}