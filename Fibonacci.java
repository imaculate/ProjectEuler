import java.math.*;
public class Fibonacci{
   public static void main(String[] args){
      BigInteger next= new BigInteger("1");
      BigInteger prev = new BigInteger("1");
      int index = 2;
      while(next.toString().length()< 1000){
         BigInteger temp = next;
         next = next.add(prev);
         prev = temp;
         index++;
         
      }
      System.out.println(index);
       System.out.println(next.toString().length());

      
   
   }
}