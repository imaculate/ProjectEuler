import java.util.*;
public class QuadraticPrimes{
   static ArrayList<Integer> primes = getPrimes();
   public static void main(String[] args){
      int max = 0;
      System.out.println(primes.size());
      int A = 0; int B = 0;
      for(Integer b: primes){
         
         for(int a= 2-b; a<1000; a+=2){
            
            int most = getMostPrimes(a,b);
            if(most>max){
               max =most;
               A =a;
               B = b;
               
            }
         }
            
      }
      System.out.println("max " + max + " with A = "+ A+ " and B = "+ B);
      System.out.println(A*B);
   }
   public static ArrayList<Integer> getPrimes(){
      ArrayList<Integer> primes = new ArrayList<Integer>();
      for(int i = 2; i< 1000; i++){
         if(isPrime(i))
            primes.add(i);
      }
      return primes;
   
   }
   
   public static int getMostPrimes(int a,int b){
   
      int sum = 0;
      for(int i = 0; i< b; i++){
         long ans = (i*i) + (i*a) +b;
         if(primes.contains((int)ans))
            sum++;
         else 
            return sum;
            
      }
      System.out.println(sum);
      return sum;
   }

   
   public static boolean isPrime(long n)
   
   {
      if((n+"").charAt((n+"").length()-1)=='0'||(n+"").charAt((n+"").length()-1)=='5'||(n+"").charAt((n+"").length()-1)=='2'||(n+"").charAt((n+"").length()-1)=='4' || (n+"").charAt((n+"").length()-1)=='6'||(n+"").charAt((n+"").length()-1)=='8')
         return false;
       
      long half = (n/2) % 2 == 0 ? (n/2)-1 : n/2; //make sure we work with odd number
      for ( int i = 3; i < half; i += 2 ) //step of 2 to keep it odd numbers
      {
         if ( n % i == 0 )
            return false;
      }
   
      return true;
   }

}