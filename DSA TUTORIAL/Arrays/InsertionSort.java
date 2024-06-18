// ! Insertion sort
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {30,40,201,40,50,30,20,10};
        // * In this sort loop is run for all unsorted part..
        for(int i = 0;i<arr.length;i++) {
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];  
                j--;
            }
            arr[j+1] = current;
        }
        for(int i = 0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
