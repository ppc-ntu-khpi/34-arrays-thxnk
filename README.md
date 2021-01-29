# Практична робота "Масиви, вирази, керування виконанням програми"
## Знайдіть друге за величиною число у заданому масиві
## Код класа Exercise:
```java
package domain;

import java.util.Arrays;
/**
 * class that returns value of the second largest value
 * @author boss
 */
public class Exercise {
    public static int TheSecondValue(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    
}
```
## Код класа TestResult:
```java
package test;

import domain.Exercise;
import java.util.Scanner;
/**
 * a test class in which we generate array
 * @author boss
 */
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

```
## Приклад виконання програми: 
<img src="https://i.ibb.co/mbCZw11/image.png" alt="image" border="0">
