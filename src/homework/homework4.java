package homework;

import java.util.*;
import java.util.Scanner;

class Homework4 {

    public static void main(String[] args) {
        computeAverageNumber();
    }
    public static void printArray() {
        int[] arr = {2, 3, 5};
        System.out.println(arr[2]);
    }
    public static void printArraySum() {
        int[] numbers = {2, 5, 6, 9};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
        System.out.println(numbers[0] + numbers[3]);
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

    public static void printSmallestNumber() {
        int[] number = {97, 54, 12, 33, 44};
        int smallestNumber = number[0];
        int i;

        for (i = 1; i < number.length; i++) {
            if (number[i] < smallestNumber)
                smallestNumber = number[i];
        }
        System.out.println("The smallest number is: " + smallestNumber);
    }

    public static void avarageNumber() {
        int[] number = {5, 13, 3};
        double[] number2 = {11.3, 8.3, 22.4};
        System.out.println((number[0] + number[1] + number[2]) / 3);
        System.out.println((number2[0] + number2[1] + number2[2]) / 3);
    }

    public static void printAll() {
        String[] games = {"Catan", "Azul", "Blood Rage", "Sagrada"};
        ArrayList<String> gamesList = new ArrayList<>(Arrays.asList("Catan", "Azul", "Blood Rage", "Sagrada"));
        System.out.println("The Boardgames list is:"+ gamesList);
        System.out.println("The Boardgames list is:" + games[0] + "," + " " + games[1] + "," + " " + games[2] + "," + " " + games[3] + "!");
    }

    public static void names() {
        Set<String> names = new HashSet<>();
        names.add("Sami");
        names.add("Reni");
        System.out.println(names);
    }

    public static void nameAgeShoeSize() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        float shoeSize;

        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        System.out.println("Please enter your age: ");
        age = scanner.nextInt();

        System.out.println("Please enter your shoe size: ");
        shoeSize = scanner.nextFloat();

        System.out.println("Your name is:" + name);
        System.out.println("Your age is:" + age);
        System.out.println("Your shoe size is:" + shoeSize);
    }

    public static void printElementNum() {
        int[][] num = { {3, 5, 6},
                        {13, 34, 8},
                        {22, 14, 8},
                        {11, 13, 16}
                      };
        for (int i = 0; i < num.length; i++) {
            System.out.println();
            for (int j = 0; j < num[i].length; j++) {
                System.out.println(num[i][j]);
            }
        }
    }

    public static void printDiagnalSum() {
    }
    public static void printMatrixElements() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
        }
        System.out.println();
        for (int[] row : matrix) {
            for (int col = 0; col < row.length; col++) {
                System.out.printf("%d ", row[col]);
            }
        }
    }
    public static void printDynamicMatrixElements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("Please enter the number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,%d] = ", row, col);
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println("The matrix is created: " + Arrays.deepToString(matrix));
    }
    public static void sumMatrixDiagonal() {
        int[][] matrix = {
                {10, 5, 6, 20},
                {1, 10, 20, 4},
                {11, 20, 10, 14},
                {20, 24, 25, 10}
        };
        int matrixSize = 4;

        int principalDiagonal = 0, secondaryDiagonal = 0;
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (row == col)
                    principalDiagonal += matrix[row][col];
                if ((row + col) == (matrixSize - 1))
                    secondaryDiagonal += matrix[row][col];
            }
        }
        System.out.println(" The sum of principal diagonal is: " + principalDiagonal);
        System.out.println(" The sum of secondary diagonal is: " + secondaryDiagonal);
        System.out.println(" The sum of both diagonal is: " + (principalDiagonal + secondaryDiagonal));
    }
    public static void computeAverageNumber() {
        int num1 = 3;
        int num2 = 6;
        int num3 = 8;
        System.out.println((num1 + num2 + num3) / 3);
    }
}