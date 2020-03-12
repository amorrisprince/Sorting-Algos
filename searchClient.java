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
  public void selectionSort(){
    for(int i=0; i<elements; i++){
      int min = arrayToBeSorted.get(i);
      int minIndex = i;
      for(int j=i; j<elements; j++){
        if(arrayToBeSorted.get(j) < min){
          min = arrayToBeSorted.get(j);
          minIndex = j;
        }
      }
      int temp = arrayToBeSorted.get(i);
      arrayToBeSorted.set(i, min);
      arrayToBeSorted.set(minIndex, temp);
      steps++;
      printArray();
    }
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
  public ArrayList mergeArrays(ArrayList<Integer> left, ArrayList<Integer> right){
    
  }
  public ArrayList mergeSort(ArrayList<Integer> fullArray){
    ArrayList<Integer> left = new ArrayList<>();
    ArrayList<Integer> right = new ArrayList<>();
    for(int i=0; i<fullArray.size(); i++){
      if(fullArray.size() == 1){
        return fullArray;
      }
      else if(i<((fullArray.size())/2)){
        left.add(fullArray.get(i));
      }
      else{
        right.add(fullArray.get(i));
      }
    }
    ArrayList<Integer> sortedLeft = mergeSort(left);
    ArrayList<Integer> sortedRight = mergeSort(right);
  }
}