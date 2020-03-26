import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    searchClient client = new searchClient(10);
    // client.printArray();
    ArrayList<Integer> arr1 = new ArrayList<>();
    ArrayList<Integer> arr2 = new ArrayList<>();
    arr1.add(0);
    arr1.add(2);
    arr1.add(3);
    arr1.add(7);
    arr2.add(0);
    arr2.add(1);
    arr2.add(5);
    arr2.add(8);
    arr2.add(9);
    ArrayList<Integer> sortedArray = client.mergeArrays(arr1,arr2);
    for(int a:sortedArray){
      System.out.println(a);
    }
  }
}