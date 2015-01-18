import java.util.*;
public class Problem49{
   public static void main(String[] args){
      ArrayList<Integer> primes = new ArrayList<Integer>();
      for(int i = 1001; i< 10000; i++){
         if(isPrime(i)){
            primes.add(i);
         }
      }  
      String s = "";
      for(int j = 0; j< primes.size(); j++){
         int num = primes.get(j);
         System.out.println(num);
         int k = j-1;
         
         while(k>=0 ){
            int prev = primes.get(k);
            if(equalsD(num, prev)){
               int far = num + num - prev;
               if(primes.contains(far) && equalsD(far, num)){
                     
                  s += "ans = " + prev+ ""+num+ far+ " ";
               }
                  
                  
               
            }
            k--;
         }    
         
         
      }
      System.out.println(s);
   }
   
   public static boolean equalsD(int a, int b){
      String s = a+"";
      String t = b+"";
      if (s.length() != t.length()){
         return false ;      
      }      
      
      for(char c: s.toCharArray()){
         if((s.length() - s.replace(c+"", "").length())!= (t.length() - t.replace(c+"", "").length()) )
            return false;
      }
      return true;
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