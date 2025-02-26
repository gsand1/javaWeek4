//Gabe Sand 2/25
//This program isolates digits
//Digits.java
public class digits {


    public static void main(String[]args)
    {
        int number;
        int ones;
        int tens;
        int hundreds;
        int thousands;
        number = 258;
        ones = number % 10;
        tens = (number / 10) % 10;
        hundreds = (number / 10) / 10 % 10;
        thousands = (number / 10) / 10 /10 % 10;
        System.out.println("The ones digit is " + ones + "  the tens digit is " + tens + "  the hundreds digit is " + hundreds + " the thousands is " + thousands);
        



    }
}