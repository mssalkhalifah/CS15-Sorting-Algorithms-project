package project.analysis.of.algorithms;


public class ProjectAnalysisOfAlgorithms {

 
    
    public static void InsertionSort(int [] array){
        for (int i = 1 ; i < array.length ; i++){
            
            int key = array[i];
            int j = i - 1;
            
            while(j >= 0 && key < array[j]){
                array[1 + j] = array[j];
                j = j - 1;
            }
            array[1 + j] = key;
        }
    }
 
      public static void heapsort(int array[]) 
    { 
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapsort2(array, n, i);
        
        for (int i=n-1; i>=0; i--) 
        {
            int temp = array[0]; 
            array[0] = array[i]; 
            array[i] = temp;
            
            heapsort2(array, i, 0); 
        } 
    } 
      public static void heapsort2(int array[], int n, int i) 
    { 
        int max = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2;
        
        if (l < n && array[l] > array[max]) 
            max = l;
        
        if (r < n && array[r] > array[max]) 
            max = r;
        
        if (max != i) 
        { 
            int swap = array[i]; 
            array[i] = array[max]; 
            array[max] = swap;
            
            heapsort2(array, n, max); 
        } 
    } 
    
     static void print(int array[]) 
    { 
         
        for (int i = 0 ; i < array.length ; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    } 
    
    public static void main(String[] args) {
        
       int array[] ={5,2,4,1,8,0};
       System.out.println(5/2);
       print(array);
       heapsort(array);
       print(array);   
    }
    
}
