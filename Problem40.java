public class Problem40{
   public static void main(String[] args){
      
      int i = 1;
      int index = 0;
      int product = 1;
      while(index<= 1000000){
         String s = i+"";
         
         int ind = 0;
         while(ind<s.length()){
         
            if((index + ind+1) ==1||(index + ind+1) ==10|| (index + ind+1)==100||(ind+index+1 )==1000||(ind+index +1)==10000||(ind+index+1) ==100000||(ind+index+1 )==1000000){
               System.out.println(s);

               product *= Integer.parseInt(s.charAt(ind)+"");
               break;
            }
            ind++;
         }
         index+= s.length();
                  i++;
         
      }
      
      
      
      System.out.println(product);
   }
   
}