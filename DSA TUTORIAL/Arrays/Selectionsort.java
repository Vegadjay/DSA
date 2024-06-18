// ! Selection Sort
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {20,30,10,40,50,20,10};
        //* First We have outer loop this outer loop is run for (n-1) time*/
        for(int i = 0;i<arr.length;i++) {
            int small = i;
            // * This for loop is starts from smallest number because all the element before the loop is sorted in smallest part
            // * In the Selection sort the value is increase and in bubble sort value is decrease.. 
            for(int j = i+1;j<arr.length;j++) {
                if(arr[small] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
            System.out.print(arr[i] + " ");
        }
    }
}
// ! In this code time complexity is (O^2);