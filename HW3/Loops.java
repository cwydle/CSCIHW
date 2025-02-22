import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Welcome!");

    // \"word in quote\" allows you to print out a word with quotes around it 
        //System.out.print("Spell \"eat\" with as many e's before it looks weird? \n");                                                             
        //String str = scan.nextLine();

    //calls the method loopE(str) into boolean's object called eat
        boolean eat = loopE("eeeeat"); 
        System.out.println(eat);

        String answer = stringTimes("code", 3);
        System.out.println(answer);

        String zzzzz = stringZ("zzz");
        System.out.println(zzzzz);

        sums(); 

    }

    //NOTE: DO NOT change anything in the boiler plate
    //If I added default code it is meant to be there
    //and should not be adjusted unless otherwise noted
    //(return statments are usually changed)

    //Make a method that will return true if a given 
    //String contains between 1 and 3 'e' chars.
    //Ex.
    //loopE("eat") -> true
    //eeat -> true
    //eeeat -> true
    //eeeeat -> false

    public static boolean loopE(String str){
        int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)=='e')
                    count++;
                }
            return (count>=1&&count<=3); 
    }

    //Given a String str and int n return a larger string
    //that is n copies of the original string 
    //Ex.
    //stringTimes("Code",2) ->"CodeCode"
    //stringTimes("Code",4) ->"CodeCodeCodeCode"
    public static String stringTimes(String str, int n) {
        String s = "";

        for ( int i = 0; i < n; i++ )
        {
            s = s + str;
        }
        return s;
    } 

    //Create a method Given a string, return the string where all of the "z"
    //Have been removed. Except do not remove a z at the start
    //or end
    //Ex.
    //stringT("zHelloz") -> "zHelloz"
    //stringT("nozthaznks") -> "nothanks"
    //stringT("xksiazdjaasldzsajzasdz") -> "xksiadjaasldsajasdz"
    public static String stringZ(String str){
        for (int i = 0 ;i < str.length();){
            if (str.substring(0,1).equals("z") && str.substring(str.length()-1).equals("z"))
            {
                return str = "z"+ str.replace("z", "")+"z";
            }
            else if (str.substring(0,1).equals("z"))
            {
                return str ="z"+ str.replace("z", "");
            }
            else if(str.substring(str.length()-1).equals("z"))
            {
                return str =str.replace("z", "") +"z";
            }
            else{
               return str= str.replace("z", "");
            }
        }
        return str;
    }

    //Create a method that contains a while loop that allows for
    //The user to input numbers until the number 0 is entered. Each time a number is 
    //entered the total will be summed and then prompted for a second number. 
    //NOTE: I require the use of scanner here to get each integer from the user
    //Assume the numbers entered are integers
    //Also note that the method is void meaning you will not need to return anything
    //It will need to sysout the numbers however
    //Below is a sample output what I would like
    // I will add up the numbers you give me....
    // Number: 12
    // The total so far is 12.
    // Number: 2
    // The total so far is 14.
    // Number: 3
    // The total so far is 17.
    // Number: 4
    // The total so far is 21.
    // Number: 1
    // The total so far is 22.
    // Number: 2
    // The total so far is 24.
    // Number: 3
    // The total so far is 27.
    // Number: 0
    // TOTAL ENDED --- The total is 27.
    public static void sums() {
        System.out.println("I can add up the numbers you give me. \nA '0' will end the code");
      int number, total = 0;
      Scanner scan = new Scanner(System.in);
      do{
          System.out.println("Please enter number: ");
          number = scan.nextInt();
          System.out.println("Number: " + number);
          total += number;
          System.out.println("Your total so far is " + total);
      }while (number != 0);  
      System.out.println("TOTAL ENDED --- The total is " + total);
      scan.close();
    
    }
}
