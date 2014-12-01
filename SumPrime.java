public class SumPrime{
   public static void main(String[]args){
      long ans = 17;
      for(int i=8; i< 2000000; i++){
         if(isPrime(i))ans+=i;
      }
      System.out.println(ans);
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