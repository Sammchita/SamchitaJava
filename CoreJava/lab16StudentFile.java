//16. Write a program to read name, age, grade, contact number of student and write the record in file std.txt and 
//copy the content std.txt to std1.txt then display the content of std1.txt.
import java.io.*;
import java.util.Scanner;

public class lab16StudentFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Taking input from user
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            String age = sc.nextLine();

            System.out.print("Enter Grade: ");
            String grade = sc.nextLine();

            System.out.print("Enter Contact Number: ");
            String contact = sc.nextLine();

            // Writing into std.txt
            FileWriter fw = new FileWriter("std.txt");
            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Grade: " + grade + "\n");
            fw.write("Contact: " + contact + "\n");
            fw.close();

            System.out.println("\nData written into std.txt");

            // Copy std.txt to std1.txt
            FileReader fr = new FileReader("std.txt");
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw2 = new FileWriter("std1.txt");
            BufferedWriter bw = new BufferedWriter(fw2);

            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("File copied to std1.txt");

            // Display content of std1.txt
            FileReader fr2 = new FileReader("std1.txt");
            BufferedReader br2 = new BufferedReader(fr2);

            System.out.println("\nContents of std1.txt:");
            while ((line = br2.readLine()) != null) {
                System.out.println(line);
            }

            br2.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
