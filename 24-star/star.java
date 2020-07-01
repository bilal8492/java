public class star {
    public static void main(String[]args){
       System.out.println("Enter a number for star");
       int num=Integer.parseInt(System.console().readLine());
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}