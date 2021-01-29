package domain;

import java.util.Arrays;

public class Exercise {
    public static int TheSecondValue(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    
}
