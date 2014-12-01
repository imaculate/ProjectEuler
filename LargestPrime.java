import java.math.*;
public class LargestPrime{
   public static void main(String[] args){
      primeFactors(new BigInteger("600851475143"));
     
   }
      
  
   
   public static void  primeFactors(BigInteger n){
    
      for (BigInteger i = new BigInteger("3") ; i.compareTo(n)<1; i = i.add(new BigInteger("2")))
      {
        // While i divides n, prBigInteger i and divide n
         while (n.remainder(i) == new BigInteger("0"))
         {
            System.out.println( i);
            n = n.divide(i);
         }
      }
   
    // This condition is to handle the case whien n is a prime number
    // greater than 2
      if (n.compareTo(new BigInteger("2"))==1)
         System.out.println( n);
   }
}