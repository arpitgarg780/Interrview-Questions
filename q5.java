

public class q5 {

    public static void main(String arg[]){
        int arr[] = {-1,4,5,7,4,3,6,-1,4,-1,4,-2};

        int ans[] = move(arr);

        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }

    private static int[] move(int arr[]){
        int ans[] = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[index] = arr[i];
                index++;
                arr[i]=0;//Here I am asuming that 0 value will not be present in the array
                //If 0 is present then Need to use the array as a proper data structure with the fucntion or any value to assumed or checked for not to be present

            }
        }
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0){
                    ans[index]=arr[i];
                    index++;
                }
            }
            return ans;
    }
    
}
