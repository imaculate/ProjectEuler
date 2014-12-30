public class SumOfPrimes{
   public static void main(String[] args){
   long sum = 17;
   long t1 = System.currentTimeMillis();
      for(long i = 11; i< 2000000; i++){
         if(isPrime(i)){
             System.out.println(i);
            sum+= i;
            }
      }
      long t = (System.currentTimeMillis() - t1)/1000;
      System.out.println(sum+ " " + t +" seconds");
   
   }
   
   public static boolean isPrime(long number)
    {
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