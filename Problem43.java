import java.util.*;
import java.math.*;
public class Problem43{
   public static void main(String[] args){
      BigInteger sum = new BigInteger("0");
      ArrayList<String> pands = new ArrayList<String>();
      permutation("","0123456789", pands);
      for(String i: pands){
      
      System.out.println(i);
         if(checks(i))
            sum = sum.add(new BigInteger(i));
      }
      System.out.println(sum + "16695334890");
   }
   
   public static boolean checks(String s ){
      
      int prod1= Integer.parseInt(s.substring(1,4));
      if(prod1% 2!=0)
         return false;
      int prod2= Integer.parseInt(s.substring(2,5));
      if(prod2% 3 !=0)
         return false;
      int prod3= Integer.parseInt(s.substring(3,6));
      if(prod3% 5!=0)
         return false;
      
      int prod4= Integer.parseInt(s.substring(4, 7));
      if(prod4% 7!=0)
         return false;
      int prod5= Integer.parseInt(s.substring(5,8));
      if(prod5% 11!=0)
         return false;
      int prod6= Integer.parseInt(s.substring(6,9));
      if(prod6% 13!=0)
         return false;
      
      int prod7= Integer.parseInt(s.substring(7));
      if(prod7% 17!=0)
         return false;
      return true;
   
   }
   private static void permutation(String prefix, String str, ArrayList<String> result) {
      int n = str.length();
      if (n == 0) result.add(prefix);
      else {
         for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), result);
      }
   }

}