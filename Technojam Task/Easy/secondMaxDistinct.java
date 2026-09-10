
public class secondMaxDistinct {

    // Defining the method to find the second max in the array 
    public static int secondMax(int[] arr) {

        // creating max and smax variable 
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        // trying to write the logic of the finding second max 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        // ensuring to check second max exit or not 
        if (smax == Integer.MIN_VALUE) {
            return -1;
        }

        return smax;
    }

    public static void main(String[] args) {

        // Declaring the aray 
        int[] arr = {7, 7, 8, 7};

        // calling method to find the second max 

        System.out.println("Second Max is: "+secondMax(arr));
    }
}
