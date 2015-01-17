public class Problem46{
   public static void main(String[] args){
      int i = 33;
      while(true){
         System.out.println("i = " + i);
         
         if(!isPrime(i)){
            boolean possible = false;
            for(int j = 1; j< (int)Math.pow(i,0.5); j++){
               int rem = i - (int)(2*Math.pow(j,2));
               if(isPrime(rem)){
                  possible = true;
                  break;
               }
            }
            if(!possible){
               System.out.println(i);
            
               break;
            
            }
         
            
            
         }
             
         i+=2;
      }
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