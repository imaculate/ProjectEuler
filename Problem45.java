import java.math.*;
public class Problem45{
private static final BigInteger TWO = BigInteger.valueOf(2);

   public static void main(String[] args){
      long i = 144;
      while(true){
         
         
            
        BigInteger H =  new BigInteger(i+"").pow(2).multiply(new BigInteger("2")).subtract(new BigInteger(i+""));
         System.out.println(H);
         if(isPenta(H)){
            System.out.println(i);
         break;
         }
          i++;
      }
     
   }
      
     
      
   
   

public static BigInteger sqrt(final BigInteger val) {
    final BigInteger two = BigInteger.valueOf(2);
    BigInteger a = BigInteger.ONE.shiftLeft(val.bitLength() / 2);
    BigInteger b;
    do {
        b = val.divide(a);
        a = (a.add(b)).divide(two);
    } while (a.subtract(b).abs().compareTo(two) >= 0);
    return a;
}

public static boolean isSqrt(BigInteger n){
   return n.equals(sqrt(n).pow(2));
}
   
   public static boolean isPenta(BigInteger x){
      BigInteger temp =  x.multiply(new BigInteger("24")).add(new BigInteger("1")) ;
      if(isSqrt(temp)){
      temp=sqrt( temp);
      if(temp.add(new BigInteger("1")).remainder(new BigInteger("6")).equals(new BigInteger("0")))
         return true;
      } 
      return false;
   }
   
         


}