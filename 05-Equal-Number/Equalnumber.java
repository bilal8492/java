public class Equalnumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter Two Number");
        String FirstNumber= System.console().readLine();
        String SecondNumber=System.console().readLine();
        int a= Integer.parseInt(FirstNumber);
        int b= Integer.parseInt(SecondNumber);
        if (a==b) {
            System.out.println("Number is equal");
        }
        else{ 
            System.out.println("Number is not equal");
        }
    }
}