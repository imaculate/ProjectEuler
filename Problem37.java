import java.util.*;
public class Problem37{
   public static void main(String[] args){
      long sum = 0;
      boolean[] primes = new boolean[1000001];
      primes[2] = true;
      primes[5] = true;
      primes[3] = true;
      primes[7] = true;
      for(int i=11; i< 1000001;i+=2){
         System.out.println(i);
         
         if(isPrime(i)){
            primes[i] = true;
          
            
         }
      }
          
      ArrayList<Integer>  ans = new ArrayList<Integer>();
      int j = 11;
      int num = 0;
      while(num<11){
      
         System.out.println(j);
         if(primes[j] && chop(j, primes)){
               
            ans.add(j);
            num++;            sum+=j;
         }
         j++;
         

      
      }
         
         
      for(int l= 0; l<ans.size(); l++){
         System.out.println(ans.get(l));
      
      }
      System.out.println(sum);
   }
   
   public static boolean chop(int j, boolean[] primes){
      String s = j+"";
      //chop left
      while(s.length()>1){
         int h = Integer.parseInt(s.substring(1));
         if(!primes[h])
            return false;
            
         s = h+"";
      }
      //chop right
      String sb = j+"";
      while(sb.length()>1){
         int f =Integer.parseInt( sb.substring(0,sb.length()-1));
         if(!primes[f])
            return false;
            
         sb = f+"";
      }
   
      return true;
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