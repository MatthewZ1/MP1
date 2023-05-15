import java.util.*; 
  
public class FirstDay 
{
    Clear clear = new Clear();
    
    public static void getFirstDay(Points points)
    {
        Scanner scan = new Scanner(System.in);

        int y = 1; 
        y = ((((y + 1 - 1) * 1) / 1) % 2); // Uses at least one arithmetic operation (+, -, *, /, %). and Uses compound operator expressions.

        System.out.println("\nHEY!" + " Good morning!" + " I hope you're ready for the " + y + "st day of school! ♪☆＼(^０^＼) ♪(／^-^)／☆♪"); // Concatenates strings. // Concatenates strings and primitives. (y is an int) (string + int)
        
        System.out.println("\nHow many hours of sleep did you get last night?"); 
        int response = scan.nextInt();  
        
        if (response > 12)
        {
            System.out.println("\nWOAH YOU ARE SLEEPING WAY TOO MUCH! /n You lose 5 points!");
            // Uses compound assignment operators (+=, −=, *=, /=, %=) 
            double z = 0;
            z += 6;
            z -= 5;
            z *= 5; 
            z /= 1;
            z %= 10;

            // Uses the the increment operator (++) and decrement operator (−−)
            z++;
            z--;

            // Uses casting operators.
            // Truncates a double.
            int xy = (int) z;
            double xyz = (double) xy;
            int wxyz = (int) xyz;
            
            points.subtractPoints(wxyz);
            points.getPoints();
        }

        // Uses at least one logical operator (!, &&, ||) (SAYS USES AT LEAST ONE, NOT EACH/ALL) (WE USED && here)
        else if (response >= 8 && response <= 12)
        {
            System.out.println("Perfect! A recommended teenager's hours are 8! \n You gained 10 points!");
            points.addPoints(10);
            points.getPoints();
        }

        // Uses else statements.
        else 
        {
            System.out.println("\nYou need to sleep earlier! \nYou now gain an extra white piece of hair in the back and you lose 10 points （＞人＜；）≧ ﹏ ≦!");
            points.subtractPoints(10);
            points.getPoints();
        }

        // Throws no ArithmeticException without catching.
        try 
        {
            System.out.println(0/0);
        }

        catch (Exception e)
        {
            System.out.println("\nLET THE SIMULATION BEGIN o(*^＠^*)o!\n");
        }
        
  
        int x = (int)(Math.random() * 4 + 1); // Arithmetic Operation // Uses at least one Math method: abs, pow, sqrt, random (SAYS TO USE AT LEAST ONE METHOD, NOT EACH! WE USED THE MATH METHOD .random())


        // Uses at least one logical operator (!, &&, ||) (SAYS USES AT LEAST ONE, NOT EACH/ALL) (WE USED || here)
        if (x == 1 || x == 2 || x == 3 || x == 4)
        {
            System.out.println("You overslept! It's 7:50 AM and you're going to be late to school (ಥ﹏ಥ)."); 
            System.out.println("\nWhat do you do? (Enter 1-4) ");
            System.out.println("1. Forget about it and continue to sleep. You got next year anyways right (～￣▽￣)～ ???!");
            System.out.println("2. Go to school as fast as you can and pray that your teachers won't beat you up for the tardiness (✿◡‿◡).");
            System.out.println("3. Tell your Mom to get the car up and running so you make it to school faster (´。＿。｀) .");
            System.out.println("4. Take your time. Make breakfast. Go get Starbucks. Eat McDonalds and then go to school o(*￣▽￣*)ブ .\n");
            
            int res = scan.nextInt();
            
            if (res == 2 || res == 3)
            {
              System.out.println("\nCorrect! You made a great choice! Better a bit late than TOO late ( •̀ ω •́ )✧ !");
              System.out.println("\nYou gain 5 points!");
              points.addPoints(5);
              points.getPoints();
              System.out.println("You arrived to your first class on time!");
            }
                
            else if (res == 1 || res == 4)
            {
              System.out.println("\nWrong! You made a terrible choice! It is always better to be 5 minutes late than like 2 hours late ヽ(*。>Д<)o゜!");
              System.out.println("\nYou lose 5 points!");
              points.subtractPoints(5);
              points.getPoints();
              System.out.println("\nAs you hurried to school, security got really angry because they just closed the doors, and you showed up last minute, begging to enter. They berated you until you were on the verge of tears .·´¯`(>▂<)´¯`·. .");
            }

        System.out.println("\nAfter you got berated and sucked up your tears, you went to take elevator A to go to the 5th floor for your English class. HOWEVER, upon entering the elevator doors, you saw that inside the elevator, it was packed with kids and there was only one more spot available. It is between you and this girl that has a broken leg and arm in a wheelchair with one eye missing. ☜(`o´)"); 
                
        System.out.println("\n Pick a choice (Enter 1 or 2): \n\n1. The girl gets to go on the elevator and you will be VERY late and have to walk up the stairs ⊙﹏⊙∥. \n\n2. Push the girl's wheelchair so you can get on and be a little bit late. \nRemember (Your English teacher)  \"may\" tolerate some minutes late but not more than 5 minutes late!");
                
        int elevatorRes = scan.nextInt();
  
        if (elevatorRes == 1)
        {
            System.out.println("\nGood Job! It is your job to ensure that girl receives the proper treatement even if the decision will impact you negatively （￣︶￣）↗　 .");
            System.out.println("You gain 25 points!");
            points.addPoints(25);
            points.getPoints();
        }
  
        else if (elevatorRes == 2)
        {
            System.out.println("");
            System.out.println("\nA dean saw what you did, pulled you out of the elevator, and allowed the girl back into the elevator.");
            System.out.println(""); 
            System.out.println("\nDean: ARE YOU CRAZY? Why would you push the disabled person's wheelchair away! I am going to have to speak to your parents later... I don't care how late you will be but you should never get on the elevator before the wheelchair person ⊙﹏⊙∥ (╯▔皿▔)╯!!!! ");
            System.out.println("\nYou lose 45 points!");
            points.subtractPoints(45);
            points.getPoints();
        }
                
        System.out.println("\nTeacher: You're late! What is your excuse (Enter 1-3)? \n\n1. It's a honest first day mistake. \n2. My dog ate my shoe. \n3. *Start crying and beg for mercy* .·´¯`(>▂<)´¯`·. ");
            
        int lateRes = scan.nextInt(); 
            
        if (lateRes == 1)
        {
            System.out.println("\nYour teacher accepts your excuse and tells you to sit down .");
            System.out.println("\nYou gain 10 points! Be honest is better than lying!");
            points.addPoints(10);
            points.getPoints();
        }
              
        else if (lateRes == 2)
        {
            System.out.println("\nYou get sent to the deans office for trying to lie to the teacher.");
            System.out.println("\nYou lose 10 points! Don't ever lie with very few exceptions of course!");
            points.subtractPoints(10);
            points.getPoints(); 
            System.out.println("\nAfterwards, you go back to class with everybody staring at you. Good job on your first period. ಥ_ಥ");
        }
              
        else if (lateRes == 3)
        {
            System.out.println("\nYour teacher takes pity on you and tells you to sit down. You didn't get yelled at, but at the cost of your dignity (´。＿。｀) .");
            System.out.println("\nYou get no points! You might have not been yelled at but you lost your dignity! It balances out.");
            points.getPoints();
        }
    }
} 
    
    public static void bensingClassQ()
    {
        System.out.println("\nHello Class! I'm Ms. Bensing... and uh... this is your English Class!");
        System.out.println("");
        System.out.println("I know that I'm supposed to be teaching lanuage and composition to you guys... but no...");
        System.out.println("Does any of you guys... uh... want to guess what we will be doing the whole year? (Press A-D)");
        System.out.println("\n\nA) Going through the cirriculum like a regular class \n\nB) Try not to fall asleep in her class ￣へ￣ \n\nC) Write essays about fruits and read the news. \n\nD) Learn how to improve your writing skills. ");
    }
        
    public static void bensingClassA(Points other)
    {
        Scanner scan = new Scanner(System.in);
        
        String guess = scan.nextLine();
        
        if (guess.equals("A"))
        {
            System.out.println("\nHaha! You're funny! For the whole year, you work on random assignments to her preference and read the news every Friday. It's so relevant to the class (totally) ＞﹏＜.");
              System.out.println("\nSince you didn't expect her class to be this bad, you slacked off and didn't prepare for the final exam in May. Now you're screwed."); 
              System.out.println("You lost 10 points... maybe more in the future if you don't study.");
              other.subtractPoints(10);    
        } 
            
        else if (guess.equals("B"))
        {
              System.out.println("\nYou need to get more sleep! It's only the first period ￣へ￣!");
              System.out.println("You lost 5 points!"); 
              other.subtractPoints(5);
        }  
            
        else if (guess.equals("C"))
        {
              System.out.println("\nYou guessed correct! Though... expecting how the course won't really help you much! Start studying for the final exam or else!");
              System.out.println("\n A) Will you start studying for the exam? \n B) Or will you procrastinate?");
              String responseEla = scan.nextLine();
              if (responseEla.equals("A"))
              {
                System.out.println("Such a good kid studying for their exams early. You get 1 brownie point :D");
                other.addPoints(1); 
              }
              else if (responseEla.equals("B"))
              {
                System.out.println("You done a great job embodying a typical Techie. Though... cramming an exam is not good... ༼ つ ◕_◕ ༽つ");
                System.out.println("You lose 5 points!");
                other.subtractPoints(5);
              }
        }                
            
        else if (guess.equals("D"))
        {
              System.out.println("\nShe assures you that you will be fine in her class... but you realized later that you learned nothing from her class. (●'◡'●)");
              System.out.println("You lost 10 points... maybe more in the future if you don't study.");
              other.subtractPoints(10);
        }
        
        else 
        {
              System.out.println("\nTrying to be in smart and cut her class? She found out and gave you detention ⊙﹏⊙∥!");
              System.out.println("You lost 20 points!");
              other.subtractPoints(20); 
        }
     }
          
    public static void BensingSummerHWQ()
    {
        System.out.println("\nSo, the first thing I need from you is your Summer Reading assignment.");
        System.out.println("\nYou did your assignment, but you didn't expect her to collect it in paper. What do you do?");
        System.out.println("\nA) Tell her you didn't do it and will submit it tomorrow. \nB) Tell her you submitted the assignment online, but if you can print the assignment next period and handed in to her then.");
    }
        
    public static void BensingSummerHWA(Points other, String r)
    {
        String responseEla2 = r; 
        if (responseEla2.equals("A"))
        {
            System.out.println("\nShe glares at you with passionate hatred and cold-heartedly tells you that it doesn't matter. She ignores you and talks to her favorite students (≧﹏ ≦).");
            System.out.println("\nSince you are handing the assignment tomorrow, She deducts 10 points for lateness ╯︿╰.");
            other.subtractPoints(10);
            other.getPoints();
            System.out.println("\n Ms. Bensing gives you your first question.\n"); 
        }
        
        if (responseEla2.equals("B"))
        {
            System.out.println("\nShe glares at you with passionate hatred and cold-heartedly tells you that it doesn't matter. You tried to explain that your assignment wasn't late (≧﹏ ≦) .");
            System.out.println("\nSince you are giving the assignment to her next period, she deducts 5 points for lateness ╯︿╰.");
            other.subtractPoints(5);
            other.getPoints();
            System.out.println("\n Ms. Bensing gives you your first question.\n"); 
          
        }
                  
        else 
        {
            System.out.println("\nSince you didn't pick an option, you didn't submit your assessment and got a failing grade of 45 ヽ(*。>Д<)o゜."); 
            System.out.println("\nHow did you fail a class on the first day of school?");
            System.out.println("\nYou lost 45 points because you got a 45 on an assignment."); 
            other.subtractPoints(45);  
            other.getPoints();
            System.out.println("\n Ms. Bensing gives you your first question.\n");
        }
    }
  
    public static void BensingSummerHWQ(String hello) // hello = "Hello"
    {
      System.out.println(hello + "This overloads the method :D");
    }
  
    // Math Class   
    public static void shahClassQ()
    {
        System.out.println("Hello Math Class, I'm Mr. Shah... and I will be your math teacher. ");
      
        //Questions for Math Class (inputted here) 
        System.out.println("On our first day, we have to do ice breakers! I want to know you better. Nah, I am just kidding. We're going to dive into the mathematics and physics behind the philosophy of quantum computing and AI along with some distance measured by the Sun to the Earth and how humans work... ⊙﹏⊙∥");
              
        System.out.println("\nYour first question is: What is the second derivative of y = cos(1234x)^912+2934x^823+12x^232-623x^29-cos(5x^9e)?");
        System.out.println("\nMr. Shah: What's your answer? *makes intimidating face*"); 
        System.out.println("\nPick your answer to that!\nA) HUH? Can you answer that yourself Mr. Shah? I don't think so.\nB) May you please repeat the question? I think I might need more help with this....\nC) SCREW YOU! I am leaving this class and going straight to my counselor's office to transfer (►__◄)(σ｀д′)σ !!!!!!\nD) Uhh... Undefined?\n");
    }
      
    public static void shahClassA(Points other, String r) // Includes at least one method with multiple parameters.
    {
        String shahRes = r;
              
        if (shahRes.equals("A") || shahRes.equals("C"))
        {
            System.out.println("\nINCORRECT! You should never ever make an agressive teacher more aggressive! It is better for you to contemplate with them and get to an agreed solution than throw yourself a tantrum o(￣┰￣*)ゞ.");
            System.out.println("You lose 15 points!");
            other.subtractPoints(15);
            other.getPoints();
            System.out.println("\nMr. Shah gives you your first question.\n");
        } 
  
        else if (shahRes.equals("B") || shahRes.equals("D"))
        {
            System.out.println("\nCORRECT! When you don't understand something, it is best practice to ask for help or even at least just try it! This is a life lesson for all of y'all! ");
            System.out.println("You gain 15 points!");
            other.addPoints(15);
            other.getPoints();
            System.out.println("\nMr. Shah gives you your first question.\n");
        }
    }
               
    //History Class with Ms. Kleiner 
    public static void kleinerClassQ()
    {
        System.out.println("\nHey class... I'm Ms. Kleiner, and I will be your history teacher."); 
        System.out.print("\nIt's the first day, and it's your junior year. You need to work hard from day one, so here's 20 pages of reading to do, and 50-short responses to do for homework\n"); 
        System.out.print("\nWhat is your response to that? \nA) I refuse! *proceeds to flip desk over (σ｀д′)σ * \nB) Suck it up and deal with it இ௰இ \nC) Try to start a revolt through chatting with other classmates ╚(•⌂•)╝ \nD) Start chatting with other classmates to make a group chat and help each other with the homework (✿◠‿◠)\n");
        }
    public static void kleinerClassA(Points other, String response)
    {
        String r = response;
        if (r.equals("A") || r.equals("C"))
        {
            System.out.println("\nIt is NEVER ok to resort to violence as an answer. You should deal with this in a rational manner and discuss this through with the teacher to the best of your abilites.");
            System.out.println("\nBecause of this, you lose 15 points");
            other.subtractPoints(15);
            other.getPoints();
        }
            
        else if (r.equals("B"))
        {
            System.out.println("\nWhile this may work now, it will only get worse and you should deal with it at the start instead of struggling in the future.");
            System.out.println("\nYour points are unaffected.");
            other.getPoints();
        }
            
        else if (r.equals("D"))
        {
            System.out.println("\nGood idea! Working with classmates lessens the workload overall and you can ask them for help if needed. It's never too late to ask for help (*^_^*).");
            System.out.println("\nYou earn 15 points!");
            other.addPoints(15);
            other.getPoints();
        }
        
        System.out.println("\nNow let's start this class.");
        //Questions for History Questions(inputted)(check CourseSelection)
    }
          
    //CSA Class with Mr. Holmer 
    public static void holmerQ1() // Includes at least one zero-parameter method.
    {
        System.out.println("\nGood morning guys! Welcome all to your first day of Computer Science A!"); 
        System.out.println("\nI will be your coolest teacher, Mr. Holmer (⌐ ͡■ ͜ʖ ͡■)");
        System.out.println("\nAlright guys! Here's the DO-NOW! Who can tell me the value of a null?");
    }
        
    public static void holmerA1(Points other, String r)
    {   
        String y = r;
        if (y.equals("null"))
        {
            System.out.println("\nGood job!"); 
            System.out.println("Hopefully, you know to add System.out.print() to " + null); // Uses the keyword null.
            System.out.println("Give it up for him/her/they!!!");
            System.out.println("You gain 15 points!");
            other.addPoints(15);
            other.getPoints();
        } 
      else
      {
            System.out.println("What are you doing! You lost 15 points.");
            other.subtractPoints(15);
            other.getPoints();
      }
    }  

    public static void holmerQ2()
    {
        System.out.println("\nOur purpose is to create beauty. But we have to pass the AP Exam in order to create beauty."); 
        System.out.println("\nI don't think this method is the best, but Collegeboard is special this way. Sometime Collegeboard is flawed... but who is it to blame?");
        System.out.println("\nWe have 183 days till the AP Exam! What is the prime factorization of 183?"); 
        System.out.println("\nA. 3 and 7 and 9 \nB. 4 and 8 and 3 \nC. 3 and 61 \nD. 17 and 13");
    }
        
    public static void holmerA2(Points other, String r)
    {   
        String y = r;
        if (y.equals("A"))
        {
            System.out.println("\nThat is a good guess"); 
            System.out.println("However, that is not the answer. The prime factorization of 183 is 3 and 61.\n");
            System.out.println("Wrong! Generally, I don't give penalty because we are learning, but sorry.");
            other.subtractPoints(15);
            other.getPoints();
        }

        else if (y.equals("B"))
        {
            System.out.println("\nThat is a good guess"); 
            System.out.println("However, that is not the answer. The prime factorization of 183 is 3 and 61.\n");
            System.out.println("Wrong! Generally, I don't give penalty because we are learning, but sorry ヽ(*。>Д<)o゜.");
            other.subtractPoints(15);
            other.getPoints();
        }

        else if (y.equals("C"))
        {
            System.out.println("\nGood job!"); 
            System.out.println("Now you know the prime factor of 183.\n");
            System.out.println("You gain 15 points!");
            other.addPoints(15);
            other.getPoints();
        }

        else if (y.equals("D"))
        {
            System.out.println("\nThat is a good guess"); 
            System.out.println("However, that is not the answer. The prime factorization of 183 is 3 and 61\n");
            System.out.println("Wrong! Generally, I don't give penalty because we are learning, but sorry.");
            other.subtractPoints(15);
            other.getPoints();
        }
          
        else
        {
            System.out.println("\nSadly, that's not an given answer choice! Sometimes, you can fool me, but not today!");
        }
    }  
    public static void holmerR1(Points other, String r)
    {
      Clear clear = new Clear();
      System.out.println("\nJust a friendly reminder that our project was due yesterday! Meaning if you haven't submitted it, submit it soon, and there will be a late penalty deduction ⊙﹏⊙∥.");
      clear.clearScreen();
      System.out.println("We are done with our Do Now, prime factorization, and lesson. Go to your terminals and turn off your computers. ");      
      System.out.println("Be now.");
    }

    // Jason Interaction 
    public static void hitJasonQ()
    { 
        System.out.println("\nAfter English class, you sprinted across the hallway and turned a hard right and crashed into Jason. (●ꉺ▱ꉺ●)");
        System.out.println("\nWhat do you do?");
        System.out.println("A. Catch Jason as he is falling and continue to class.");
        System.out.println("B. Leave Jason to fall onto the floor, who cares about him?");
        System.out.println("C. Catch Jason bridal style and carry him to the nurse's office (✿◠‿◠).");
    }
        
    public static void hitJasonA(Points other, String r)
    {
        String response2 = r;
        if (response2.equals("A"))
        {
            System.out.println("\nYou catch Jason before he hits the floor and hurry to get to your next class before the bell rings. Good job ✺◟(＾∇＾)◞✺\n");
            System.out.println("You gain 5 points for your good deed.\n");
            other.addPoints(5);
            other.getPoints();
        }
               
        else if (response2.equals("B"))
        {
            System.out.println("\nThe dean is passing by as they see you leaving Jason to fall after you crashed into him. They yell at you to stop and they give you detention for the next week.\n");
            System.out.println("Shame on you for not owning up to your mistake o(TヘTo).\n");
            other.subtractPoints(5);
            other.getPoints();
        }
               
        else if (response2.equals("C"))
        { 
            System.out.println("\nJason's face burns red with embarassment while you carry him to the nurse's office and everyone stares. The nurse smiles at your comradeship and gives you an one time elevator pass. You feel satisfied with saving Jason's life, but he will avoid you for the rest of the year. ╰(*°▽°*)╯\n");
            System.out.println("You then continue onto the next class and surprisingly, you make it there before the teacher starts class");
            System.out.println("Nothing happens to your points.\n");
        }
        
        else
        {
            System.out.println("Since you tried to flout the rules...");
            System.out.println("You leave Jason to fall after you crashed into him. The dean yells at you to stop and they give you detention for the next week.");
            System.out.println("Shame on you for not owning up to your mistake (°ロ°). You lose 5 points.\n");
            other.subtractPoints(5);
            other.getPoints();
        }
    }

    // CLUB FAIR INCIDENT 
    public static void clubFair()
    {
      System.out.println("\nAfter all your class ended, you decided to check out some clubs in the club fair. (☞ﾟヮﾟ)☞"); 
      System.out.println("\nYou went to the 6th floor just to see a crowd by the staircases, and it doesn't seem like you are going to go up anytime soon.");
      System.out.println("\nDo you want to find another way in or wait for them? \nA) Another way \nB) Wait");
    }  
  
    public static void clubFairIncident(Points other, String r)
    {
      String club = r; 
      if(club.equals("A"))
      {
        System.out.println("\nYou found another way through the center staircase, but when you entered through the door, you destroyed several club posters. Now, you were told to clean up the mess, compensate the clubs with service, and stay afterschool to clean up club fair all by yourself (T_T).");
        System.out.println("Since you stayed in school so late, you accidentally fell asleep on a lunch table.");
        System.out.println("When a dean went to check your progress, he saw you sleeping and suspended you for a two days ╯︿╰.");
        System.out.println("You missed an exam and got a 45 :(");
        System.out.println("You lost 45 points!");
        other.subtractPoints(45);
        other.getPoints();
        System.out.println("You can affirm that you had a 'great club fair experience (～￣▽￣)～!'\n");
      }
      else if (club.equals("B"))
      {
        System.out.println("\nYou waited for over an half an hour because the the school plans things so well. When you got to the cafeteria, there were so many people that you got crushed and suffocated by other people. You were basically getting trampled on like a tomato ヽ(*。>Д<)o゜.");
        System.out.println("\nThankfully, no one lost an arm or leg, but you got out with your backpack missing. Somehow...");
        System.out.println("\nSince you lost your backpack, you couldn't do any of your homework... ");
        System.out.println("\nYou returned home and tried to find your missing assignments... just to realize that your phone was in your bag o(TヘTo).");  
        System.out.println("What a first day..."); 
        System.out.println("You lost 50 points zzz"); 
        other.subtractPoints(50);
        other.getPoints();
        System.out.println("You can affirm that you had a 'great club fair experience (～￣▽￣)～!'\n");
      }
      else 
      {
        System.out.println("\nSince you didn't select the given option, you went home. When you went on Instagram, all you saw was photos from BTHS Affirmations. ");
        System.out.println("\nSince you avoided getting trampled, you get 10 points to save your life and legs o(*￣▽￣*)ブ.\n"); 
        other.addPoints(10);
        other.getPoints(); 
      }
    }
  
  public static void farewell (Points other)
  {
    System.out.println("\nWe hope you enjoyed this presentation. As stated in our agreements, Mr. Holmer WILL give us a 100 and the class WILL give us a full score on the review. (´◡`)"); 
    System.out.print("\nFinal Score - ");
    other.getPoints();
    int performance = other.returnPoints(); 
      
    System.out.println("\nThis program was to stimulate junior year, so your points is an estimation on how well you will do in junior year.");   
    System.out.println("\nWe will now be calculating your final results...");
    System.out.println("\nIf you get 65 points or above, you pass. If you get below 65 points, you FAIL (;´༎ຶД༎ຶ`).");
    System.out.println("\n- TEST RESULTS -");
      
    if (performance >= 65)
    {
      System.out.println("\nYou passed ヾ(≧▽≦*)o! You are ready to taking on the ultimate challenge of surviving life as a Brookyln Tech student. You are ready to go onto the Senior Level!");
     System.out.println("\nNow go fight a dragon! Or go save that beautiful princess you always have dream of o(*￣▽￣*)ブ!!!");
    }
        
    else if (performance < 65)
    {
      System.out.println("\nYou failed... I am sorry you had to go through that traumatizing experience just to have this result. You will now be transported back to Stuyvensant as you are not ready to go to Brookyln Tech இ௰இ .");

     System.out.println("\nWAIT we got a word from our top boss... He said: \"I have made this program to maximize results.... but since you have failed, I will have to EXTERMINATE YOU NOW （︶^︶）.\"");
    }
        
    else 
    {
      System.out.println("\nBruh... what happened?? We spent more than 24 hours, 2000+ lines of code, blood, sweat, and tears, my hairline receding, my hair balding, and my beautiful gracious time just for this MESSAGE???!! (┬┬﹏┬┬)");
    }
      
    System.out.println("\nTHE END. PLEASE CLEAR THIS CONSOLE TO REMOVE ITS FATE AND EXISTENCE OF THIS WORLD.");
  }
}