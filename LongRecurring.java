import java.math.*;
import java.util.*;
public class LongRecurring{
   public static void main(String[] args){
      int max = 1;
      int axd = 0;
      for(int d = 2; d< 1000http://movpod.in/m7ye7x8w03dh; d++){
         String rec  = getRecuring(d);
         
         if(rec.length()>max){
            max = rec.length();
            axd = d;
            
         }
       }
       System.out.println(axd);
        System.out.println(max );
      
   }
   
   public static String getRecuring(int d){
      ArrayList<Integer> list  = new ArrayList<Integer>();
      int num = 1;
      int index  = 0;
      String s = "";
      
      for(int i  = 0; i< d; i++){
         
            
          int rem = num% d;
          if(rem==0)
            return "";
          else if(list.contains(rem)){
          s+= num/d +"";
            index = s.indexOf(rem*10/d + "");
               break;
          }else{
            s+= num/d +"";
            list.add(rem);
            num = rem*10;
         }
         
         
      }
            System.out.println(s);
            s = s.substring(index);
            System.out.println(s);
      return s;
      
   }

}