import java.util.*;
import java.math.*;
public class Problem61{
   public static void main(String[] args){
      long result = 0;
      for(int i = 1; i<100; i++){//base
         BigInteger a = new BigInteger(i+"");
         if(i%10!=0){
            for(int j= 0; j<100; j++){//exponent
            
               BigInteger c = a.pow(j);
               long val = count(c);
               if(val>result){
                  System.out.println(c);
                  result = val;
               }
            
            }
         }
      }
      System.out.println(result);      
   }
   
   public static long count(BigInteger a){
      long ans = 0;
      String s = a.toString();
      for(int i = 0; i<s.length(); i++){
         ans += (s.charAt(i)- '0');
      }
      return ans;
   }
}