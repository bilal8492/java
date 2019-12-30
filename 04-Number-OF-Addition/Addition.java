public class Addition {
    public static void main(String[] args) {

        System.out.println("Enter Two Number For Addition");
        String FirstNumber = System.console().readLine(); 
        String SecondNumber = System.console().readLine();

        int sum = Integer.parseInt(FirstNumber) + Integer.parseInt(SecondNumber);
        System.out.println(" the addition of " + FirstNumber + " and " + SecondNumber + " is " + sum);

    }
}