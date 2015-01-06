import java.util.*;
import java.math.*;
public class NonAbouSums{
   static ArrayList<Integer> list = generateAbous(12, 28123);
      public static void main(String[] args){
      System.out.println(list.size());
      BigInteger sum = new BigInteger("0");
     boolean[] abouSum = new boolean[ 28124];

      for (int m = 0; m < list.size(); m++) {
         for (int j = m; j < list.size(); j++) {
            if (list.get(m) + list.get(j) <= 28123) {
               abouSum[list.get(m) + list.get(j)] = true;
            } 
            else {
               break;
            }
         }
      }
      for(int i = 0; i<= 28123; i++){  
         if(!abouSum[i] )     
            sum = sum.add(new BigInteger(i+""));
      }
      System.out.println(sum);
   }
   
         
  
   
   public static ArrayList<Integer> generateAbous(int start, int end){
      ArrayList<Integer> list  = new ArrayList<Integer>();
      for(int i = start; i<= end; i++){
         if(getDivisors(i)> i)
            list.add(i);
      }
      return list;
   }
   
   public static int getDivisors(int n){
     
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
