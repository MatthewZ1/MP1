import java.util.Scanner;

public class Question{
  private int periods; //add as people add classes to cap at 10
    
  Scanner myObj = new Scanner(System.in);

  
  //ELA
  public static void regentsEla(int i)
  {
    int index = i;
    String[] regentsEla = {"Who is the most famous English writer? (Capitalization Matters)", "What is one of Shakespere's works that features two star-crossed lovers dying? (Capitalization Matters)", "Is it true that Macbeth was written by Harry Potter?"};
    System.out.println(regentsEla[index]);
  }
    
  public static void regentsElaResponse(String response, int i, Points other)
  {
    int index = i;
    String[] elaAnswers = {"William Shakespeare", "Romeo and Juliet", "No"};
    if (response.equals(elaAnswers[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + elaAnswers[index] + "!!");
  }  
// ----------------------------------------------------------------------- 
  public static void APLang(int i)
  {
    int index = i;
    String[] apLangQ = {"What is the most used word of all time?", "What does the white dove symbolize?", "What is a sea creature with eight legs?"};
    System.out.println(apLangQ[index]);
  }
  public static void APLangResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apLangA = {"the", "peace", "octopus"};
    if (response.equals(apLangA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apLangA[index] + "!!");
  }  
// ----------------------------------------------------------------------- 

  //MATH
  public static void APCalc(int i)
  {
    int index = i;
    String[] apCalcABQ = {"What is the derivative of 5x + 10?", "What is the derivative of 100x + 1100?", "What is the derivative of 1000x + 10?"};
    System.out.println(apCalcABQ[index]);
  }
  public static void APClacResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apCalcABA = {"5", "100", "1000"};
    if (response.equals(apCalcABA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apCalcABA[index] + "!!");
  }  
  // ----------------------------------------------------------------------- 

  public static void APStats(int i)
  {
    int index = i;
    String[] apStatsQ = {"Is it true that OSIS # is ordinal data?", "What does SRS stand for? (Type in lowercase)", "What does mean and median measure in a distribution? (Type in lowercase)"};
    System.out.println(apStatsQ[index]);
  }
  public static void APStatsResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apStatsA = {"No", "simple random sample", "center"};
    if (response.equals(apStatsA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apStatsA[index] + "!!");
  }
    // ----------------------------------------------------------------------- 

  public static void PreCalc(int i)
  {
    int index = i;
    String[] preCalcQ = {"If the function of f(x) = x + 2, what is f(2)?", "If the function of f(x) = x^2 + 5^2, what is f(2)?", "If the function of f(x) = (x+1)/(x+1), what is f(-1)?"};
    System.out.println(preCalcQ[index]);
  }
  public static void PreCalcResponse(String response, int i, Points other)
  {
    int index = i;
    String[] preCalcA = {"4", "29", "undefined"};
    if (response.equals(preCalcA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + preCalcA[index] + "!!");
  }
// ----------------------------------------------------------------------- 

  public static void Alg2(int i)
  {
    int index = i;
    String[] alg2Q = {"What is sin(90°)?", "what is log(100)?", "Solve for x. 5x-80 = 420"};
    System.out.println(alg2Q[index]);
  }
  public static void Alg2Response(String response, int i, Points other)
  {
    int index = i;
    String[] alg2A = {"1", "10", "100"};
    if (response.equals(alg2A[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + alg2A[index] + "!!");
  }
// ----------------------------------------------------------------------- 

  //SS
  public static void RegentsUS(int i)
  {
    int index = i;
    String[] usHistoryQ = {"What year was the Declaration of Independence signed?", "How many colonies were their originally?", "What was the largest empire in history? (EX: The Holmer Empire)"};
    System.out.println(usHistoryQ[index]);
  }
  public static void RegentsUSResponse(String response, int i, Points other)
  {
    int index = i;
    String[] usHistoryA = {"1776", "13", "The Mongol Empire"};
    if (response.equals(usHistoryA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + usHistoryA[index] + "!!");
  }
// ----------------------------------------------------------------------- 

  public static void APUSH(int i)
  {
    int index = i;
    String[] apUShQ = {"How many Celtic languages are still spoken today?", "What year did the Mexican Revolution start?", "Who was the first ruler of the Mongol Empire?"};
    System.out.println(apUShQ[index]);
  }
  public static void APUSHResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apUShA = {"6", "1910", "Genghis Khan"};
    if (response.equals(apUShA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apUShA[index] + "!!");
  }
// ----------------------------------------------------------------------- 
  public static void APGOV(int i)
  {
    int index = i;
    String[] apGovQ = {"Who is the first president of the US?", "How many years is each presidential term?", "Which branch is the Senate in?"};
    System.out.println(apGovQ[index]);
  }
  public static void APGOVResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apGovA = {"George Washington", "4", "legislative"};
    if (response.equals(apGovA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apGovA[index] + "!!");
  }
//----------------------------------------------------------------------- 

  public static void APMacro(int i)
  {
    int index = i;
    String[] apMacroQ = {"Whose GDP is higher? Russia or USA?", "If a product starts out at $1 and then inflates 10 cents, what is the new cost? (Enter number - EX: 2.09)", "Whose GDP is higher? Brazil or Canada?"};
    System.out.println(apMacroQ[index]);
  }
  public static void APMacroResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apMacroA = {"USA", "1.10", "Brazil"};
    if (response.equals(apMacroA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apMacroA[index] + "!!");
  }
// ----------------------------------------------------------------------- 

  //SCIENCE
  public static void APChem(int i)
  {
    int index = i;
    String[] apChemQ = {"Can you light diamond on fire?", "The symbol Sb stands for stibnum or stibnite. What is the modern name of this element?", "What is the most abundant protein in the human body?"};
    System.out.println(apChemQ[index]);
  }
  public static void APChemResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apChemA = {"Yes", "antimony", "collagen"};
    if (response.equals(apChemA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apChemA[index] + "!!");
  }
//----------------------------------------------------------------------- 

  public static void APEnv(int i)
  {
    int index = i;
    String[] apEnvQ = {"Plants and trees release oxygen into the air. (True OR False)", "Animals that only eats plants are called?", "What is the leading cause in animal deaths?"};
    System.out.println(apEnvQ[index]);
  }
  public static void APEnvResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apEnvA = {"True", "herbivores", "predation"};
    if (response.equals(apEnvA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apEnvA[index] + "!!");
  }

// ----------------------------------------------------------------------- 

  public static void APBio(int i)
  {
    int index = i;
    String[] apBioQ = {"What is known as the powerhouse of the cell?", "What is the largest organ?", "The synthesis of protein or carbohydrate polymers always produces which of the following as a byproduct?"};
    System.out.println(apBioQ[index]);
  }
  public static void APBioResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apBioA = {"mitochondria", "skin", "water"};
    if (response.equals(apBioA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apBioA[index] + "!!");
  }

// ----------------------------------------------------------------------- 

  public static void APPhysics(int i)
  {
    int index = i;
    String[] apPhysicsQ = {"What is the horizontal acceleration of projectiles?", "How much work is the work done on an object moving in a circle?", "A person who weighs 800 N steps onto a scale that is on the floor of an elevator car. If the elevator accelerates upward at a rate of 5 m/s^2, what will the scale read? (NO UNITS)"};
    System.out.println(apPhysicsQ[index]);
  }
  public static void APPhysicsResponse(String response, int i, Points other)
  {
    int index = i;
    String[] apPhysicsA = {"0", "0", "1200"};
    if (response.equals(apPhysicsA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apPhysicsA[index] + "!!");
  }
// ----------------------------------------------------------------------- 

  public static void RegentsPhysics(int i)
  {
    int index = i;
    String[] regPhysicsQ = {"What value is gravity to the nearest hundredth? (without units)", "Do vectors tell the direction of motion?", "A car travels at 3m/s. How far does it travel in 10 seconds? (No need for units!!)"};
    System.out.println(regPhysicsQ[index]);
  }

  public static void RegentsPhysicsResponse(String response, int i, Points other)
  {
    int index = i;
    String[] regPhysicsA = {"9.81", "Yes", "30"};
    if (response.equals(regPhysicsA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + regPhysicsA[index] + "!!");
  }

// ----------------------------------------------------------------------- 

  public static void APCSA(int i)
  {
    int index = i;
    String[] apCSAQ = {"Can you store an integer inside a double?", "Can a void method print a statement?", "How many bits make a double?", "What value does Integer.MAX_VALUE print?", "What does int y = (int)(x + 0.5) output if x was initialized to 6.7?", "What does s.substring(5,8) print if s has been intialized as 'Mr. Holmer'?"};
    System.out.println(apCSAQ[index]);
  }
  public static void APCSAResponse(String response, int i, Points other)
  {
    Integer index = new Integer(i); // Uses at least one wrapper class.
    double x = 6.7;
    String y = String.valueOf((int)(x + 0.5)); // Rounds to the nearest integer. and Truncates a double 
    String integerAnswer = String.valueOf(Integer.MAX_VALUE); // Avoids integer overflow since we didn't +1 here. // Uses Integer.MIN_VALUE or Integer.MAX_VALUE.
    String s = "Mr. Holmer";
    String olm = s.substring(5,8);
    String[] apCSAA = {"Yes", "Yes", "64", integerAnswer, y, olm};
    if (response.equals(apCSAA[index]))
    {
      System.out.println("\nYou got it!");
      other.addPoints(10);  
      other.getPoints(); 
    }
    else
    {
      System.out.println("\nSorry, that is incorrect!");
      other.subtractPoints(10); 
      other.getPoints(); 
    }  
    System.out.println("The answer is " + apCSAA[index] + "!!");
  }
}