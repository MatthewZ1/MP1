import java.util.*; 

public class CourseSelection
{
  
    public static void getCourse()
    {
      Scanner course_scan = new Scanner(System.in);

     // Throws no NullPointerException without catching.
      try 
      {
          String null_x = null;
          System.out.println(null_x.length());
      }

      catch (Exception e)
      {
           System.out.println("\nTech is Tech, and they forgot to give you your schedules the entire summer... and you're now getting it the day before school ;-;"); 
      }
        
      System.out.println("\nSince you got into the best major, software major, you get to choose if you want to get an apprenticeship! (Y or N): °˖✧◝(⁰▿⁰)◜✧˖°");

      String apprenticeship = course_scan.nextLine(); 
    
      if (apprenticeship.equals("Y"))
      {
        Clear clear = new Clear();
        System.out.println("\nSince you are taking an apprenticeship, the maximum amount of class periods you can have is 6!"); 
        System.out.println("\nWell, which company would you like to work at? ٩(◕‿◕｡)۶");
        System.out.println("\nCompanies:\n");
        System.out.println("Amazon");
        System.out.println("JP Morgan Chase");
        System.out.println("Mastercard");
        System.out.println("Accenture");
        System.out.println("Citi Bank");
        System.out.println("");
        String company = course_scan.nextLine();
        System.out.println(""); 
          
        if (company.equals("Amazon") || company.equals("amazon")) 
        {
          System.out.println("Congratulations! You are going to start 10/27/2022 \n\n\n\n\n.....Wait...\nAmazon ditched you last minute!!! You are going to start 1/31/2023! Have fun!! ヽ(o♡o)/");
        }
            
        else 
        {
          System.out.println("Unfortunately you did not pass the interview because the WIFI cut out half way through! You were doing so well, so Amazon will take you instead. ٩(⊙‿⊙)۶");
        }
          
        System.out.println("\nGood news! Since, you are going to be an apprentice, you do not need to take a language or science course!");
        System.out.println("\nFor the following school year, you're gonna have to choose your courses. What are you interested in?\n");
        // we gotta make some objects from other classes
        System.out.println("English Courses:");
        System.out.println("AP English Language and Composition");
        System.out.println("Regents ELA"); 
        System.out.println("\nWhat English class would you like to take?\n"); 
          
        String courseE = course_scan.nextLine();
        System.out.println(Course.ela(courseE));
        System.out.println("Math Courses:");
        System.out.println("AP Calculus AB");
        System.out.println("AP Statistics");
        System.out.println("Precalculus");
        System.out.println("Algebra 2");
        System.out.println("\nWhat Math class would you like to take?\n"); 
        String courseM = course_scan.nextLine();
        System.out.println(Course.math(courseM));
        
        System.out.println("Social Studies:");
        System.out.println("AP US History");
        System.out.println("AP Macroeconomics");
        System.out.println("AP Government");
        System.out.println("Regents US History");
        System.out.println("\nWhat Social Studies class would you like to take?\n"); 
          
        String courseSS = course_scan.nextLine();
        System.out.println(Course.ss(courseSS));

        System.out.println("You are already confirmed for AP CSA as one of your classes as that is part of your major. (*＾▽＾)／");
        
        clear.clearScreen();
        
        Points point = new Points(100);

        FirstDay.getFirstDay(point);
        
        //ELA Course Selection
        if (courseE.equals("Regents ELA")) 
        {
          FirstDay.bensingClassQ();
          FirstDay.bensingClassA(point);
          FirstDay.BensingSummerHWQ();
          String response1 = course_scan.nextLine();
          FirstDay.BensingSummerHWA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.regentsEla(index);
          String r = course_scan.nextLine();
          Question.regentsElaResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseE.equals("AP English Language and Composition"))
        {
          FirstDay.bensingClassQ();
          FirstDay.bensingClassA(point);
          FirstDay.BensingSummerHWQ();
          String response1 = course_scan.nextLine();
          FirstDay.BensingSummerHWA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APLang(index);
          String r = course_scan.nextLine();
          Question.APLangResponse(r, index, point);
          clear.clearScreen();
        }
            
        else
        {
          System.out.println("You typed in the course wrong.");
          clear.clearScreen();
        }

        // Math Courses
        if (courseM.equals("AP Calculus AB")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.APCalc(index);
          String r = course_scan.nextLine();
          Question.APClacResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseM.equals("AP Statistics")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.APStats(index);
          String r = course_scan.nextLine();
          Question.APStatsResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseM.equals("Precalculus")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.PreCalc(index);
          String r = course_scan.nextLine();
          Question.PreCalcResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseM.equals("Algebra 2")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.Alg2(index);
          String r = course_scan.nextLine();
          Question.Alg2Response(r, index, point);
          clear.clearScreen();
        }
            
        else
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          System.out.println("You typed in the course wrong.");
          clear.clearScreen();
        }

        // Social Studies Course
        if (courseSS.equals("AP US History")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APUSH(index);
          String r = course_scan.nextLine();
          Question.APUSHResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseSS.equals("AP Macroeconomics")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APMacro(index);
          String r = course_scan.nextLine();
          Question.APMacroResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseSS.equals("AP Government")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APGOV(index);
          String r = course_scan.nextLine();
          Question.APGOVResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseSS.equals("Regents US History")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.RegentsUS(index);
          String r = course_scan.nextLine();
          Question.RegentsUSResponse(r, index, point);
          clear.clearScreen();
        }
            
        else
        {
          System.out.println("You typed in the course wrong.");
        }

        // CSA Course
        FirstDay.holmerQ1();
        String response1 = course_scan.nextLine(); 
        FirstDay.holmerA1(point, response1);
        FirstDay.holmerQ2();
        String response2 = course_scan.nextLine(); 
        FirstDay.holmerA2(point, response2);
        int index = (int) (Math.random() * (5));
        Question.APCSA(index);
        String r = course_scan.nextLine();
        Question.APCSAResponse(r, index, point);
        clear.clearScreen();
        
        FirstDay.clubFair();
        String responseClub = course_scan.nextLine();
        FirstDay.clubFairIncident(point, responseClub);
        clear.clearScreen();
        FirstDay.farewell(point);
      }

      else
      {
        Clear clear = new Clear();
        System.out.println("\nSince you didn't choose the apprenticeship, you will have a regular junior year! (/^▽^)/");
        System.out.println("\nFor the following school year, you're gonna have to choose your courses. What are you interested in? \n");
        System.out.println("\nEnglish Courses: 〔´∇｀〕");
        System.out.println("AP English Language and Composition");
        System.out.println("Regents ELA"); 
        System.out.println("What English class would you like to take?\n"); 
        String courseE = course_scan.nextLine();
        System.out.println(Course.ela(courseE));
        
        System.out.println("\nMath Courses: 」(￣▽￣」)");
        System.out.println("AP Calc AB");
        System.out.println("AP Statistics");
        System.out.println("Precalculus");
        System.out.println("Algebra 2");
        System.out.println("What Math class would you like to take?\n"); 
        String courseM = course_scan.nextLine();
        System.out.println(Course.math(courseM));
        
        System.out.println("Social Studies: ﾍ(=￣∇￣)ﾉ");
        System.out.println("AP US History");
        System.out.println("AP Macroeconomics");
        System.out.println("AP Government");
        System.out.println("Regents US History");
        System.out.println("What Social Studies class would you like to take?\n"); 
        String courseSS = course_scan.nextLine();
        System.out.println(Course.ss(courseSS));
        
        System.out.println("Science Class: (￣▽￣)ノ");
        System.out.println("AP Biology");
        System.out.println("AP Chemistry");
        System.out.println("AP Physics");
        System.out.println("AP Enviornmental Science");
        System.out.println("Regents Physics");
        System.out.println("None");
        System.out.println("What Science class would you like to take?\n"); 
        String courseS = course_scan.nextLine();
        System.out.println(Course.science(courseS));
        
        System.out.println("You are already confirmed for AP CSA as one of your classes as that is part of your major.");

        Points point = new Points(100);
        
        FirstDay.getFirstDay(point);
        
        //ELA Course Selsection
        if (courseE.equals("Regents ELA")) 
        {
          FirstDay.bensingClassQ();
          FirstDay.bensingClassA(point);
          FirstDay.BensingSummerHWQ();
          String response1 = course_scan.nextLine();
          FirstDay.BensingSummerHWA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.regentsEla(index);
          String r = course_scan.nextLine();
          Question.regentsElaResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseE.equals("AP English Language and Composition"))
        {
          FirstDay.bensingClassQ();
          FirstDay.bensingClassA(point);
          FirstDay.BensingSummerHWQ();
          String response1 = course_scan.nextLine();
          FirstDay.BensingSummerHWA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APLang(index);
          String r = course_scan.nextLine();
          Question.APLangResponse(r, index, point);
          clear.clearScreen();
        }
            
        else
        {
          System.out.println("You typed in the course wrong.");
          clear.clearScreen();
        }
          
        // Math Courses
        if (courseM.equals("AP Calculus AB")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.APCalc(index);
          String r = course_scan.nextLine();
          Question.APClacResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseM.equals("AP Statistics")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.APStats(index);
          String r = course_scan.nextLine();
          Question.APStatsResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseM.equals("Precalculus")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.PreCalc(index);
          String r = course_scan.nextLine();
          Question.PreCalcResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseM.equals("Algebra 2")) 
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          FirstDay.shahClassQ();
          String response2 = course_scan.nextLine(); 
          FirstDay.shahClassA(point, response2);
          int index = (int) (Math.random() * (3));
          Question.Alg2(index);
          String r = course_scan.nextLine();
          Question.Alg2Response(r, index, point);
          clear.clearScreen();
        }
            
        else
        {
          FirstDay.hitJasonQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.hitJasonA(point, response1);
          System.out.println("You typed in the course wrong.");
          clear.clearScreen();
        }

        // Social Studies Course
        if (courseSS.equals("AP US History")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APUSH(index);
          String r = course_scan.nextLine();
          Question.APUSHResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseSS.equals("AP Macroeconomics")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APMacro(index);
          String r = course_scan.nextLine();
          Question.APMacroResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseSS.equals("AP Government")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.APGOV(index);
          String r = course_scan.nextLine();
          Question.APGOVResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseSS.equals("Regents US History")) 
        {
          FirstDay.kleinerClassQ();
          String response1 = course_scan.nextLine(); 
          FirstDay.kleinerClassA(point, response1);
          int index = (int) (Math.random() * (3));
          Question.RegentsUS(index);
          String r = course_scan.nextLine();
          Question.RegentsUSResponse(r, index, point);
          clear.clearScreen();
        }

        // Science Courses
        if (courseS.equals("AP Chemistry")) 
        {
          int index = (int) (Math.random() * (3));
          Question.APChem(index);
          String r = course_scan.nextLine();
          Question.APChemResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseS.equals("AP Enviornmental Science")) 
        {
          int index = (int) (Math.random() * (3));
          Question.APEnv(index);
          String r = course_scan.nextLine();
          Question.APEnvResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseS.equals("AP Biology")) 
        {
          int index = (int) (Math.random() * (3));
          Question.APBio(index);
          String r = course_scan.nextLine();
          Question.APBioResponse(r, index, point);
          clear.clearScreen();
        }
            
        else if (courseS.equals("AP Physics")) 
        {
          int index = (int) (Math.random() * (3));
          Question.APPhysics(index);
          String r = course_scan.nextLine();
          Question.APPhysicsResponse(r, index, point);
          clear.clearScreen();
        }
        else if (courseS.equals("Regents Physics")) 
        {
          System.out.println("\nHave you taken regents physics yet?");
          String tookRegents = course_scan.nextLine();
          if (tookRegents.equals("No")) 
          {
            int index = (int) (Math.random() * (3));
            Question.RegentsPhysics(index);
            String r = course_scan.nextLine();
            Question.RegentsPhysicsResponse(r, index, point);
            clear.clearScreen();
          }
          System.out.println("Hey! Hey! You cannot retake this course!");
        }
        else if (courseS.equals("None"))
        {
          System.out.println("\nHave you taken regents physics yet? (Yes/No)");
          String tookRegents = course_scan.nextLine();
          if (tookRegents.equals("No"))
          {
            System.out.println("Well sorry, you have to take this course ;-;");
            int index = (int) (Math.random() * (3));
            Question.RegentsPhysics(index);
            String r = course_scan.nextLine();
            Question.RegentsPhysicsResponse(r, index, point);
            clear.clearScreen();
          }
        }
        else
        {
          System.out.println("You typed in the course wrong.");
          clear.clearScreen();
        }

        // CSA Course 
        FirstDay.holmerQ1();
        String response1 = course_scan.nextLine(); 
        FirstDay.holmerA1(point, response1);
        FirstDay.holmerQ2();
        String response2 = course_scan.nextLine(); 
        FirstDay.holmerA2(point, response2);
        int index = (int) (Math.random() * (5));
        Question.APCSA(index);
        String r = course_scan.nextLine();
        Question.APCSAResponse(r, index, point);
        clear.clearScreen();
        
        FirstDay.clubFair();
        String responseClub = course_scan.nextLine();
        FirstDay.clubFairIncident(point, responseClub);
        clear.clearScreen();
        FirstDay.farewell(point);
      }
   }    
}