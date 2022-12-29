import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr = {-4, -787678, 6, 909, 76165};

//point 1 (Min & Max numbers)

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                 min = arr[i];
            }
        }
        System.out.println("Min number in the array : " + min);

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Min number in the array : " + max);

//point 2 (Evens & Odds numbers)

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                System.out.println("even number : " + arr[i]);
            }else {
                System.out.println("odd number : " + arr[i]);
            }
        }

//point 3 (Shortest & Longest numbers)

        int shortest = 0;
        int longest = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            String stringLenght = String.valueOf(Math.abs(arr[i]));
            int lenght = stringLenght.length();
            if (lenght > start){
                start = lenght;
                longest = arr[i];
            }
        }
        System.out.println("One of the Longests numbers : " + longest);

        for (int i = 0; i < arr.length; i++) {
            String stringLenght = String.valueOf(Math.abs(arr[i]));
            int lenght = stringLenght.length();
            if (lenght < start){
                start = lenght;
                shortest = arr[i];
            }
        }
        System.out.println("One of the Shortest numbers : " + shortest);

// point 4 (Display numbers that are in ascending order)

        for (int i = 0; i < arr.length; i++) {
            
        }

//point 5 (Palindromes)

        System.out.print("Palindromes : ");
        for (int i = 0; i < arr.length; i++) {
            String snum = String.valueOf(Math.abs(arr[i]));
            StringBuilder lenght = new StringBuilder(snum);
            int l = Integer.parseInt(lenght.reverse().toString());
            int num = Integer.parseInt(snum);
            if (num == l){
                System.out.print(arr[i] + ", ");
            }
        }
    }
}