import java.util.ArrayList;
import java.util.List;
public class Array {
    public static void main(String[] args) {
        // Primitive Array
        // Array is Homogenous. Array is static in size.
        // There Are Many things is matter in arrays first is time complexcity

        // Array has three Methods to do, First is insert elements in array.
        // Second is finding in array and third is deletion from the array.
        


        // We have array list data structure

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(40);
        list.add(50);
        System.out.println("Before upadation"+list);

        // String ArrayList

        List<String> list1 = new ArrayList<>();
        list1.add("Jay");
        list1.add("Rohan");
        list1.add("Kisan");
        System.out.print("List With String: "+list1);

        // We can add element anywhere like

        list.add(50);
        // And We print that

        System.out.print("\n"+"Array List after update: "+list);

        // Basically Arraylist is a dynamic and when we use add method than array increase it's size automatically....

        
    }
}
