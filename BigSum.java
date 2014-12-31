import java.util.*;
import java.io.*;
import java.math.*;
public class BigSum{
   public static void main(String[] args){
      BigInteger sum = new BigInteger("0");
      BufferedReader br = null ;
      try {
         br = new BufferedReader(new FileReader("numbers.txt"));
      
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();
         
         while (line != null) {
         System.out.println(line);
            sum = sum.add(new BigInteger(line));
            line = br.readLine();

            
         }
      }
      
      catch(Exception e){
         e.printStackTrace();
      }            
      System.out.println(sum);
   }

}