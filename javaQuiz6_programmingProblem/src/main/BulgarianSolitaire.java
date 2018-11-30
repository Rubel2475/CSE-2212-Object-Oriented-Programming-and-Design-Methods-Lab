package main;

public class BulgarianSolitaire {
	  
public static void printArray(String header, int[] array, int size){
    System.out.print(header);
    for(int i=0; i<size; i++)
      System.out.printf("%d ", array[i]);
    System.out.println();
  }
  
public static void sort(int[] arr, int cs){
    for(int i=0; i<cs; i++){
      for(int j=i; j<cs; j++){
        if(arr[j]<arr[i]){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

public static boolean checkSame(int[] a, int[] goal){
    
    for(int i=0; i<goal.length; i++){
      if(a[i] != goal[i])
        return false;
    }
    
    return true;
  }
  
  public static int removeZero(int[] A, int cs) {
    for(int i=0; i<cs; i++){
      if(A[i]==0 && A[cs-1]!=0){
        A[i] = A[cs-1];
        cs--;
      }
      if(A[cs-1]==0){
        cs--;
        i--;
      }
    }
    return cs;
  }
  
  public static void main(String[] args){
    
    int[] goal = {1,2,3,4,5,6,7,8,9};
    int[] A = new int[45];
    int total = 45;
    int currentSize = 0;
    int counter=0;
    
    for(int i=0; total>0; i++){
      int rn = (int) (Math.random()*total)+1;
      total -= rn;
      A[i] = rn;
      currentSize++;
    }
    printArray("Initial pile: ", A, currentSize);
    
    while(true){
      int newPile=0;
      for(int i=0; i<currentSize ; i++){ 
        A[i] = A[i]-1;
        newPile++;      
      }
      
      currentSize++;
      A[currentSize-1] = newPile; 
     
      currentSize = removeZero(A,currentSize);
      
      printArray("Intermediate pile: ", A, currentSize);
      counter++; 
      
      if(currentSize==9){
	        sort(A,currentSize);
	        boolean done = checkSame(A, goal);
	        
	        if(done)break;
       }     
    }
    
    printArray("Final Array Sorted: ", A, currentSize); 
    System.out.println("Number of solitaire steps needed: " + counter);
  }
}