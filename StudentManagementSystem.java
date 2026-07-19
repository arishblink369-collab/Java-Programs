import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;
    double marks;

    Student(int id, String name, int age, String course, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    void display() {
        System.out.println("----------------------------------------");
        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Age          : " + age);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);

        if (marks >= 90)
            System.out.println("Grade        : A+");
        else if (marks >= 80)
            System.out.println("Grade        : A");
        else if (marks >= 70)
            System.out.println("Grade        : B");
        else if (marks >= 60)
            System.out.println("Grade        : C");
        else if (marks >= 35)
            System.out.println("Grade        : D");
        else
            System.out.println("Grade        : FAIL");

        System.out.println("----------------------------------------");
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {

            System.out.println("\n========= STUDENT MANAGEMENT SYSTEM =========");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Find Topper");
            System.out.println("7. Calculate Average Marks");
            System.out.println("8. Sort Students by Marks");
            System.out.println("9. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age : ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Course : ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    double marks = sc.nextDouble();

                    students[count] = new Student(id, name, age, course, marks);

                    count++;

                    System.out.println("Student Added Successfully.");
                    break;

                case 2:

                    if(count==0){
                        System.out.println("No Student Found.");
                    }
                    else{
                        for(int i=0;i<count;i++){
                            students[i].display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search : ");
                    int sid = sc.nextInt();

                    boolean found = false;

                    for(int i=0;i<count;i++){

                        if(students[i].id==sid){

                            students[i].display();

                            found=true;

                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update : ");
                    int uid = sc.nextInt();

                    boolean update=false;

                    for(int i=0;i<count;i++){

                        if(students[i].id==uid){

                            sc.nextLine();

                            System.out.print("New Name : ");
                            students[i].name=sc.nextLine();

                            System.out.print("New Age : ");
                            students[i].age=sc.nextInt();

                            sc.nextLine();

                            System.out.print("New Course : ");
                            students[i].course=sc.nextLine();

                            System.out.print("New Marks : ");
                            students[i].marks=sc.nextDouble();

                            update=true;

                            System.out.println("Record Updated.");

                            break;
                        }
                    }

                    if(!update){
                        System.out.println("Student Not Found.");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete : ");
                    int did=sc.nextInt();

                    boolean delete=false;

                    for(int i=0;i<count;i++){

                        if(students[i].id==did){

                            for(int j=i;j<count-1;j++){

                                students[j]=students[j+1];

                            }

                            count--;

                            delete=true;

                            System.out.println("Student Deleted.");

                            break;
                        }
                    }

                    if(!delete){

                        System.out.println("Student Not Found.");

                    }

                    break;

                case 6:

                    if(count==0){

                        System.out.println("No Student Data.");

                    }

                    else{

                        Student topper=students[0];

                        for(int i=1;i<count;i++){

                            if(students[i].marks>topper.marks){

                                topper=students[i];

                            }

                        }

                        System.out.println("\nTopper Details");

                        topper.display();

                    }

                    break;

                case 7:

                    if(count==0){

                        System.out.println("No Student Data.");

                    }

                    else{

                        double sum=0;

                        for(int i=0;i<count;i++){

                            sum+=students[i].marks;

                        }

                        System.out.println("Average Marks = "+(sum/count));

                    }

                    break;

                case 8:

                    for(int i=0;i<count-1;i++){

                        for(int j=i+1;j<count;j++){

                            if(students[i].marks<students[j].marks){

                                Student temp=students[i];

                                students[i]=students[j];

                                students[j]=temp;

                            }

                        }

                    }

                    System.out.println("Students Sorted Successfully.");

                    break;

                case 9:

                    System.out.println("Thank You!");

                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=9);

        sc.close();
    }
}
