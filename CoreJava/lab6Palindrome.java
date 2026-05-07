//Write a program to check the given number is palindrome or not.
import java.util.Scanner;
class lab6Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, rev=0, rem, temp;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        temp = num;
        while(num>0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        if(temp == rev){
            System.out.println("The number is palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
         System.out.println("SAMCHITA PANDEY"); 
        sc.close();

}
    }
   