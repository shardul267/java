
import java.util.*;
public class Findlargest {
    public static void main(String[] args){
        int[] arr1 ={2,5,1,3,0};
        System.out.println(LargestElement(arr1));
    }

    static int LargestElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
