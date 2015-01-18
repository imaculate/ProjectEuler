import java.util.*;
public class Problem50{

   public static void main(String[] args){
      ArrayList<Integer> primes = new ArrayList<Integer>();
      for(int i = 1; i< 1000000; i++){
         if(isPrime(i)){
            primes.add(i);
            System.out.println(i + " is prieme");
         }
      }
      int max = 0;
      int[] maxcomb = new int[2];
      for(int i = 0; i< primes.size()-1; i++){
         int[] sumy = Sums(primes, i);
         if(sumy[0]> maxcomb[0]){
            maxcomb[0] = sumy[0];
            max = sumy[1];
           }
     }
     System.out.println(max);
      
      
       
   
   
   }
   
   public static boolean isPrime(long number)
   {
         if (number == 2 || number == 3 ||number == 5) {
         return true;
      }
      if (number ==1 ||number % 2 == 0) {
         return false;
      }
      long sqrt = (int) Math.sqrt(number) + 1;
      for (long i = 3; i < sqrt; i += 2) {
         if (number % i == 0) {
            return false;
         }
            
      }
      return true;
   }
   
   public static int[] Sums(ArrayList<Integer> primes, int start){
      
      int sum = 0;
      ArrayList<Integer> sums = new ArrayList<Integer>();
      for(int j = start; j< primes.size() ; j++){
         sum+= primes.get(j);
         if(sum>1000000)
            break;
         sums.add(sum);
         
         
         
      } 
      System.out.println(isPrime(9));
   int[] arr = new int[2];
      System.out.println(sums.size());
      for(int  k=sums.size()-1;k>=0 ; k--){
         if(isPrime(sums.get(k))){
            arr[0] = k;
            arr[1] = sums.get(k);
            return arr      ;      
            
         
                 
      } 

   }
   return arr;

}
}