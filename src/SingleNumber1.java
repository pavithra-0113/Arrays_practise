import java.util.Scanner;

public class SingleNumber1 {

    static void singleNumber1(int[] arr,int n) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            for (int j = 0; j < n; j++) {
                if (num == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
                return;
            }
        }
    }



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        singleNumber1(arr,n);
    }
}
