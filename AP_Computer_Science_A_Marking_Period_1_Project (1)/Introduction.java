import java.util.*;

public class Introduction
{
    public static void getIntroduction()
    {
      Scanner intro = new Scanner(System.in); 

      // Throws no IndexOutOfBoundsException. (becaused we CATCHED it)
      try 
      {
          String t = "test";
          System.out.println(t.charAt(5));
      }

      catch (Exception e)
      {
          // Uses an escape sequence ( \”, \\, or \n).
          System.out.print("        /\\           /\\\n"); // Uses System.out.print()
          System.out.print("       /\"\"\\         /\"\"\\\n");
          System.out.print("      /\"  \"\\       /\"  \"\\\n");
          System.out.print("      \\\"  \"/       \\\"  \"/\n");
          System.out.print("       \\\"\"/         \\\"\"/\n");
          System.out.print("        \\/           \\/\n");
          System.out.print("\nHello (●'◡'●)! Welcome to Brooklyn Technical High School, where the city's best minds learn." + "\n"); 
          System.out.println("\nLet's get you up to speed! You have been selected to attend Brooklyn Technical High School after getting a SHSAT score of 500! Too bad you couldn't get into Stuy :("); 
          System.out.println("\nYou've finished Freshman year, and you're halfway through Sophomore Year!╰(*°▽°*)╯");
          System.out.println("\nIn this storyline, you are challenged with having to go through a rough Brooklyn Tech junior student life! (⊙_⊙;)"); 
          System.out.println("\nFirst, how are you doing so far (in general or about high school)! \nA) Good and ready! \nB) Sustaining! \nC) Barely Surviving  \nD) Exhausted...");
      }
      
      System.out.println("\nPsst put in the letter on how you are feeling! \n");
        
      String response = intro.nextLine();  
        
        if  (response.equals("A")) // Uses at least one of the following String methods: length, substring, indexOf, equals, compareTo (IT SAID ONE OF THE FOLLOWING NOT EACH, SO WE USED .equals())

        {
            System.out.println("Glad you're doing well! Let's get started!");
        }
            
        else if (response.equals("B"))
        {
            System.out.println("Keep up the good work. Let's get started!");
        }
            
        else if (response.equals("C"))
        {
            System.out.println("You got this! If you're feeling stressed, talk to your guidance counselor or join support groups! Let's get started!");
        }     
            
        else if (response.equals("D"))
        {
            System.out.println("Sorry to hear that... please talk to your guidance counselor or speak to a social worker! Go here for more information: https://www.bths.edu/GUIDANCE/office_info.jsp");
        System.out.println("However, this program must continue...");      
        }
            
        else 
        {
            System.out.println("Hey! Stop trying to be smart. Follow the darn rules!! 😭😭😭 We're going to start the program anyways! 😒"); 
      }
        
    } 
}