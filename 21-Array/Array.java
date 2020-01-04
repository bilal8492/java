/**
 * Array
 */
public class Array {

    public static void main(String[] args) {

        //Initializing array in java
        int[] Numbers= new int [5];


        //Inserting values in array
        Numbers[0]=5;
        Numbers[1]=10;
        Numbers[2]=15;
        Numbers[3]=20;
        Numbers[4]=25;

        //Access the values from array
        System.out.println(Numbers[3]);

        //Iterate all values of array
        for (int i=0; i<5; i++){
            System.out.println(Numbers[i]);
        }
    }
}