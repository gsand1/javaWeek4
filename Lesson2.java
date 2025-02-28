//Gabe Sand
//2/27


import java.util.*;
public class Lesson2 {
    public static void main (String[]args)
    {
        int student1;
        int student2;
        int student3;
        double avg;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours: ");
        student1 = input.nextInt();
        System.out.println("Enter hours: ");
        student2 = input.nextInt();
        System.out.println("Enter hours: ");
        student3 = input.nextInt();
        avg = (student1 + student2 + student3)/3;
        System.out.println("Your hours worked average is " + avg);







    }
}
