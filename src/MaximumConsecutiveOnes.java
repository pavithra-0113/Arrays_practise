import java.util.Scanner;

public class MaximumConsecutiveOnes {

    static void maximumConsecutiveOnes(int[] arr,int n){
        int maxCount=0;
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }else{
                count=0;
            }
        }
        System.out.println(maxCount);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        maximumConsecutiveOnes(arr,n);
    }
}
