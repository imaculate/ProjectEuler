import java.util.*;
public class Problem41{
   public static void main(String[] args){
      int max = 0;
      
      outer:for(int i = 9; i>=2; i--){
         ArrayList<Integer>  gens = gen(i);
         Collections.sort(gens);
         for(int j =gens.size()-1; j>= 0; j--){
            if(isPrime(gens.get(j))){
               max = gens.get(j);
               break outer;
            }            
            
            
         }
      }
      System.out.println(max);
   }
   public static boolean isPrime(long number)
   {
      if (number == 2 || number == 3) {
         return true;
      }
      if (number % 2 == 0) {
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


   
   public static ArrayList<Integer> gen(int n){
      ArrayList<Integer> result = new ArrayList<Integer>();
      String s = "";
      for(int i = 1; i<=n; i++){
         s+= i;
      }
      permutation("",s, result);
      
      return result;
   }
  

   private static void permutation(String prefix, String str, ArrayList<Integer> result) {
      int n = str.length();
      if (n == 0) result.add(Integer.parseInt(prefix));
      else {
         for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), result);
      }
   }
}