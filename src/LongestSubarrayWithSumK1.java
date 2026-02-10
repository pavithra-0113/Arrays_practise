import java.util.Scanner;

public class LongestSubarrayWithSumK1 {
    public static void longestSubarrayWithSumK1(int[] arr,int n,int sum){
        int length = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                int s = 0;

                for(int k = i; k <= j; k++){
                    s += arr[k];
                }

                if(s == sum){
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        System.out.println(length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        longestSubarrayWithSumK1(arr,n,k);
    }
}
