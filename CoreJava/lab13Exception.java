import java.util.Scanner;

public class lab13Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input
            System.out.print("Enter length: ");
            int length = sc.nextInt();

            System.out.print("Enter breadth: ");
            int breadth = sc.nextInt();

            // Condition to throw custom exception
            if (length < 0 || breadth < 0) {
                throw new IllegalArgumentException("Length and breadth must be positive.");
            }

            // Calculating area
            int area = length * breadth;

            System.out.println("Area of Rectangle: " + area);
        }

        // Multi-catch block
        catch (ArithmeticException | 
               java.util.InputMismatchException | 
               IllegalArgumentException e) {

            System.out.println("Exception occurred: " + e.getMessage());
        }

        // Finally block
        finally {
            System.out.println("Finally block executed.");
            sc.close();
        }
    }
}