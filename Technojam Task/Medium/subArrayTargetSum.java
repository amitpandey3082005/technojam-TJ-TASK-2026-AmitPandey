public class subArrayTargetSum{

    // defining funnction to count subarray

    public static int  countSubArray(int[] arr,int target){

         int count = 0; // variable to count subarray 
        // using nested loop to find the target sum subarray
        for(int i=0;i<arr.length;i++){
              int currsum =0;
             for(int j=i;j<arr.length;j++){
                 
                  currsum+=arr[j];

                 if(currsum == target){
                    count++;
                 }
             }
        }
        return count;
    } 
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int target = 3;

        // calling function for counting asubarray 
        System.out.println(countSubArray(arr,target));
    }
}