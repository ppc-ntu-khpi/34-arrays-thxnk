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
