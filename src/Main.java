import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4214, 2, 3, 6, 4, 76165, 11, 47};
        int j = 0;
        int i = 0;

//point 1 (Min & Max numbers)

        int max = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max number in the array : " + max);

        int min = max;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min number in the array : " + min);

//point 2 (Evens & Odds numbers)
        System.out.print("Even numbers :");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("");
        System.out.print("Odd numbers :");
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println("");

//point 3 (Shortest & Longest numbers)

        int shortest = 0;

        int longest = 0;

        int start = 0;

        for (i = 0; i < arr.length; i++) {
            String stringLenght = String.valueOf(Math.abs(arr[i]));
            int lenght = stringLenght.length();
            if (lenght > start) {
                start = lenght;
                longest = arr[i];
            }
        }
        System.out.println("One of the Longests numbers : " + longest);

        for (i = 0; i < arr.length; i++) {
            String stringLenght = String.valueOf(Math.abs(arr[i]));
            int lenght = stringLenght.length();
            if (lenght < start) {
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


        out:
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length - 2; j++) {
                if (arr2[i] == arr[j]) {
                    break out;
                }
            }
        }
        System.out.print(arr[j]);

        for (i = i; i < arr.length; i++) {
            for (int j1 = j + 1; j1 < arr.length; j1++) {
                if (arr2[i] == arr[j1] && j < j1) {
                    System.out.print(" " + arr[j1]);
                    j = j1;
                }
            }
        }
        System.out.println("");

//point 5 (Palindromes)

        System.out.print("Palindromes : ");
        for (i = 0; i < arr.length; i++) {
            String snum = String.valueOf(Math.abs(arr[i]));
            StringBuilder lenght = new StringBuilder(snum);
            int l = Integer.parseInt(lenght.reverse().toString());
            int num = Integer.parseInt(snum);
            if (num == l && lenght.length() > 1) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
//point with *
        boolean sorted = true;
        int sort = 0;
        while(sorted) {
            sorted = false;
            for (i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    sorted = true;
                    sort = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}