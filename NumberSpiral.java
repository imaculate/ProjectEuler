import java.math.*;
public class NumberSpiral{
   public static void main(String[] args){
      BigInteger sum = new BigInteger("0");
     
       BigInteger juc = new BigInteger("1");
      for(int i = 1; i< 1001; i++){
         BigInteger temp = new BigInteger(i+"");
         if(i%2 == 0)
            temp = temp.multiply(temp).add(new BigInteger("1"));
         else
            temp= temp.multiply(temp);
         sum = sum.add(temp);
         juc = juc.add(new BigInteger(2*i+""));
         sum = sum.add(juc);
         
            
      }
      sum = sum.add(new BigInteger("1001").multiply(new BigInteger("1001")));
      System.out.println(sum);
      
      
   }
}