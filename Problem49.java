import java.util.*;
public class Problem49{
   public static void main(String[] args){
    
      ArrayList<String> perms = new ArrayList<String>();
      permutation("","9675", perms);
      for(int i = 1; i< perms.size()-1; i++){
         if(Integer.parseInt(perms.get(i))- Integer.parseInt(perms.get(i-1)) ==Integer.parseInt(perms.get(i+1))- Integer.parseInt(perms.get(i)) ){
            System.out.println(" numbers" + perms.get(i)+ perms.get(i-1)+ perms.get(i+1));
            break;
         
         }
      }
      
      
      
   }
   
   private static void permutation(String prefix, String str, ArrayList<String> result) {
      int n = str.length();
      if (n == 0 && isPrime(Integer.parseInt(prefix))) result.add(prefix);
      else {
         for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), result);
      }
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

}