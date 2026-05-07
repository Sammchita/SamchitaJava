//Write a program to find sum of elements of an array.
import java.util.Scanner;
class ArrayProduct{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, product = 1;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");  
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            product *= arr[i];
        }
        System.out.println("Product of array elements is: " + product);
        System.out.println("SAMCHITA PANDEY");
        sc.close();

    }
}