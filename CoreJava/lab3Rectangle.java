import  java.util.Scanner;
class  lab3Rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breadth, area;
        System.out.println("Enter length");
        length = sc.nextInt();
        System.out.println("Enter breadth");
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
        System.out.println("SAMCHITA PANDEY");
        sc.close();
    }
}