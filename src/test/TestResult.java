package test;

import domain.Exercise;
import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        System.out.println("Enter array");
        for(int i = 0; i < array.length; i++)
            array[i] = sc.nextInt();
        sc.close();
        System.out.println("Your value is: " + Exercise.TheSecondValue(array));
        
    }
}
