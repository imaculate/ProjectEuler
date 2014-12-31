import java.math.*;
public class DigitSum{
   public static void main(String[] args){
      BigInteger ans = new BigInteger("0");
      BigInteger power = new BigInteger("1");
      BigInteger two = new BigInteger("2");

      for(int i = 0; i<1000; i++){
         power = power.multiply(two);
      }
      String s = power.toString();
      for(int i = 0; i<s.length(); i++){
         ans = ans.add(new BigInteger(s.charAt(i)+""));
      }
System.out.println(ans);

     
   }
}