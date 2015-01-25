import java.math.*;
public class Problem53{
   public static void main(String[]  main){
      long count = 0;
      BigInteger million  = new BigInteger("1000000");
      for(int n = 2; n<= 100; n++){
         int half = 0;         boolean even  = (n%2 == 0);
         if(even){
            half = n/2;
         }
         else{
            half = (n/2) + 1;
         }
         if( choose(n, half).compareTo(million)>0){
            if(even){
               count+=1 ;
            }
            else{
               count+=2;
            }
         }
         else{
            continue;
         }
      
         
         inner:for(int j = half+1; j<n; j++){
            if( choose(n, j).compareTo(million)>0){
               count+=2 ;
            }
            else{
               break inner;
            
            }
         }
      }
      System.out.println(count);
   }
   
   public static BigInteger choose(int n, int r){
      BigInteger result = new BigInteger("1");
      for(int i = n; i>0; i--){
         result = result.multiply(new BigInteger(i+""));
      }
      
      for(int j = r; j>0; j--){
         result = result.divide(new BigInteger(j+""));
      }
      
      for(int k = n-r; k>0; k--){
         result = result.divide(new BigInteger(k+""));
      }
   
      return result;
   
   }
}



