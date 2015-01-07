public class Problem30{
   public static void main(String[]  args){
      long sum = 0;
      for(long i = 100;i<= 1000000;i++){
         if(sum(i) == i)
         
            sum+=i;
      }
      System.out.println(sum);
      }
      public static long sum(long n){
         String s = n+"";
         long sum = 0;
         for(int i = 0; i<s.length();i++){
            int digit = Integer.parseInt(s.charAt(i)+"");
            sum += Math.pow(digit,5);
            
         }
         return sum;
      }
       
   
} 