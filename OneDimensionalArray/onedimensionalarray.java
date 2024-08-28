public class OneDimensionalArray {
  
  //attributes
  private int length;
  private int size;
  private int[] arr;

  // constructors
  public OneDimensionalArray(){
    length = 10;
    size = 0;
    arr = new int[length];
  }

  public OneDimensionalArray(int capacity){
    length = capacity;
    size = 0;
    arr = new int[length];
  }

  public OneDimensionalArray(int[] oneArray){
    length = oneArray.length;
    size = length;
    arr = oneArray;
  }























}