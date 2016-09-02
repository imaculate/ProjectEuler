public class Problem58{
   public static void main(String[] args){
     long layer = 0;
     double total = 1;
     long primes = 0;
     double ratio = 1;
     long s1 = 3, s2 = 5, s3 = 7;
     long d1 =10, d2 = 12, d3 = 14;
     
     //System.out.println(isPrime(5));
    do{
       layer+=1;
       total+= 4;
       
       primes += (isPrime(s1))?1:0;
       primes += (isPrime(s2))?1:0;
       primes += (isPrime(s3))?1:0;
       
       ratio = primes/total;
       
       System.out.println(ratio*100+ " layer: "+ layer);
       
       s1+=d1;
       s2+=d2;
       s3+=d3;
       d1+=8;
       d2+=8;
       d3+=8;
         
     }while(ratio>0.1);
     long ans = layer*2 +1;
     System.out.println(ans);
      
   }
   
   public static boolean isPrime(long n)
   
   {
      if((n+"").charAt((n+"").length()-1)=='0'||((n+"").length()>1 && (n+"").charAt((n+"").length()-1)=='5')||(n+"").charAt((n+"").length()-1)=='2'||(n+"").charAt((n+"").length()-1)=='4' || (n+"").charAt((n+"").length()-1)=='6'||(n+"").charAt((n+"").length()-1)=='8')
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