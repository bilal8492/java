/**
 * NamesUsingArrays
 */
public class NamesUsingArrays {

    public static void main(String[] args) {

        System.out.println("Enter how many employee present today");
        int Number = Integer.parseInt(System.console().readLine());
        String[] names = new String[Number];
        for (int i = 0; i < names.length; i++) {
            System.out.println("enter the "+ (i+1) +" name");
            names[i]=System.console().readLine();

        }
        
        System.out.println("\n\n\n**************Employee Attedence are:************\n");
        for(int i=0;i<names.length;i++)
        {
            System.out.println( (i+1) + ": " + names[i]);
        }
    } 
}