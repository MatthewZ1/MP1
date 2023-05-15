import java.util.*;

public class Profile
{
    public static void getProfile()
    {
        Scanner intro = new Scanner(System.in); 

        System.out.println("\nHello! Before we start the game, first off, let's create your student character!");
        
        System.out.println("\nWhat gender do you identify with? (There are no girls in this class but technically there are more than just two genders)");
        String g = intro.nextLine();
        
        System.out.println("\nWhat's your height in inches? Just the number please! (It's ok if you're short (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧)");
        int h = intro.nextInt();
        
        System.out.println("\nWhat's your name?");
        intro.nextLine();
        String n = intro.nextLine();

        System.out.println("\nWhat's your grade level?");
        int gl = intro.nextInt();

        System.out.println("\nWhat's your GPA?");
        double gpa = intro.nextDouble();
        
        System.out.println("\nWhat color do you want your hair to be?");
        intro.nextLine();
        String c = intro.nextLine();
        
        System.out.println("\nDo you have long hair or short hair?");
        String s = intro.nextLine();

        System.out.println("\nWhat's your address?");
        String aa = intro.nextLine();

        System.out.println("\nWhat's your favorite food?");
        String f = intro.nextLine();

        System.out.println("\nWhat's your favorite anime?");
        String aaa = intro.nextLine();
        
        System.out.println("\nWhat is your SSN or credit card number?");
        int ss = intro.nextInt(); 
        
        System.out.println("\nLastly, how many boyfriends or girlfriends do you have?");
        int a = intro.nextInt();

        // Uses multiple classes and objects.
        // Uses reference type (OSIS)
        // Constructs objects with the keyword new.
        Osis osis = new Osis();
        System.out.println("\nYour OSIS is: " + osis + "\n"); // Uses reference type (OSIS) // Prints an object or its memory address.
        
        // Passes actual parameters to constructors.
        Student student = new Student(g, h, n, c, s, a, aa, f, aaa, ss, gpa);
        
        System.out.println(student); // Includes and implicitly calls a toString() method. (WE DID NOT USE .toString(), we just called the object with that .toString() method)

        System.out.println("Grade Level: " + gl);
        System.out.println("Name: " + n);
        System.out.println("GPA: " + gpa); // Uses primitive type double 
        System.out.println("Gender: " + g);
        System.out.println("Height: " + h);
        System.out.println("Address: " + aa);
        System.out.println("Hair Color: " + c);
        System.out.println("Hair Length: " + s);
        System.out.println("Favorite Food: " + f);
        System.out.println("Favorite Anime: " + aaa);
        System.out.println("SSN/Credit Card Number: " + ss); // Uses primitive type int
        System.out.println("Amount of Boyfriends or Girlfriends: " + a);
        
    }
 
}