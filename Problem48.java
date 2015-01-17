import java.math.*;
public class Problem48{
   public static void main(String[] args){
      BigInteger sum  = new BigInteger("0");
      for(int i =1; i<1000; i++){
         if(i%10 ==0){
            continue;
         }
         System.out.println(i);
      
         BigInteger bg  = new BigInteger(i+"");
         
      
         sum = sum.add(bg.pow(i));
         System.out.println(sum);
      }
      
      String s = sum.toString();
      
      System.out.println(s.substring(s.length()-10));
   }
}