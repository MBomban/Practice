
package practice;

public class Practice{
    
    public static int[] arr = new int[2]; 
    public static int[] a =  {32,51,63,23,86,14,86,12,64, 73};
    public static int[] b;
    
    
    public static void main(String[] args) {
        
//        test_print_hello_world();
//        test_swap();
//        test_bubble_sort();
//        test_insertion_sort();

//        class_b b = new class_b();
//        b.print_words(); 

    int[] arr = {2, 0, 1, 3};
    for (int el : arr) {
        System.out.println(el);
    }

      
    }
    
    public static void class_b_m1(){
        
        
        
    }
    
    
      
    public static void test_print_hello_world(){
        print_hello_world(); 
    }
    
    public static void test_swap(){
        int a = 10;
        int b =4; 
        System.out.println(" a = " + a + " b = " + b + "\n Swapped");
        swap(a,b);
        a=arr[0];
        b=arr[1];
        System.out.println(" a = " + a + " b = " + b);
    }
    
    public static void test_bubble_sort(){
        System.out.println("Bubble Sort:");
        int[] b = (int[])a.clone();
        print_array(b);
        System.out.println("\nSorted");  
        bubble_sort(b);
        print_array(b);
    }
    
    public static void test_insertion_sort(){
        System.out.println("Insertion Sort:");
        int[] c = (int[])a.clone();
        print_array(c);
        System.out.println("\nSorted");  
        insertion_sort(c);
        print_array(c);
    }
    
    public static void print_hello_world(){
        System.out.println("Hello World");
    }
    
    public static void swap(int x, int y){
       
        arr[0]= x; 
        arr[1]=y;
        int temp = arr[0];
        arr[0]=arr[1];
        arr[1]=temp; 
    }
    
    public static void print_array(int[] array){
      
        for(int i=0;i<10;i++){
            System.out.print(array[i] + " ,");
        }
    }
    
    public static int[] bubble_sort(int[] array){
        int[] result = array;
        int curr_len = array.length;
         for (int j=array.length; j>=0;j--){
             for(int i = 0; i< curr_len-1;i++){
                if(result[i]> result[i+1]){
                    int a = result[i];
                    result[i] = result[i+1];
                    result[i+1] = a;
                }
             }
         }
        return result;
    }
    
    public static int[] insertion_sort(int[] array){
        int[] result = array; 
        int n = result.length;
        for ( int j =1; j<n; ++j){
            int key = result[j];
            int i = j-1;
            while( i >=0 && result[i]>key){
                result[i+1] = result[i];
                i = i-1;
            }
            result[i+1] = key;
        }
        return result;
    }
}