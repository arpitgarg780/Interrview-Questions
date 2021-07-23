public class q8{
    static int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max=arr[0],g_max=arr[0];
        for(int i=1;i<n;i++){
            int temp = max+arr[i];
            if(temp>arr[i]){
                max=temp;
            }
            else{
                max=arr[i];
            }
            if(g_max<max){
                    g_max=max;
                }
        }
        return g_max;
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,3,2,4,-1,1,-56,-46};
        int ans = maxSubarraySum(arr,arr.length);

        System.out.println("The maximum sub array is "+ans);
        
    }
}