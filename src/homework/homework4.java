package homework;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.Arrays;

class Homework4 {

    public static void main(String[] args) {
        array();
    }
    public static void printArray() {
        int[] arr = {2, 3, 5};
        System.out.println(arr[2]);
    }
    public static void printArraySum() {
        int[] sum = {2, 5, 6, 9};
        System.out.println(sum[0] + sum[3]);
    }
    public static void printElements() {
        String[] monitor = {"LG", "Samsung", "Sony"};
        String[] color = {"Black", "White", "Inox"};
        double[] size = {15.2, 17.2, 24.2};
        double[] price = {249.90, 560.99, 1299.50};
        System.out.println("Monitor" + "-" + monitor[0]);
        System.out.println("Color" + "-" + color[1]);
        System.out.println("Size" + "-" + size[2]);
        System.out.println("Price" + "-" + price[2] + "лв");
    }
    public static void printLargestNumber() {
        int[] arr = {22, 87, 12, 35};
        int largestNumber = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber)
                largestNumber = arr[i];
        }
        System.out.println("The largest number is: " + largestNumber);
    }

    public static void array() {
        //create
        String[] friendsArray = {"Petar", "Mihail", "Dimitar", "Ivan"};
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Petar", "Mihail", "Dimitar", "Ivan"));
        //get element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(1));
        //get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());
        //add element
        friendsArrayList.add("Atanas");
        System.out.println(friendsArrayList.get(4));
        //set element
        friendsArray[1] = "Petko";
        System.out.println(friendsArray[1]);
        friendsArrayList.set(1, "Petko");
        //print
        System.out.println(friendsArrayList);

    }
}