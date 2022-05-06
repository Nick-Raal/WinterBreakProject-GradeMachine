class Assignment{

  private double score1;
  private double score2;
  private String name;

  
  public Assignment(double score1, double score2, String name){
    this.score1 = score1;
    this.score2 = score2;
    this.name = name;
  }
  public Assignment(double score1, double score2){
    this (score1, score2, "Unnamed");
  }

  public double getScore1(){
    return score1;
  }
  public double getScore2(){
    return score2;
  }
}