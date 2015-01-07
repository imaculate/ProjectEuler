import java.util.*;
import java.math.*;
public class Problem29{

   public static void main(String[] args){
      Set<BigInteger> set = new HashSet<BigInteger>();
      
      for(int i = 2; i<=100; i++){
         BigInteger bg = new BigInteger(i+"");
         System.out.println(bg);
         for(int j = 2; j<=100; j++){
            BigInteger bj = new BigInteger(j+"");
            bj = bg.pow(j);
            
            set.add(bj);
         }
         
      }
      System.out.println(set.size());
      
   }
}