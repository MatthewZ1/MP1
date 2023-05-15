// Imports (for chatbot usage)
import java.util.*; 

public class Main 
{
  public static void main(String[] args)
  {
    // Uses multiple classes and objects.
     Scanner sc = new Scanner(System.in);
     Clear clear = new Clear();

    // Starter Message
    System.out.println("\n--------------------------------------------------------------------");
    System.out.println("Ignore the warning on top, we have been hacked before...");
    System.out.println("\nBEFORE WE START, JUST TO MAKE SURE: Are you a Junior in Brooklyn Tech? \n(Y/N)"); // Uses System.out.println()
    String confirmation1 = sc.nextLine(); 

    // Uses nested if statements.
    if (confirmation1.equals("Y"))
    {
    
      System.out.println("\nAre you Mr. Holmer or a student in Mr. Holmer period 2 & 3 class? \n(Y/N)"); // Uses string literals
      String confirmation2 = sc.nextLine();     

        if (confirmation2.equals("Y"))
        {
            System.out.println("\nYou may proceed boss. Be NOW.");
        }

        // Uses else statements.
        else 
        {
         System.out.println("\nSheesh... Sorry stranger but you're not supposed to here but whatever you can get a sneak peek anyways."); 
        }
    }

    Student techie = new Student(69);
    Student aPlus = new Student(68);
    System.out.println("\nYou see 2 students at school: Techie and APlus(A+). You take a quick look at them and You notice that it is " + techie.equals(aPlus) + " that APlus(A+) is taller than techie.");
    System.out.println("Just a small note... you're taller than the sitting next to you (*^▽^*)");

    if (confirmation1.equals("N"))
    {
        System.out.println("\nYou're a liar. This project would have never been presented if you were not one unless you a Stuy spy.....");
    }

    System.out.println("\n------------------------------------------------------------------------------------");
    System.out.println("\nSince you are viewing this program, you have agreed to the FOLLOWING TERMS (*^▽^*).");
    System.out.println("\n1) Mr. Holmer will be reviewing this program and has agreed to give us a hundred for this project.");
    System.out.println("\n2) Since the class will be judging our project, the class must give a full score for our Java Cups on the project or else...");
    System.out.println("\n3) Whatever presented in the program will only remain in this class and it must be CONFIDENTIAL as if you were to sign a NDA form.");
    clear.clearScreen(); 

    // Uses multiple classes and objects.
      
    // Profile Class 
    Profile.getProfile();
    clear.clearScreen();

    // Introduction Class
    Introduction.getIntroduction(); 
    clear.clearScreen();
    
    // Major Class 
    Major.getMajor(); // Uses at least one static method using the dot operator and the class name.
    clear.clearScreen(); 

    // Course Selection Class
    CourseSelection.getCourse();
    clear.clearScreen(); 

      
  }
}