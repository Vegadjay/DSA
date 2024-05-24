// Making Own Array Method

import java.util.Arrays;

class ArrayList {
    // Making Variables and making own methods
    private int arr[];
    private int curruntidx;

    // Making the Array that Create Array for us.

    public void myArray(int sizeOfArray) {
        this.arr = new int[sizeOfArray];
        this.curruntidx = 0;
    }

    // Add Method of the ArrayList Class

    public int[] add(int number) {
        this.arr[curruntidx] = number;
        curruntidx++;
        return arr;
    }

    // Basically Array return us adress of the element so we get the value of the
    // array so we create this toString Method.
    // Basically This toString Method is return while array is return or calling by
    // us.

    public String toString() {
        // StringBuilder is the best way to propogate the array.
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int number : this.arr) {
            str.append(number + ", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

    // Now Making Array Pop method

    public int pop() {
        int lastIdx = arr.length - 1;
        return arr[lastIdx];
    }

    // Delete Method
    // Using toString Method While use this delete method otherwise it returns adress of the variable...
    public int[] delete(int number) {
        int lastIdx = arr.length - 1;
        int[] newArray = new int[lastIdx];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                newArray[j] = arr[i];
                j++;
            }
        }
        arr = newArray;
        return arr;
    }

}

public class MakingOwnMethods {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        // If You Use this method so Follow the steps,,

        // 1. Create Object of ArrayList.
        // 2. Use myarray Method and pass the size of the array.
        // 3. Now Use Add Method to Add Elements in array.

        ArrayList a1 = new ArrayList();
        a1.myArray(2);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);

        System.out.println(a1.pop());
        System.out.println(Arrays.toString(a1.delete(4)));
    }
}