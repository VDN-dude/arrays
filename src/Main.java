import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] arr = {4214, 787678, 6, 909, 76165, 11, 45, 47};

//point 1 (Min & Max numbers)

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                 max = arr[i];
            }
        }
        System.out.println("Max number in the array : " + max);

        int min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min number in the array : " + min);

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

        System.out.print("Numbers that are in ascending order : ");
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        Arrays.sort(arr2);
        int order = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = order; j < arr.length; j++) {
                if (arr[j] == arr2[i] && j >= i) {
                    order = j;
                    System.out.print(arr[j] + " ");
                }
            }
        }
        System.out.println(" ");

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