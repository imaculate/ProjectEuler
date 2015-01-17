import java.util.*;
public class Problem47{

   public static void main(String[] args){
      boolean found = false;
      long ind = 15;
      
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

      while(!found){
         System.out.println("ind =  "+ind);
         if(primes[(int)ind]){
            ind++;
            continue;
         }
         else{
            if( getFactors(ind,primes).size() == 4 ){
               
               if(getFactors(ind+1,primes).size()==4 ){
                  
                  if(getFactors(ind+2, primes).size()==4 ){
                     
                     if(getFactors(ind+3, primes).size()==4 ){
                        System.out.println("found " + ind);
                        found = true;
                     }
                     else{
                        ind+=4;
                     }
                  }
                  else{
                     ind+=3;
                  }
               }
               else{
                  ind+= 2;
               }
                   
            }
            else{
               ind+=1;
            }
         }
                              
      }
   }
        
         
  
   
   
   public static TreeSet<Integer> getFactors(long n, boolean[] primes){
      TreeSet<Integer> some  = new TreeSet<Integer>();
      for(int i = 2; i< n; i++){
         if(n% i==0 && primes[i]){
            if(primes[(int)n/i]){
               some.add((int)n/i);
               
            }else{
               some.addAll(getFactors(n/i, primes));
               
         
            }
            break;      
         
           
         }   
      }
   
      
      return some;
      
   } 
   public static boolean isPrime(long number)
   {
      if(number < 2)
         return false;
      if (number == 2 || number == 3) {
         return true;
      }
      if (number % 2 == 0) {
         return false;
      }
      long sqrt = (int) Math.sqrt(number) + 1;
      for (long i = 3; i < sqrt; i += 2) {
         if (number % i == 0) {
            return false;
         }
            
      }
      return true;
   }
}