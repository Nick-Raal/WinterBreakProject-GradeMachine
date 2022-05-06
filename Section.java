import java.util.*;

class Section{
  private Assignment[] l = new Assignment[10];
  private double weight;
  private String name;
  public Section(double w, String name){
    this.name = name;
    weight = w;
  }
  public Section(double w){
    this (w, "Unnamed");
  }


  
  public void addAssignment(Assignment a){
    //see classroom line 14
    for(int i = 0; i <l.length; i++){
      if(l[i] == null){
        l[i] = a;
        break;
      }
    }
  }
  public String toString(){
    return name + " Average: " + this.average() + " Sum1: " + this.sum1() + " Sum2: " + this.sum2();
  }
  public double average(){
    double sum = 0;
    double sum1 = 0;
    for(int i = 0; i < l.length; i++){
      if(l[i] != null){
        sum += l[i].getScore1();
        sum1 += l[i].getScore2();
      }
    }
    return sum = sum/sum1;
  }
  public double sum1(){
    double sum = 0;
    for(int i = 0; i < l.length; i++){
      if(l[i] != null)
        sum += l[i].getScore1();
    }
    return sum;
  }
  public double sum2(){
    double sum = 0;
    for(int i = 0; i < l.length; i++){
      if(l[i] != null)
        sum += l[i].getScore2();
    }
    return sum;
  }
  
  //calculate makes the section average tied to the section weight
  public double calculate(){
    return (average() * weight);
  }

  public int numOfAssignments(){
    return l.length;
  }
}