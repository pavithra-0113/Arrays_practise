import java.util.Scanner;

public class SingleNumber {

    static void singleNumber(int[] arr,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans^=arr[i];

        }
        System.out.println(ans);

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        singleNumber(arr,n);
    }
}
