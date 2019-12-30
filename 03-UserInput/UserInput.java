public class UserInput
{
    public static void main(String[] args)
    {
        System.out.println("please enter your name");
        String userName = System.console().readLine();
        System.out.println("Welcome "+userName);
    }
}