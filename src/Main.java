import java.util.Scanner;

class Exercises {
    public static void main(String[] args) {
        printLargestNumber();
    }
    public static void printName() {
        String firstName = "Samuil";
        String middleName = "Mariov";
        String lastName = "Konov";

        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println(fullName);
    }

    public static void trianglePerimeter() {
        int a = 4;
        int b = 3;
        int c = 6;

        int trianglePerimeter = a + b + c;
        System.out.println(trianglePerimeter);
    }

    public static void triangleArea() {
        int a = 14;
        int b = 8;

        int area = (a * b) / 2;
        System.out.println("The area of the triangle is: " + area);
    }

    public static void printPineTree() {
        System.out.println("  +");
        System.out.println(" +++");
        System.out.println("+++++");
    }
    public static void printQuadraticEquation() {
        // value of the constants a, b, c
        double a = 7.2;
        double b = 5;
        double c = 9;

        // declared the two roots
        double root1;
        double root2;

        // determinant (b^2 - 4ac)
        double determinant = b * b - 4 * a * c;

        System.out.println("Determinant = " + determinant);

        //determinant > 0
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.println("\nDeterminant > 0");
        System.out.println("root1 = " + root1);
        System.out.println("root2 = " + root2);


        //determinant == 0
        root1 = root2 = -b / (2 * a);
        System.out.println("\nDeterminant == 0");
        System.out.println("root1 = root2 = " + root1);

        //determinant < 0
        double real = -b / (2 * a);
        double imaginary = Math.sqrt(-determinant) / (2 * a);
        System.out.println("\nDeterminant < 0");
        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
    }
    public static void printTrianglePerimeterInput() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter side a size");
        int a = myObj.nextInt();

        System.out.println("Enter side b size");
        int b = myObj.nextInt();

        System.out.println("Enter side c size");
        int c = myObj.nextInt();

        int perimeter = a + b + c;

        System.out.println("Triangle Perimeter is: " + perimeter);
    }
    public static void printTriangleAreaInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side a size");
        int a = myObj.nextInt();

        System.out.println("Enter side b size");
        int b = myObj.nextInt();

        int area = (a * b) / 2;

        System.out.println("The area of the triangle is: " + area);
    }
    public static void printWeekDay() {
        System.out.println("Please enter a day of the week:");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + day + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "-th day of the week is Tuesday");
                break;
            case 5:
                System.out.println("The " + day + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day:" + day + " Please select a day between 1-7");
        }
    }
    public static void isPersonEligibleToWork() {
        String eligibleToWorkMessage = "You are eligible to work";
        String notEligibleToWorkMessage = "You are NOT eligible to work";

        System.out.println("Please enter your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 16) {
            if (age > 67) {
                System.out.println(notEligibleToWorkMessage);
            } else {
                System.out.println(eligibleToWorkMessage);
            }
        } else {
            System.out.println(notEligibleToWorkMessage);
        }
    }
    public static void printLargestNumber() {
        int[] arr = {2, 11, 45, 9};
        //int[] arr = {-3, -5, -2, -4};
        //int[] arr = {-23, -1, -4, -5, 0};

        int largestNumber = arr[0];
        int i;

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber)
                largestNumber = arr[i];
        }

        System.out.println("The largest number is: " + largestNumber);
    }

}
