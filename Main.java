
import java.util.*;

class Main {
  public static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

   
    //10 until 61 is the main menu
    System.out.println(Color.BLUE + "░██████╗░██████╗░░█████╗░██████╗░███████╗███╗░░░███╗░█████╗░░█████╗░██╗░░██╗██╗███╗░░██╗███████╗██████╗░░█████╗░░█████╗░░█████╗░\n██╔════╝░██╔══██╗██╔══██╗██╔══██╗██╔════╝████╗░████║██╔══██╗██╔══██╗██║░░██║██║████╗░██║██╔════╝╚════██╗██╔══██╗██╔══██╗██╔══██╗\n██║░░██╗░██████╔╝███████║██║░░██║█████╗░░██╔████╔██║███████║██║░░╚═╝███████║██║██╔██╗██║█████╗░░░█████╔╝██║░░██║██║░░██║██║░░██║\n██║░░╚██╗██╔══██╗██╔══██║██║░░██║██╔══╝░░██║╚██╔╝██║██╔══██║██║░░██╗██╔══██║██║██║╚████║██╔══╝░░░╚═══██╗██║░░██║██║░░██║██║░░██║\n╚██████╔╝██║░░██║██║░░██║██████╔╝███████╗██║░╚═╝░██║██║░░██║╚█████╔╝██║░░██║██║██║░╚███║███████╗██████╔╝╚█████╔╝╚█████╔╝╚█████╔╝\n░╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░╚══════╝╚═╝░░░░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚═╝╚═╝░░╚══╝╚══════╝╚═════╝░░╚════╝░░╚════╝░░╚════╝░");
    //creates a new color class which makes rainbow effect
    Color col = new Color();
    System.out.println("\n(Due to the limitations of arrays, there are a maximum of 3 sections per class and 10 assignments per section)\n");
    System.out.println(col.giveColor() + "Enter class name:");
    col.colorPlus();
    String s1 = in.nextLine();
    Classroom c = new Classroom(s1);
    double n = 0;
    String s = "";
    //this while loop is for adding sections
    while (!s.toLowerCase().equals("exit")){
      System.out.println(col.giveColor() + "Enter section name: (exit to go to next step)");
      s = in.nextLine();
      col.colorPlus();
      if (!s.toLowerCase().equals("exit")){
        System.out.println("Enter section weight: (0-1)");
        double d = Double.parseDouble(in.nextLine());
        c.addSection(new Section(d, s));
      }
    }

    //Assignment adding
    while(true){
      System.out.println(col.giveColor() + "Enter Assignment Name or Leave Blank:");
      s = in.nextLine();

      //think about each assignment as a fraction with first score being the numerator...
      System.out.println(col.giveColor() + "Enter First Score: (or -1 to exit)");
      col.colorPlus();
      n = Double.parseDouble(in.nextLine());
      if(n == -1){
        break;
      }

      //...and second score being the denominator
      System.out.println("Enter Second Score: (or -1 to exit)");
      double n1 = Double.parseDouble(in.nextLine());
      if(n1 == -1){
        break;
      }

      //just the section the assignment goes into
      System.out.println("Enter Section Number: (or -1 to exit)");
      int n2 = Integer.parseInt(in.nextLine());
      if(n2 == -1){
        break;
      }

      //-- to correct for people entering section number normally and not starting from 0
      n2--;
      
      //64 is data validation
      if(n >= 0 && n1 >= 0 && n2 >= 0 && n2 < c.numOfSections()){
        if(n2 < c.numOfSections() && n2 >= 0 && (n1 >= 0 && n >= 0)){
        if (!s.equals(null)){
          c.getSection(n2).addAssignment(new Assignment(n, n1, s));
        }else{
          c.getSection(n2).addAssignment(new Assignment(n, n1));
          }
        }else{
         System.out.println(col.RED + "ERROR");
        }
      }
    }
    
    //outputting grades
    System.out.println(Color.RESET + "Total Score: " + c.calculate());
    for(int i = 0; i < c.numOfSections(); i++){
      System.out.println(c.getSection(i));
    }

    
    in.close();
  }
}