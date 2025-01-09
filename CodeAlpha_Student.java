// task 1
     import java.util.Scanner;

   public class  CodeAlpha_Student
     {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the teacher for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Create an array to store the grades
        int[] grades = new int[numberOfStudents];
        
        // Collect grades from the teacher
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }
        
        // Compute the average, highest, and lowest grades
        int total = 0;
        int highest = grades[0];
        int lowest = grades[0];
        
        for (int grade : grades) {
            total += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        
        double average = total / (double) numberOfStudents;
        
        // Display the results
        System.out.println("\nResults:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        
        scanner.close();
    }
}






















































