import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {

    static void moveZeros(int[] arr,int n){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]==0){
                continue;
            }else{
                arr[i]=arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr,n);
    }
}
