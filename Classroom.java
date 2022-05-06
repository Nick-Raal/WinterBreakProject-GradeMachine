
import java.util.*;
class Classroom{
  private Section[] l = new Section[3];
  private String name;
  public Classroom(String n){
    name = n;
  }



  public void addSection(Section s){
    for(int i = 0; i < l.length; i++){
      //uses null checking + for loop to mimic arrayList.add()
      if(l[i] == null){
        l[i] = s;
        break;
      }
    }
  }
  public Section getSection(int n){
    return l[n];
  }
    
  //adds the weighted average of all the sections in a classroom
  public double calculate(){
    double sum = 0;
    for(int i = 0; i < l.length; i++){
      if(l[i] != null){
        sum += l[i].calculate();
        System.out.println(sum);
      }
    }
    return sum;
  }

  public int numOfSections(){
    int sum = 0;
    //null checking is to prevent empty sections being counted as existing for the purpose of averages
    for(int i = 0; i < l.length; i++){
      if(l[i]!=null){
        sum++;
      }
    }
    return sum;
  }
}