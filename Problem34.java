public class Problem34
{
   public static void main(String[] args)
   {
      int ans = 0;
      int[] facs = new int[]{1,1,2,6, 24,120, 720, 5040, 40320,362880};
      for(int i=11; i< 10000000; i++){
         String s = i+"";
         int sum = 0;
         for(char c: s.toCharArray()){
            sum+= facs[Integer.parseInt(c+"")];
            if(sum>i)
               break;
         
         }
         if(sum==i)
            ans+=i;
            
      }
      System.out.println(ans);
   }
}