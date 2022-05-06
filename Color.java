public class Color{
  private int color;

  //bunch of console color codes
  public static final String RESET = "\u001B[0m";
  public static final String BLACK = "\u001B[30m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";
  public static final String ORANGE = "\033[48:5:208m%s\033[m";
  

  //this is lots of code that just makes stuff form a rainbow
  public void colorPlus(){
    color ++;
  }
  public String giveColor(){
    switch (color){
      case 1:
        return RED;

      case 2:
        return YELLOW;

      case 3:
        return GREEN;

      case 4:
        return BLUE;

      case 5:
        return PURPLE;

      default:
        color = 1;
        return RED;
    }
  }
}