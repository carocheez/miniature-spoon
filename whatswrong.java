import java.util.*;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Hi there! What's wrong? How are you feeling today? A. Unmotivated/Uninspired B. Homesick C. Anxious D. Self-critical Select one of the above by typing the corresponding letter on your keyboard.") ; 
                       
     //accepting user input
     String user_input = in.NextLine(); 
     
     // list of my responses based on user_input, which will be randomized to make things fun!
     
     String [] a = {"So you're feeling unmotivated. That's okay; everyone has those days. Keep your head up; great things are coming. ", 
                    "So you're feeling unmotivated. Write down a list of items to complete, start with the small things, and hopefully you will feel more motivated to do bigger tasks after this!"};
                       
     String [] b = {"So you're feeling homesick. It's totally normal to feel homesick after moving away from your entire life and starting a new one. Call home to hear from people who know and love you!" ,
                    "So you're feeling homesick. get over it. lol jk" };
                       
     String [] c = {"So you're feeling anxious. take deep breaths luv xx" , 
                    "So you're feeling anxious. write a list of what you're grateful for luv xx" };
                       
     String [] d = {"So you're feeling self-critical. it's okay luv xx" , 
                    "So you're feeling self-critical. aren't we all." };                  
                       
     // what to print based on the user_input
                       
     if (user_input == ("A")) {
       Random Aind = new Random(); 
       int a_response = (int)(Math.random()*1);
       System.out.println(a[a_response]);
     }
                      
     if (user_input == ("B")) {
      Random Bind = new Random(); 
       int b_response = (int)(Math.random()*1);
       System.out.println(b[b_response]);
     }
                       
     if (user_input == ("C")) {
       Random Cind = new Random(); 
       int c_response = (int)(Math.random()*1);
       System.out.println(c[c_response]);
     }                 
     
     if (user_input == ("D")) {
       Random Dind = new Random(); 
       int d_response = (int)(Math.random()*1);
       System.out.println(d[d_response]);
     }   
                       
     
                  
  }
