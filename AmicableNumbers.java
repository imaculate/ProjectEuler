import java.util.*;
public class AmicableNumbers{
   public static void main(String[] args){
      
      Set<Integer> pairs = new TreeSet<Integer>();
      for(int i = 2; i< 10000; i++){
         int number = getDivisors(i);
         if(number<10000 && number!=i&&  getDivisors(number) == i){
            pairs.add(number);
            pairs.add(i);
            
         }
      }
      
      int sum = 0;
      for(Integer h: pairs){
         System.out.println("pairs " + h);
         sum+= h;
      }
      
      
      
      
      System.out.println("FINAL "+sum);
   }
   
   public static int getDivisors(int n){
   System.out.println("n  = "+n);
      int sum = 1;
      Set<Integer> some = new TreeSet<Integer>();
      some.add(1);
      loop:for(int i = 2; i<= n; i++){
         if(n% i==0 && !some.contains((int)n/i)){
         System.out.println(i);
          System.out.println((int)n/i);
            some.add(i);
            
            
            some.add((int)n/i);
           
            
         
           
         }
         else if (n% i==0){
            break loop;
         }
      }
      int re = 0;
       for(Integer l: some){
         re += l;
       }  
       System.out.println(re);
      return re;
   }

}