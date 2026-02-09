import java.util.Scanner;

public class MissingNumber3 {

    public static void missingNumber3(int[] arr, int n){
            int xor1=0;
            int xor2=0;

            for(int i=0;i<n;i++){
                xor1+=arr[i];
            }

            for(int i=1;i<n+1;i++){
                xor2+=i;
            }

            System.out.println("Missing number: "+(xor1^xor2));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        missingNumber3(arr,n);
    }
}
