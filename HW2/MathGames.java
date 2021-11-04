package HW2;

import java.util.Scanner;

public class MathGames {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double base, perpendicular, hypotenuse;        
        
            //get the length of the base
            System.out.print("Enter a value for base: ");                                                             
            base = input.nextDouble();
        
            //get the length of the perpendicular
            System.out.print("Enter a value for perpendicular: ");
            perpendicular = input.nextDouble();
        
            //find the square root of (base^2 + perpendicular^2)
            hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));
        
            System.out.println("The length of the hypotenuse is: " + hypotenuse + "\n");

            System.out.println("Enter the value of grade: ");
            double gradeValue = input.nextDouble();
            double roundUp = Math.ceil(gradeValue);
           // System.out.println("Your grade is " + roundUp);
            if (roundUp > 89) {
                // block of code to be executed if the condition is true
                System.out.println("Your grade is an A."+ "\n");
            } else if (roundUp > 79) {
                // block of code to be executed if the condition is false
                System.out.println("Your grade is a B."+ "\n");
              } else if (roundUp > 69) {
                // block of code to be executed if the condition is false
                System.out.println("Your grade is a C."+ "\n");
                } else if (roundUp > 59) {
                    // block of code to be executed if the condition is false
                    System.out.println("Your grade is a D."+ "\n");
                } else if (roundUp < 60) {
                    System.out.println("Your grade is a F."+ "\n");
        }
            System.out.println("Enter the cost of the meal: ");
            double totalBill = input.nextDouble(); 
        //input.nextDouble(); is a method that can takes input from user as a double and stores it as mealPrice
        //use double and not int bc there can be decimal point like $100.01
        System.out.println("Enter tip percentage as a decimal: ");
        //input.nextDouble allows user to input number with a decimal
            double tip = input.nextDouble(); 
            double totalAmount = totalBill + (tip*totalBill);
       //math.ceil() is a methoid that rounds up double
            double round = Math.ceil(totalAmount);
            System.out.println("The total amount that needs to be paid is $" + round);

            System.out.println("How many people are paying?");
        //input.nextInt allows user to input number  

            int people = input.nextInt();
       // round divided by people
            double peoplePay = round/people; 
            double roundPay = Math.ceil(peoplePay);
            System.out.println("Each person has to pay $" + roundPay);
       //closes scanner
            input.close();
    }
        
    } 
