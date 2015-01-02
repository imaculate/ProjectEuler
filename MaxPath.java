import java.util.*;
import java.io.*;

public class MaxPath{
   public static void main(String[] args){
    int[][] tri = readFile();
    
      for(int i= 13; i>=0; i--){
        int[] nums = tri[i];
         for(int j=0;j<nums.length; j++){
            if(tri[i][j] == 0)
               continue;
            else{
            int max = (tri[i+1][j]> tri[i+1][j+1])? tri[i+1][j]:tri[i+1][j+1];
            tri[i][j] += max;
            }
         }
          
      }
      System.out.println(tri[0][0]);
   
   }
   
   public static int[][] readFile(){
      int[][] tri = new int[15][15];
     

      BufferedReader br = null ;
      try {
         br = new BufferedReader(new FileReader("triangle.txt"));
      
         StringBuilder sb = new StringBuilder();
         String line = br.readLine();
         int j = 0;
         while (line != null) {
         System.out.println(line);
           String[] temp = line.split(" ");
           for(int i = 0; i<15; i++){
            if(i<temp.length)
               tri[j][i] = Integer.parseInt(temp[i]);
             else
               tri[j][i] = 0;
           }
            line = br.readLine();
            j++;

            
         }
      }
      
      catch(Exception e){
         e.printStackTrace();
      } 
      return tri;           
      }
}