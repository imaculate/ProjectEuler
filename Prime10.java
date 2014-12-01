public class Prime10{
   public static void main(String[] args){
      int ans = 8;
      int i = 20;
      
      while(ans<10001 ){
         i++;
         if(isPrime(i))ans++;
         
      }
      System.out.println(i);
   }
    public static boolean isPrime(long n)
    {
        if ( n % 2 == 0 ) //even numer so can't be prime
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