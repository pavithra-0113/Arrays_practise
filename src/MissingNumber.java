import java.util.Scanner;

public class MissingNumber {

   public static void missingNumber(int[] arr,int n) {
       int j = 1;
       for (int i = 0; i < n; i++) {
           if (arr[i] != j) {
               System.out.println("Missing number: " + j);
               return;
           }
           j++;
       }
       System.out.println("Missing number: " + j);

   }





    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


        missingNumber(arr,n);


    }
}
