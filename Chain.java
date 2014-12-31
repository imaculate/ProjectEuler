import java.math.*;
public class Chain
{
   public static void main(String[] args){
      long ans = 0; long gen = 0;
      for(long i = 2; i< 1000000;i++){
         long ch = chains(i);
         if(ch>ans){
         ans = ch;
         gen = i;
        } 
      }
   System.out.println("Generator" + gen);
   System.out.println(ans);
   }
   
   public static long chains(long n){
      System.out.println(n);
      long sum = 1;
      BigInteger bg = new BigInteger(n+"");
      BigInteger one = new BigInteger("1");
       BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");
         BigInteger zero = new BigInteger("0");
   

      
      

      
      while(!bg.equals(one)){
         if(bg.remainder(two).equals(zero)){
            bg = bg.divide(two);
            

            
         }else{
            bg = bg.multiply(three).add(one);
            

          }  
        sum++;
      }
      System.out.println(sum);
      return sum;
      
   } 
    
}