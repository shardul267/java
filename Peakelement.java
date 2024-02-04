




import java.util.*;

public class Peakelement {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = 0; i < n; i++) {

            if ((i == 0 || arr.get(i - 1) < arr.get(i))
                    && (i == n - 1 || arr.get(i) > arr.get(i + 1))) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 5, 1));
        int ans = findPeakElement(arr);
        System.out.println("The peak is at index: " + ans);
    }
}



