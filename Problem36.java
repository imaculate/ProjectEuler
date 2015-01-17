public class Problem36{

   public static void main(String[] args){
      long sum = 0;
      for(int i = 1; i< 1000000; i+=2){
         String s = i+"";
         if(s.equals(new StringBuilder(s).reverse().toString())){
            String sb = Integer.toBinaryString(i);
            if(sb.equals(new StringBuilder(sb).reverse().toString()))
               sum+=i;
            
            
         
         }
        
      }
      System.out.println(sum);
   }
}