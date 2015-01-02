import java.util.*;
public class Sundays{
   public static void main(String[] args){
      int sum = 0;
      Calendar calendar =  Calendar.getInstance();
      calendar.set(1901,Calendar.JANUARY, 6);
      while(calendar.get(Calendar.YEAR)<= 2000){
         if(calendar.get(Calendar.DAY_OF_MONTH)== 1){
            System.out.print(calendar.get(Calendar.DAY_OF_MONTH));
            System.out.print(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
            System.out.println(calendar.get(Calendar.YEAR));
         
         
            
            sum++;
         }
          
         calendar.add(Calendar.DAY_OF_YEAR ,7);
      
      }
      System.out.println(sum);
      
   }
}