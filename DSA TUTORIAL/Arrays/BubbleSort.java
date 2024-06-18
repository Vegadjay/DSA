// ! This is the bubble sort
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {40,30,20,50,70};
        // * This loop is goes for n-1 elements 
        // * When Loop is run first time than no elements is sorted than second time loop is run than one element is sorter while loop is run at third time than three elements is sorted....
        for(int i = 0; i<arr.length-1;i++) {
            // *  In this second we go for (n-1) time because while we start first loop than one element is sorted than we remove it in this second loop and while it run second time than second time this loop is run and two elements is sorted....
            for(int j = 0;j<arr.length-i-1;j++) {
                // * Now checking all the elements..
                if(arr[j] > arr[j+1]) {
                    // Swap the elements..
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
// ! Time complextiy of this code is O(n^2);