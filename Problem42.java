import java.util.*;
import java.io.*;

public class Problem42{
   public static void main(String[] args){
   
      boolean[] triangle = new boolean[1001];
      int index = 1;
      int n  = 1 ;
      while(index<= 1000){
      
         triangle[index] = true;
         n++;
         index = n*(n+1)/2;
      }
      int num = 0;
      Scanner in = null;
      String[] words  =null;
      try{
         in = new Scanner(new File("words.txt"));
      }
      catch(FileNotFoundException e){
         e.printStackTrace();
      }
      if(in!=null){
         String s = in.nextLine();
          words = s.split(",");
         
      
      }
     
      for(int k = 0; k< words.length; k++){
         String st = words[k];
         int sum = 0;
         for(char c: st.toCharArray()){
            if(c ==  '"')
               continue;
            else
               sum+= c - 'A' +1;
         }
         System.out.println(st + " sum " + sum);
         if(triangle[sum])
            num++;
      }
      
      System.out.println(num);
   }
}