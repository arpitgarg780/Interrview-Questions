import java.util.Scanner;

class q3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,2,4,5,5,2,565,6,3,55,4,2,4,32,23};
        System.out.print("Note: There is a random array hardcoded in the code\n\bEnter the element number to the position as per max or min:");
        Integer k = sc.nextInt();

        System.out.println(findn(arr,k));
        int arr1[] = {4,2,4,5,5,2,565,6,3,55,4,2,4,32,23};
        System.out.println(finds(arr1,k));

        sc.close();

    }

    private static int findn(int arr[], int n){
        int max=0;
        for(int count =0;count<n;count++){
            if(count!=0){
            arr[max]=0;
            }
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
    }
        return arr[max];
    }

    private static int finds(int arr[],int n){

        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
        }

        int min = 0;
        for(int count = 0; count<n;count++){
            if(count!=0){
                arr[min]=9999;
            }
            for(int i=0;i<arr.length;i++){
                if(arr[min]>arr[i]){
                    min=i;
                }
            }
        }
        return arr[min];
    }
}