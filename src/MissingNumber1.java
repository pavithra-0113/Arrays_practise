import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber1 {


    public static void missingNumber1(int[] arr,int n){

         HashSet<Integer> set=new HashSet<Integer>();

         for(int i=0;i<n;i++){
             set.add(arr[i]);
         }
         for(int j=1;j<=n+1;j++){
             if(!set.contains(j)){
                System.out.println(j);
                return;
             }
         }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        missingNumber1(arr, n);
    }
}
