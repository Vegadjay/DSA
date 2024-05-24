// Making Own Array Method

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
        for (int i = 0;i<this.curruntidx;i++) {
            str.append(this.arr[i]).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }

    // Now Making Array Pop method

    public int pop() {
        int lastIdx = arr.length - 1;
        return arr[lastIdx];
    }

    public void delete(int index) {

        for (int i = 0; i < curruntidx - 2; i++) {
            this.arr[i] = this.arr[i+1];
            this.arr[curruntidx] = 0;
            curruntidx--;
        }
    }

    // IndexOf Method

    public int indexOf(int number) {
        // Using Liner Search;
        for(int i = 0;i<curruntidx;i++) {
            if(arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

}

public class MakingOwnMethods {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        // If You Use this method so Follow the steps,,

        // 1. Create Object of ArrayList.
        // 2. Use myarray Method and pass the size of the array.
        // 3. Now Use Add Method to Add Elements in array.

        ArrayList a1 = new ArrayList();
        a1.myArray(11);
        a1.add(3);
        a1.add(4);
        System.out.println(a1);

        System.out.println(a1.pop());

        a1.add(10);
        a1.add(40);
        a1.add(50);
        a1.add(70);
        a1.add(80);
        a1.add(90);
        a1.add(100);
        a1.add(200);

        System.out.println("This is the full Array"+a1);

        System.out.println("Index is: "+a1.indexOf(40));

        a1.delete(30);
        a1.delete(70);
        System.out.println("This is the new updated Array: "+a1);
    }
}