import java.util.*;
import java.io.*;
import java.math.*;
public class NamesScore{
   public static void main (String[] args){
      ArrayList<String> names = new ArrayList<String>(Arrays.asList(readFile()));
      Collections.sort(names);
      BigInteger sum = new BigInteger("0");
      for(int i = 0; i< names.size(); i++){
         if(i == 937)System.out.println(names.get(i));
         BigInteger product = new BigInteger((i+1)+"");
         int v = getValue(names.get(i));
          product = product.multiply(new BigInteger(v+""));
          sum = sum.add(product);
      }
      System.out.println(sum);
      
      
   }
   
   public static int getValue(String s){
   int sum = 0;
      for(int i = 1; i< s.length()-1; i++){
        sum+= (s.charAt(i) - 64);  
      }
      //System.out.println(sum);
      return sum;
   }
   
   public static String[] readFile(){
      String[] names = null;
      BufferedReader br = null ;
      try {
         br = new BufferedReader(new FileReader("names.txt"));
      
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();
         System.out.println(line);
          names = line.split(",");
          System.out.println(names.length);
         
      }
      
      catch(Exception e){
         e.printStackTrace();
      }            
      return names;
   }
}