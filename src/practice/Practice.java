
package practice;

public class Practice{
    
    public static int[] arr = new int[2]; 
    public static int[] a =  {32,51,63,23,86,14,86,12,64, 73};
    public static int[] b = a; 
    public static void main(String[] args) {
        
//        print_hello_world(); 
//        int a = 10;
//        int b =4; 
//        System.out.println(" a = " + a + " b = " + b + "\n Swapped");
//        swap(a,b);
//        a=arr[0];
//        b=arr[1];
//        System.out.println(" a = " + a + " b = " + b);
        print_array(a);
        System.out.println("\n");
    int[] temp_arr = bubble_sort(a); 
      print_array(temp_arr); 
         System.out.println("\n");
          print_array(b);
        System.out.println("\n");
       //temp_arr = insertion_sort(a); 
      // print_array(temp_arr); 
        
        
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
        
        for ( int j =0; j<result.length-1; j++){
            for(int i = j; i>0;i--){
                if(result[i+1] < result[i]){
                    int num = result[i+1];
                    result[i+1] = result[i];
                    result[i] = num;
                }
            }
        }
        return result;
    }
    
    
    
    
}
