import java.util.Scanner;
public class BubbleSort {
    public void Sort(int arr[]){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                }
            }
        }

        public void PrintArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        }
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int [] arr = new int[size];

        System.out.println("Enter unsorted array");
        for (int i=0;i<arr.length; i++) {
            arr[i] = input.nextInt();
        }
            BubbleSort bs = new BubbleSort();
            bs.Sort(arr);
        System.out.println("Print sorted array");
            bs.PrintArray(arr);

    }
}
