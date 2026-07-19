import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    double marks;

    Student(int r, String n, double m) {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        Student s = new Student(roll, name, marks);
        s.display();

        sc.close();
    }
}
