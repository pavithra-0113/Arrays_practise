import java.util.Arrays;
import java.util.Scanner;

public class Reverse {

    static void reverse(int[] arr,int n){
        int left=0,right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;


        }
        System.out.print(Arrays.toString(arr));
    }




    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr,n);
    }
}
