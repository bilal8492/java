/**
 * MultipleOf3And5
 */
public class MultipleOf3And5 {

    public static void main(String[] args) {
        System.out.println("Multiple Of 3 and 5");
        int sum= 0;
        for(int i=3; i<1000; i++){
            if(i%3==0||i%5==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}