public class Problem52{

   public static void main(String[] args){   
      long i = 1;
      while(true){
         if(equalsDigit(i, i*2) && equalsDigit(i, i*3)&& equalsDigit(i, i*4)&& equalsDigit(i, i*5)&&equalsDigit(i, i*6)){
            System.out.println(i);
            break;
         }
         i++;
         
      }
   
   
      
      
   }
   public static boolean equalsDigit(long one, long two){
      String num1 = one+ "";
      String num2 = two+"";
      if(num1.length()!= num2.length())
         return false;
         
     for(char c: num1.toCharArray()){
       if(count(num1, c)!=count(num2, c) ){
         return false;
       }
         
     }
     
     return true;
         
   }
   
   public static int count(String s, char c){
      int count = 0;
      for(char d: s.toCharArray()){
         if(d == c)
            count++;
      }
      return count;
   }
}
