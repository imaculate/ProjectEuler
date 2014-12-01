public class Pali{
   public static void main(String[] args){
            int i=999, p=0;
      int ans = 0;
      while(i>0){
       int j=999;
      while(j>0){
         p=i*j;
         if(isPali(p)){
            
            System.out.println(p+" "+i+" "+j);
            if(p>ans)ans=p;
            break;
         }
         j--;
         }i--;
      }
      System.out.println(ans);
      
   }
   
   public static boolean isPali(int n){
      String s = n+"";
      int i =0, j = s.length()-1;
      while(j>i){
         if(s.charAt(i)!=s.charAt(j)){
            return false;
         }
         i++; j--;
      }
      return true;
   }

}
