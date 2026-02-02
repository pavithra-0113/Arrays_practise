import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    static int removeDuplicates(int[] arr,int n){
         if(n==0)
             return 0;

         int i=0;
         for(int j=0;j<n;j++){
             if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
             }
         }
         return i+1;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int newLength=removeDuplicates(arr, n);

        for(int j=0;j<newLength;j++){
            System.out.print(arr[j]+" ");
        }
    }
}

