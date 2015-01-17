import java.util.*;
import java.io.*;
public class HackerCup{
   public static void main(String[] args){
      Scanner in = null;
      try{
         in = new Scanner(new File("C-small-practice.in"));
      }
      catch(FileNotFoundException e){
         e.printStackTrace();
      }
      if(in!=null){
         int cases = in.nextInt();

      Scanner k = new Scanner(System.in);
      int N = Integer.parseInt(k.nextLine());
      ArrayList<Integer> a = new ArrayList<Integer>();
      for(int i =0; i< N; i++){
         int y = Integer.parseInt(k.nextLine());
         String min = swapMin(y);
         String max  = swapMax(y);
         System.out.println(min + " " + max);
        
       
      }
   }
   
   public static String swapMin(long y){
      String[] arr =  (y+"").split("");
      String min = arr[0]; int pos = 0;
      for(int i = 0; i<arr.length; i++){
         if(arr[i].compareTo(min)<0 && !arr[i].equals("0")){
            min = arr[i];
            pos = i;
         }
      }
      String temp = arr[0];
      arr[0] = arr[pos];
      arr[pos] = temp;
      
      String s = "";
      for(int i = 0; i<arr.length; i++){
         s+=arr[i];
      }
      
      return s;
     
   }
   public static String swapMax(long y){
      String[] arr =  (y+"").split("");
      String max = "0"; int pos = 0;
      for(int i = 0; i<arr.length; i++){
         if(arr[i].compareTo(max)>0 && !arr[i].equals("0")){
            max = arr[i];
            pos = i;
         }
      }
      String temp = arr[0];
      arr[0] = arr[pos];
      arr[pos] = temp;
      String s = "";
      for(int i = 0; i<arr.length; i++){
         s+=arr[i];
      }
   
      
      return s;
     
   }
   
    public static void output(String[] list) {
      BufferedWriter bw = null;
      try {
         bw = new BufferedWriter(new FileWriter(new File("Numbers-practise-output.in")));
         
      }
      catch(IOException e){
         e.printStackTrace();
      }
      if(bw!= null){
      
      
         System.out.println("Output flowing");
      // build a string for each case
         for (int i = 0; i < list.length; i++) {
            StringBuilder sb = new StringBuilder();
         
            sb.append("Case #" + (i + 1) + ": " + list[i]);
         
         
            try{
               bw.write(sb.toString());
               bw.newLine();
            }
            catch(IOException e){
               e.printStackTrace();
            }
         
         }
         try{
         
            bw.close();
         }
         catch(IOException e){
            e.printStackTrace();
         }
      
      
      
      }
   }


}