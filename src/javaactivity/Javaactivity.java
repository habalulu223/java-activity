
package javaactivity;
import java.util.Scanner;
public class Javaactivity {
Scanner scanner = new Scanner(System.in);
   
    public static void main(String[] args) {
        int arts;
        String name = scanner.nextLine();
        
        
        System.out.print("Enter marks in Science: ");
        int science = in.nextInt();
        System.out.print("Enter marks in History: ");
        int history = in.nextInt();
        System.out.print("Enter marks in Math: ");
        int math = in.nextInt();
        System.out.print("Enter marks in Social: ");
        int social= in.nextInt();
        System.out.print("Enter marks in Arts: ");
        arts = in.nextInt();
        
        
        int totalMarks = science + history + math + social + arts;
        double percentage = (totalMarks / 5.0);
        
        
        String remarks = "";
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage < 76) {
            remarks = "Poor";
        } else if (percentage < 81) {
            remarks = "Fair";
        } else if (percentage < 86) {
            remarks = "Good";
        } else if (percentage < 91) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }
        
        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total percentage: " + percentage);
        System.out.println("Remarks: " + remarks);
        
        if (percentage < 70) {
            System.out.println("Try Again");
        } else {
            System.out.println("Congrats " + name + " you Passed.");
        }

    }
    
}
