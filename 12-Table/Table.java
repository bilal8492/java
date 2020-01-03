/**
 * Table
 */
public class Table {

    public static void main(String[] args) {
        System.out.println("Enter a vlaue to creat table");
        int Number=Integer.parseInt(System.console().readLine());
        System.out.println("the table of "+Number+ "is");
        for (int i=1; i<=10; i++) {
            System.out.println(Number+" x "+ i +" = " + i*Number);

        }
    }
}