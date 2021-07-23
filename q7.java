public class q7 {// array rotation
    public static void main(String args[]){
        int arr[] = {1,2,3,5,6,8,9};
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        System.out.println("This is the ratated array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
