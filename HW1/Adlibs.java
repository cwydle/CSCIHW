package HW1;
// make a method that accepts 2 Strings and 1 int (Someones name, age, and favorite color and then returns a story about them)
// Hint1: The objects name is Adlibs and you require a name age and favoriteColor all in strings
// Hint2: You will need to return a string. You can concat the variables and the strings together
// Hint3: A sample story if you are lost can be as simple as "Hello! My name is ____, and I am ____, and my favorite  
//        color is ___"
public class Adlibs {
    public String story(String name, int age, String favoriteColor) {
     // name = "LMAO";
     // age = 1; 
     // favoriteColor = "blue"; 
      return "\n" + "Hello there person. My name is " + name + ". I am " + age + ". My favorite color is " + favoriteColor + ". \n"; 
    }
}

//story is method 
    //return a string (use the variables in ())
     //   System.out.println("");
       // String answer = ""
       // return answer;
       //return "name age color";