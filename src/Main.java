import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr = {-45, 7898, 67, 90, 76};
//point 2
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                System.out.println("even number : " + arr[i]);
            }else {
                System.out.println("odd number : " + arr[i]);
            }
        }
    }
}