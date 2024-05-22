// Creating Own ArrayList Method
class List {
    public int[] add(int n) {
        int size = 0;
        int arr[] = new int[size];
        try{
            arr[size] = n;
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        size++;
        return arr;
    }
}
public class MakingOwnMethod {
    public static void main(String[] args) {
        List l1 = new List();
        l1.add(2);
    }
}
