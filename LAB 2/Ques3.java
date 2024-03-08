import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("How many Numbers you want to Sort : ");
        int size = obj.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Number : ");
        for(int i=0; i<size; i++){
            arr[i] = obj.nextInt();
        }
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted numbers are : ");
        for(int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
