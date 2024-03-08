import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the total number of elements: ");
        int n = obj.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter the element whose Occurance you want to know : ");
        int target = obj.nextInt();

        int occurrence = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                occurrence++;
            }
        }

        System.out.println(target + " occurred " + occurrence + " times.");
    }
}
