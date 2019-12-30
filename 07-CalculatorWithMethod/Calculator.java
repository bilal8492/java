/**
 * Calculator
 */
public class Calculator {

    public int Add(int a, int b) {
        return a + b;
    }

    public int Sub(int a, int b) {
        return a - b;
    }

    public int Div(int a, int b) {
        return a / b;
    }

    public int Multiplication(int a, int b) {
        return a * b;
    }

    public int GetNumberFromUser() {
        System.out.println("Please Enter the Number");
        int a = Integer.parseInt(System.console().readLine());
        return a;
    }

    public static void main(String[] args) {

        boolean doNotExit = true;
        while (doNotExit) {
            Calculator c = new Calculator();

            System.out.println("please enter your choice");
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplicatio");
            String choice = System.console().readLine();

            if (choice.equals("1")) {
                int firstNumber = c.GetNumberFromUser();
                int secondNumber = c.GetNumberFromUser();
                System.out.println("The addition of " + firstNumber + " and " + secondNumber + " is :"
                        + c.Add(firstNumber, secondNumber));
            } else if (choice.equals("2")) {
                int firstNumber = c.GetNumberFromUser();
                int secondNumber = c.GetNumberFromUser();
                System.out.println("The substraction of " + firstNumber + " and " + secondNumber + " is :"
                        + c.Sub(firstNumber, secondNumber));
            } else if (choice.equals("3")) {
                int firstNumber = c.GetNumberFromUser();
                int secondNumber = c.GetNumberFromUser();
                System.out.println("The Division of " + firstNumber + " and " + secondNumber + " is :"
                        + c.Div(firstNumber, secondNumber));
            } else if (choice.equals("4")) {
                int firstNumber = c.GetNumberFromUser();
                int secondNumber = c.GetNumberFromUser();
                System.out.println("The Multiplication of " + firstNumber + " and " + secondNumber + " is :"
                        + c.Multiplication(firstNumber, secondNumber));
            } else {
                System.out.println("Wrong choice");
            }

            System.out.println("Type Yes to Exit");
            String userInput = System.console().readLine();

            if(userInput.equals("Yes"))
            {
                doNotExit = false;
            }


        }

    }
}