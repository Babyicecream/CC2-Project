
package javaapplication16;


public class JavaApplication16 {


    public static void main(String[] args) {
   int z[] = {2,4,6,8,10};
   int x[] = {3,6,9,12};
  
   display (x); 
    }
    static void display(int z[]){
        for (int i = 0; i < z. length; i++){
            System.out.println("f(" + z[i] + ") = " + fibonacci(z[i]));
        }
    }
    static int fibonacci (int n){
        if (n<=1){
            return n;
        }
        else{
            return fibonacci (n-1) + fibonacci (n-2);
        }
    }
}
