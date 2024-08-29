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

  //methods
  // get an element by index
  public int getElement(int index){
    return arr[index];
  }
  // set an element by index
  public void setElement(int index, int value){
    arr[index] = value;
  }
  // add an element
  public void addElement(int value){
    arr[size] = value;
    size++;
  }
  // get size
  public int getSize(){return size;}
  
  // Traverse
  public void traverse(){
    for(int i=0; i<size; i++){
      System.out.print(arr[i]);
      System.out.print(" ");
    }
    System.out.println();
  }
  // Insertion
  public void insert(int index, int value) throws IndexOutOfBoundsException{
    // case 1: invaid index
    if(index>size || index<0){
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
    // case 2 valid index, but size<length
    if(size<length){
      for(int i=size; i>index; i--){
        arr[i] = arr[i-1];
      }
      arr[index] = value;
    }else{ // case 3: valid index, but size=length
      int[] newArr = new int[length*2];
      length *= 2;
      for(int i=0; i<index; i++){
        newArr[i] = arr[i];
      }
      newArr[index] = value;
      for(int i=index+1; i<size+1; i++){
        newArr[i] = arr[i-1];
      }
      arr = newArr;
    }
    
    size++;
  }
  












public static void main (String [] args) {
  System.out.println('2');
}











}