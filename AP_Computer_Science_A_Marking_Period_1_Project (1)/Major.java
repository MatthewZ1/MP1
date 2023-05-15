import java.util.*;
public class Major
{
    public static void getMajor()
    { 
      //Major Classes (combined with course selection?)

        System.out.println("Since you're still a Sophomore at Tech, you have to, of course, choose your major at Tech!"); 
        
        System.out.println("\nHere are the list of majors: \n\n1. Aerospace \n2. Architecture \n3. Bio Science \n4. Chemistry \n5. Civil Engineering \n6. Electrical Engineering \n7. Environmental Science \n8. Finance \n9. Industrial Design \n10. Law & Society \n11. LIU Advanced Health Professions \n12. LIU PharmD \n13. Mathmematics \n14. Mechantronics & Robotics \n15. Media \n16. Physics \n17. Social Science Research \n18. Software Engineering!!! (I have no idea why someone would not pick this) ");
        
        System.out.println("\nPick a number that indicates your major: ");
        
        Scanner grade_level_scan = new Scanner(System.in); 
        
        boolean still_deciding = true; 

        while (still_deciding)
        {
            int major = grade_level_scan.nextInt(); 

            // Uses at least one relational operator (==, !=, >, <, >=, <=) (SAYS USES AT LEAST ONE OF THESE RELATIONAL OPERATORS, NOT EACH OR ALL! WE USED THE RELATIONAL OPERATORS ---> (>, <, ==, >=, <=) (see the other classes)))
            if (major > 18 || major < 1)
            {
                System.out.println("\nHey! Stop trying to be smart. Follow the darn rules!! 😭😭😭 \nPick a new number that is actually in the range this time: ");
            }
        
            else if (major == 18) 
            {
              System.out.println("\nCongratulations on making it into the Software Engineering major! It is the best one! Nobody here touches grass tho :(");
              still_deciding = false;
            }    
                
            else
            {
               System.out.println("\nSadly, you didn't get into the major of your choice as the seats have filled up, but you still fortunate enough to get into one of the best majors - Software Engineering! ༼ つ ◕-◕ ༽つ ");
               still_deciding = false;
            }
        }
        
    }
}