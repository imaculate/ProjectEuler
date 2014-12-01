public class FiboEven{
   
   
   public static void main(String[] args){
      int ans = 0;
      int i=1,b=1,temp =0;
      while(i<4000000){
         temp = i;
         i+=b;
         b=temp;
         if(i%2==0)ans+=i;
      }
      System.out.println(ans);
   }
}