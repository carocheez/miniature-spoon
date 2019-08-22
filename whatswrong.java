import java.util.*;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Hi there! What's wrong? How are you feeling today? 

                       A. Unmotivated/Uninspired
                       B. Homesick
                       C. Anxious
                       D. Self-critical
                       
                       Select one of the above by typing the corresponding letter on your keyboard." ) ; 
                       
     //accepting user input
     String user_input = in.NextLine(); 
     
     // list of my responses based on user_input, which will be randomized to make things fun!
     
     String [] a = {"So you're feeling unmotivated. That's okay; everyone has those days. Keep your head up; great things are coming. ", 
                    "So you're feeling unmotivated. Write down a list of items to complete, start with the small things, and hopefully you will feel more motivated to do bigger tasks after this!"};
                       
     String [] b = {"So you're feeling sad. Identify what's causing you to be in a bad mood. Keep your head up; great things are coming." ,
                    "So you're feeling sad. 
                       
     // what to print based on the user_input
                       
     if user_input == ("A") {
       System.out.println(" ")
     }
                      
     if user_input == ("B") {
       System.out.println(" ")
     }
                       
     if user_input == ("C") {
       System.out.println(" ")
     }                 
     
     if user_input == ("D") {
       System.out.println(" ")
     }   
                       
     
                  
  }
