/*15. Write a program to take employee id, name, address, DOB and phone number from user and then store it in 
a file called “Emp.txt”. Also display the contents of “Emp.txt”. 
*/
import java.io.*;
import java.util.Scanner;

public class lab15EmployeeFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Create FileWriter object
            FileWriter fw = new FileWriter("Emp.txt");

            // Taking input from user
            System.out.print("Enter Employee ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter DOB: ");
            String dob = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phone = sc.nextLine();

            // Writing data into file
            fw.write("Employee ID: " + id + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Address: " + address + "\n");
            fw.write("DOB: " + dob + "\n");
            fw.write("Phone Number: " + phone + "\n");

            fw.close();
            System.out.println("\nData stored successfully in Emp.txt");

            // Reading file contents
            FileReader fr = new FileReader("Emp.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nContents of Emp.txt:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        sc.close();
    }
}
