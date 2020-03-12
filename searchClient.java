import java.util.ArrayList;

public class searchClient{
  int elements;
  int steps;
  ArrayList<Integer> arrayToBeSorted;
  searchClient(int elements){
    arrayToBeSorted = new ArrayList<>();
    this.elements = elements;
    for(int i=0; i<elements; i++){
      arrayToBeSorted.add((int) (Math.random()*elements));
    }
  }
  public void printArray(){
    for(Integer i : arrayToBeSorted){
      System.out.print(i+" ");
    }
    System.out.println();
  }
  public void bubbleSort(){
    boolean loop = true;
    while(loop){
      int steps = 0;
      printArray();
      for(int i=0; i<arrayToBeSorted.size()-1; i++){
        if(arrayToBeSorted.get(i) > arrayToBeSorted.get(i+1)){
          int temp = arrayToBeSorted.get(i);
          arrayToBeSorted.set(i, arrayToBeSorted.get(i+1));
          arrayToBeSorted.set(i+1, temp);
          steps = 0;
        }
        else{
          steps++;
        }
        if(steps == arrayToBeSorted.size()-1){
          loop = false;
        }
      }
    }
  }
  
}