public class Problem35{
//find circular primes
   public static void main(String[] args){
      int sum = 13;
      for(long i = 101; i<1000000; i+=2){
         String s = i+"";
         if(s.contains("0")||s.contains("2")||s.contains("4")||s.contains("5")||s.contains("6")||s.contains("8")||!isPrime(i)){
            continue;
         }
         else{
            boolean circular = true;
            int no = s.length()-1;
            while(no>=0){ 
               s = rotate(s);
               if(!isPrime(Long.parseLong(s))){
                  circular = false;
                  break;
               }
               no--;
                         
            }
            if(circular)
               sum++;
           
         }
      }
      System.out.println(sum);
   
   }
   public static String rotate( String s){
      String sb = "";
      sb += s.substring(1);
      sb+= s.charAt(0);
      
      
      return sb;   }
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