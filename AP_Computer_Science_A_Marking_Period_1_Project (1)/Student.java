public class Student 
{
  // Uses primitive types 
  private String gender; 
  private int height;
  private String name;
  private String hairSize;
  private String hairColor; 
  private int amount;
  private String address; 
  private String food;
  private final int gradeLevel = 11; //Uses Final variable 
  private String anime; 
  private int number; // Uses primitive type int
  private double gradeAverage; // Uses primitive type double 

// Uses Constructors with Formal Parameters 
  public Student(String g, int h, String n, String c, String s, int a, String aa, String f, String aaa, int ss, double gpa)
  {
    gender = g;
    height = h;
    name = n;
    hairColor = c;   
    hairSize = s;
    amount = a;
    address = aa;  
    food = f; 
    anime = aaa;
    number = ss; 
    gradeAverage = gpa; 
    
  }

// Overloads constructors.
  public Student()
  {
    gender = "Male";
    height = 2;
    name = "Joe Biden";
    hairColor = "White";   
    hairSize = "Short";
    amount = 0;
    address = "The White House";  
    food = "Sushi"; 
    anime = "Spy x Family";
    number = 69420; 
    gradeAverage = 104.1; 
  }

  public String toString()
  {
    return "Student Profile Created - ";
  }

  public Student (int y)
  {
    height = y;
  }
  
  public Boolean equals (Student other) 
  {
    return height == other.height; 
  }
}