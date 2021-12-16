package HW5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args) {
      nums(); 
      Week();
    
    }
 // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.
   public static void nums() {
        System.out.println("Here is an arraylist of 15 numbers: ");
        int n = 15;
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> numbers = new ArrayList<Integer>(n);
 
        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= n; i++)
            numbers.add(i);
 
        // Printing elements
        System.out.println(numbers);
        System.out.println("Here is the tenth element of the array nums: " + numbers.get(9));

        numbers.set(4, 99);
        System.out.println("I will change the 5th element of the array alpha to 99 " + "\n" + numbers);
        
        numbers.set(4, 5);
        numbers.set(8, 7 + 14);
        System.out.println("value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums" + "\n" + numbers);

    }

 // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) change the arrayList to start on Sunday

    public static void Week(){
      ArrayList<String> weekList = new ArrayList<String>();
        // ArrayList weekList = new ArrayList(); 
        //remember it starts at 0 
         weekList.add("Monday"); 
         weekList.add("Tueday");
         weekList.add("Wednesday");
         weekList.add("Thursday");
         weekList.add("Friday");
         weekList.add("Saturaday");
         weekList.add("Sunday");


         System.out.println("Here are each day of the week in an ArrayList");
         System.out.println(weekList);


         System.out.println("Here are each day of the week");
         for (int i =0; i<weekList.size(); i++) {
             System.out.println(weekList.get(i));
         }
         
         System.out.println("Here are the days we have class");
         System.out.println(weekList.get(1) + " and " + weekList.get(3));
         String item = "Sunday"; 
         int itemPos = weekList.indexOf(item);
         weekList.remove(itemPos);
         weekList.add(0, item);
         System.out.println("It will start on Sunday instead" + "\n" + weekList); 

  }


 // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisable by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisable by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 
public static void inpution(String user) {
    Scanner input = new Scanner(System.in); 

       
}
}
