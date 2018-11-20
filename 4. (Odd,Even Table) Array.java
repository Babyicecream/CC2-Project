
package array;
public class Array {
public static void main(String[] args) {

     int [] Numbers ={5,10,15,20,25,30,35,40,45,50};
     
     System.out.println("Array: 5, 10, 15, 20, 25, 30, 35, 40, 45, 50");
     
     System.out.println("Even\tOdd");  
        for (int i=0; i<Numbers.length;i++){
            if(Numbers[i]%2 == 0){
                
        for (int z=0; z<Numbers.length;z++){
              if(Numbers[z]%2 != 0){ 
              
        System.out.println(Numbers[i] + "\t" + Numbers[z]);
                                               break;
         
              }
        }
            }
        }
        
  }
}
