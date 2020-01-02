public class Calculator {

    public static void main(String[] args) {
        System.out.println("please enter your choice");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Division");
        System.out.println("4.Multiplicatio");
        String choice = System.console().readLine();
        //comparing string with .equal method
        if (choice.equals("1")) {
            System.out.println("please enter two number for addition");
            int FirstNumber = Integer.parseInt( System.console().readLine());
            int SecondNumber = Integer.parseInt(System.console().readLine());

            int sum = FirstNumber + SecondNumber;
            System.out.println(" the addition of " + FirstNumber + " and " + SecondNumber + " is " + sum);

        } else if (choice.equals("2")) {
            System.out.println("please enter two number for substraction");
            String FirstNumber = System.console().readLine();
            String SecondNumber = System.console().readLine();

            int sub = Integer.parseInt(FirstNumber) - Integer.parseInt(SecondNumber);
            System.out.println(" the substraction of " + FirstNumber + " and " + SecondNumber + " is " + sub);

        } else if (choice.equals("3")) {
            System.out.println("please enter two number for division");
            String FirstNumber = System.console().readLine();
            String SecondNumber = System.console().readLine();

            int div = Integer.parseInt(FirstNumber) / Integer.parseInt(SecondNumber);
            System.out.println(" the division of " + FirstNumber + " and " + SecondNumber + " is " + div);

        } else if (choice.equals("4")) {
            System.out.println("please enter two number or multiplication");
            String FirstNumber = System.console().readLine();
            String SecondNumber = System.console().readLine();

            int mul = Integer.parseInt(FirstNumber) * Integer.parseInt(SecondNumber);
            System.out.println(" the multiplication of " + FirstNumber + " and " + SecondNumber + " is " + mul);

        } else {
            System.out.println("Wrong choice");
        }

    }
}