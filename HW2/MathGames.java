package HW2;

import java.util.Scanner;

public class MathGames {
       public static void main(String[] args) { 
        System.out.println("Welcome \n");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a value for base: ");                                                             
        double base = scan.nextDouble();
        System.out.print("Enter a value for perpendicular: ");
        double perpendicular = scan.nextDouble();
        hypo(base, perpendicular); 

        System.out.println("Enter the value of grade: ");
        
        double gradeValue = scan.nextDouble();
        letter(gradeValue); 

        System.out.println("Enter the cost of the meal: ");
        double totalBill = scan.nextDouble(); 

        System.out.println("Enter tip percentage as a decimal: ");
        //scan.nextDouble allows user to input number with a decimal
        double tip = scan.nextDouble(); 
        System.out.println("How many people are paying?");
        //scan.nextInt allows user to input number  

       int people = scan.nextInt();
        billing(totalBill, tip, people);
        //closes scanner

        scan.close();
    

    }
    public static double hypo(double base, double perpendicular) {

        //find the square root of (base^2 + perpendicular^2)
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(perpendicular, 2));
    
        
        System.out.println("The length of the hypotenuse is: " + hypotenuse + "\n");
        return hypotenuse; 
    } 

    public static double letter(double gradeValue) {

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
            //return gradeValue;
}
        return gradeValue;

}
    public static double billing(double totalBill, double tip, int people) {

        //scan.nextDouble(); is a method that can takes input from user as a double and stores it as mealPrice
        //use double and not int bc there can be decimal point like $100.01
        //scan.nextDouble allows user to input number with a decimal

       double totalAmount = totalBill + (tip*totalBill);
       //math.ceil() is a methoid that rounds up double
        double round = Math.ceil(totalAmount);
       System.out.println("Your rounded total amount you have to pay is $" + round);

      
       double peoplePay = Math.ceil(round/people); 
       System.out.println("Each person has to pay $" + peoplePay + "(rounded)");

       return peoplePay; 
    }
}
       
