
//automated tests.

import java.util.*;
import java.io.*;
public class Operations{

   public static void main(String[] args){
   
     
      //file might not be found.
      try{
         File file = new File(args[0]);
         Scanner k = new Scanner(file);
      
         String line ;
         while(k.hasNextLine()){
            line = k.nextLine();
            //if line doesn't have : it is an unexpected format, the error is handled by printing it out
            if(line.contains(":")){
               String op = line.substring(0, line.indexOf(":"));
            
               if(op.equalsIgnoreCase("SUM")){
                  String nums = line.substring(line.indexOf(":")+1);
               
                  String[] numbers = nums.split(",");
               
                  int sum = 0;
                  //the numbers might not be separated by a comma, if that happens unexpected format to alert the user.
                  try{
                     for(int i = 0; i< numbers.length; i++){
                     
                        sum+= Integer.parseInt(numbers[i].trim());
                     }
                     System.out.println("SUM "+ sum);
                  }
                  catch(NumberFormatException e){
                     System.out.println("Unexpected format of numbers");
                     continue;
                  }
               }
               
               else if(op.equalsIgnoreCase("AVERAGE")){
                  String nums = line.substring(line.indexOf(":")+1);
                  String[] numbers = nums.split(",");
                  int sum = 0;
                  try{
                     for(int i = 0; i< numbers.length; i++){
                     
                        sum+= Integer.parseInt(numbers[i].trim());
                     }
                     //printing avearage assuming that the decimal part is required. 
                     System.out.println("AVERAGE "+(double)sum/numbers.length);
                  }
                  catch(NumberFormatException e){
                     System.out.println("Unexpected format of numbers");
                     continue;
                  }
               
               
               
               }
               
               else if(op.equalsIgnoreCase("MAX")){
                  String nums = line.substring(line.indexOf(":")+1);
                  try{

                  String[] numbers = nums.split(",");
                  int max = Integer.parseInt(numbers[0].trim());
                                       for(int i = 1; i< numbers.length; i++){
                     
                        int n = Integer.parseInt(numbers[i].trim());
                        max = (n>max)?n:max;
                     }
                     System.out.println("MAX "+max);
                  }
                  catch(NumberFormatException e){
                     System.out.println("Unexpected format of numbers");
                     continue;
                  }
               
               
               
               }
               
               else if(op.equalsIgnoreCase("MIN")){
                  String nums = line.substring(line.indexOf(":")+1);
                   try{

                  String[] numbers = nums.split(",");
                  
                  int min = Integer.parseInt(numbers[0].trim());
                                      for(int i = 1; i< numbers.length; i++){
                     
                        int n = Integer.parseInt(numbers[i].trim());
                        min = (n<min)?n:min;
                     }
                     System.out.println("MIN "+min);
                  }
                  catch(NumberFormatException e){
                     System.out.println("Unexpected format of numbers");
                     continue;
                  }
               
               
               
               }
               else{
               //when the operation is not among the four expected , this will be printed.
                  System.out.println("Operation not defined");
               }
            
            
            
            
            }
            else{
            //if line doesn't contain colon, this should be printed.
               System.out.println("Unexpected format");
            }
         
         
         }
      }
      catch(FileNotFoundException e){
      
         System.out.println("File Not Found");
      }
   
   }
}