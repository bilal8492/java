public class Equalnumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter Two Number");
        String FirstNumber= System.console().readLine();
        String SecondNumber=System.console().readLine();
        int a= Integer.parseInt(FirstNumber);//assignment operator
        int b= Integer.parseInt(SecondNumber);
        if (a==b) { // comparision operator
            System.out.println("Number is equal");
        }
        else{ 
            System.out.println("Number is not equal");
        }
    }
}