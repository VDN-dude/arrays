import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr = {-45, -787, 676, 909, 76};
//point 1
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }


//point 2

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                System.out.println("even number : " + arr[i]);
            }else {
                System.out.println("odd number : " + arr[i]);
            }
        }

//point 5

        System.out.print("Palindromes : ");
        for (int i = 0; i < arr.length; i++) {
            String snum = Integer.toString(Math.abs(arr[i]));
            StringBuilder lenght = new StringBuilder(snum);
            int l = Integer.parseInt(lenght.reverse().toString());
            int num = Integer.parseInt(snum);
            if (num == l){
                System.out.print(arr[i] + ", ");
            }
        }
    }
}