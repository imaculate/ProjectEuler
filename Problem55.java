import java.math.*;
import java.util.*;

public class Problem55{
//lynchrel numbers.

   public static void main(String[] args){
      int ly = 0;
      for(int i = 11; i< 10000; i++){
         BigInteger bg = new BigInteger(i+"");
         
         int n = 0;
         BigInteger sum = new BigInteger("0");
         boolean lynch = true;
         ite:while(n<50){
            
            BigInteger rev = new BigInteger(new StringBuilder(bg.toString()).reverse().toString());
            sum = bg.add(rev);
            if(isPalindrome(sum)){
               lynch = false;
               
               break ite;
               
            }
            bg = sum;
           
         
            n++;
         }
         if(lynch){
            ly++;
         }  
      }
      System.out.println(ly);
   }
   
   public static boolean isPalindrome(BigInteger n){
      String s = n.toString();
      String rev = new StringBuilder(s).reverse().toString();
      if(s.equals(rev))
         return true;
       return false;
   }
}