import java.math.*;
public class FactorialSum{
   public static void main(String[] args){
      BigInteger bg = new BigInteger("1");
      for(int i = 2; i<= 100; i++){
         bg = bg.multiply(new BigInteger(i+""));
      }
      String s = bg.toString();
      int sum = 0;
      for(int i = 0; i<s.length(); i++){
      
         sum+= Integer.parseInt(s.charAt(i)+"");
      }
      System.out.println(sum);
   
   }
}