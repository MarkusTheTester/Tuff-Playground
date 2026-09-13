import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        do {
            System.out.println("===== AUTOMATIC STUDENT GRADE TRACKER =====");
            System.out.println("Step 1: Enter the total number of students in the class");
            System.out.println("Step 2: Enter name of student");
            System.out.println("Step 3: Enter exam score (1 - 100) of student");
            System.out.println("Step 4: Repeat!");
            System.out.println("Would you like to proceed to the program? (Yes/No): ");
                String option = sc.nextLine();
                while (!option.equalsIgnoreCase("Yes") && !option.equalsIgnoreCase("No")) {
                        System.out.println("Just say yes or no brochacho 🥀: ");
                            option = sc.nextLine();
                }
                if (option.equalsIgnoreCase("No")){
                    isRunning = false;
                    break;
                }
            System.out.print("Enter total number of students: ");
                int totalStudents = sc.nextInt();
            int passedCount = totalStudents;
            float totalClassScore = 0f;
            for (int i = 1; i <= totalStudents; i++) {
                System.out.println("--- Student #" + i + " ---");
                System.out.print("Enter name of student: ");
                    sc.nextLine();
                    String studentName = sc.nextLine();
                System.out.print("Enter exam score: ");
                    float score = sc.nextFloat();
                    while (score < 0 || score > 100) {
                        System.out.println("Invalid score. Score must be in between 0 to 100: ");
                            score = sc.nextFloat();
                    }
                    totalClassScore += score;
                char grade;
                boolean isPassed = true;
                if (score >= 90) {
                    grade = 'A';
                } else if (score >= 80) {
                    grade = 'B';
                } else if (score >= 70) {
                    grade = 'C';
                } else if (score >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                    isPassed = false;
                    passedCount--;
                }
                System.out.println("Result: " + studentName + " | Grade: " + grade + " | Passed: " + isPassed);
            }
            float classAverage = totalClassScore / totalStudents;
            System.out.println("===== CLASS SUMMARY =====");
            System.out.println("Total students evaluated: " + totalStudents);
            System.out.println("Total students passed: " + passedCount);
            System.out.println("Class average score: " + classAverage);
            isRunning = false;
        } while (isRunning);
        sc.close();
    }
}