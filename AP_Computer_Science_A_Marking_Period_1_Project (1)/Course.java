public class Course
{
  private String elaClass;
  private String mathClass;
  private String ssClass;
  private String scienceClass; 
  private int periods;

  // Classes that are allowed for Junior Year
  String[] ssClasses = {"AP Macroeconomics", "AP US History", "Regents US History", "AP Government"}; // Social Studies Courses
  String[] elaClasses = {"AP English Language and Composition", "Regents ELA"}; // English Courses
  String[] mathClasses = {"AP Calculus AB", "AP Statistics", "Algebra 2", "Pre-Calculus"}; // Math Courses
  String[] scienceClasses = {"AP Biology", "AP Physics", "Regents Physics", "AP Chemistry", "AP Environmental Sciences"}; // Science Courses
  String[] computerClasses = {"AP Computer Science A"}; 
    
  public Course()
  {
    elaClass = "Regents ELA";
    mathClass = "Pre-Calc";
    ssClass = "US History";
    scienceClass = "AP CSA"; 
  }
    
  public Course(String e, String m, String ss, String s)
  {
    elaClass = e;
    mathClass = m;
    ssClass = ss;
    scienceClass = s; 
  }

  public static String ela(String course)
  {     
     return "\nCongratulations, the English course you will have is " + course + ".\n";
  }
  public static String math(String course)
  {
    return "\nCongratulations, the Math course you will have is " + course + ".\n";
  }
  public static String ss(String course)
  {
    return "\nCongratulations, the Social Studies course you will have is " + course + ".\n";
  }
  public static String science(String course)
  {
    return "\nCongratulations, the Science course you will have is " + course + ".\n";
  }  
} 