import java.util.Scanner;

public class SecondLargest {


    static void secondLargest(int[] arr,int n){
        int Largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }else if(arr[i]<Largest && arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println(Largest+","+secondLargest);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        secondLargest(arr,n);
    }
}
