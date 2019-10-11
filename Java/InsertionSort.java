import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i]=obj.nextInt();
        }
        insertion(arr);
        display(arr);
    }
    public static void insertion(int[] arr){
        for (int counter = 1; counter <=arr.length-1; counter++) {
            int val=arr[counter];
            int j=counter-1;
            while ( j>=0 && arr[j] > val ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
    public static  void display(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

}
