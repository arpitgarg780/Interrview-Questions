public class q4 {

    public static void main(String args[]){
        int arr[] = {0,0,0,1,1,2,2,0,0,2,2,2,2,1,1,1};
        int ans[] = sort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    private static int[] sort(int arr[]){
        int count_0=0,count_1=0;

        for(int i=0;i<arr.length;i++){
            switch(arr[i]){
                case 0:
                    count_0++;
                    break;
                case 1:
                    count_1++;
                    break;
                case 2:
                    break;
            }
        }
        int ans[] = new int[arr.length];
        for(int i=0;i<count_0;i++){
            ans[i]=0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            ans[i]=1;
        }
        for(int i=count_0+count_1;i<arr.length;i++){
            ans[i]=2;
        }
        return ans;
    }
    
}
