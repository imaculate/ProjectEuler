import java.util.*;

public class PanMultiples{
   public static void main(String[] args){
      int max= 918273645;
      for(int i = 9100; i< 9999; i++){
         
         String s = i+"";
                     int prod = i*2;
            s += prod;
            
         
         
         if(!s.contains("0") && noreps(s)){
            int my  = Integer.parseInt(s);
            System.out.println(my);
            max = (my>max)? my:max;
               
         }
      }
      System.out.println(max);
      
   }
   
   public static boolean noreps(String s){
      //System.out.println(s);
      boolean[] arr = new boolean[9];
      for(int i = 0; i<s.length(); i++){
         int j = Integer.parseInt(s.charAt(i)+"");
         if(!arr[j-1])
            arr[j-1] = true;
         else
            return false;
            
      }
      
      return true;
   }
}