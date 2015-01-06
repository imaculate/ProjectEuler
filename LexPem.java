import java.util.*;
public class LexPem{

   public static void main(String[] args){
       ArrayList<String> list = new ArrayList<String>(){{add("0");add("1"); add("2");add("3"); add("4"); add("5");
       add("6"); add("7");add("8");add("9");}};
      long pos = 1000000;
      long index = 0;
      String ans = "";
      int start = 9;
      while(index<pos && start>0){
         int inner = 0;
         
         while(index + factorial(start) < pos ){
            inner++;
            index+=factorial(start);
              System.out.println("index is "+index);
                System.out.println(ans);
          }
          start--;
       
            System.out.println("start "+start);

            ans+=list.get(inner);
             list.remove(list.get(inner));
              
      }
      ans+=list.get(0);

      System.out.println(ans);
      
   }
   public static long factorial(int n){
   long ans = 1;
      for(int i = n; i> 1; i--)
         ans *= i;
     return ans;
   }
}