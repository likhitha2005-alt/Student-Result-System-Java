import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
  System.out.print("Enter marks for subject 1: ");
        int m1 = sc.nextInt();
  System.out.print("Enter marks for subject 2: ");
        int m2 = sc.nextInt();
  System.out.print("Enter marks for subject 3: ");
        int m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double avg = total / 3.0;
  System.out.println("\n--- Result ---");
  System.out.println("Name: " + name);
  System.out.println("Total Marks: " + total);
  System.out.println("Average: " + avg);
        if(avg >= 90) {
            System.out.println("Grade: A");
        } else if(avg >= 75) {
            System.out.println("Grade: B");
        } else if(avg >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}
