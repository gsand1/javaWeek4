//Gabe Sand
// 3/3
// Div and Mod

import java.util.*;
public class DivAndMod {
    public static void main (String[]args)
    {
        int first;
        int second;
        int modDiv;
        int div;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        first = input.nextInt();
        System.out.println("Enter another integer: ");
        second = input.nextInt();
        div = (first / second);
        modDiv = (first % second);
        System.out.println("Regular division is " + div + " and your modulus division is " + modDiv); 








    }
}
