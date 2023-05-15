import java.util.*; 

// Use it for clearing a screen in the CONSOLE 
public class Clear
{ 
    Scanner clear_scan = new Scanner(System.in);
    boolean still_clearing = true; // Uses primitive type boolean
    
    public void clearScreen()
    {
        still_clearing = true;
        System.out.println();
        System.out.println("\nREADY TO MOVE ON? (Enter \"Yes\")"); 
        
        while(still_clearing)
        {
          String clear_input = clear_scan.nextLine();
            
            if (clear_input.equals("Yes"))
            {
              System.out.print("\033[H\033[2J");
              System.out.flush();
              still_clearing = false;
            }
            
            else
            {
              System.out.println("\nStop trying to break out program! Try again please...");
            }
        }    
    }
}