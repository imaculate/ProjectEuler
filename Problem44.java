public class Problem44{
   public static void main(String[] args){
      
      int D = 0;
      int k = 1;
      outer:while(true){
         for(int j = k; j>0; j--){
            System.out.println("j = " +j + "k = " + k);
         
         
            if(check(j,k, true) && check(j,k, false)){
               int Pk = (int)(3*Math.pow(k,2) - k)/2;
               int Pj = (int)(3*Math.pow(j,2) - j)/2;
            
               D = Pk-Pj;
               System.out.println("j = " +j + "k = " + k);
               break outer;
            }
         }
         k++; 
      } 
            
             
      System.out.println(D);
   
   }
           
      
   
   
   public static boolean check(int j, int k , boolean sum){
      if(sum)
      {
         int temp = (int)(36*Math.pow(j,2) + 36*Math.pow(k,2) - 12*k - 12*j + 1);
         
         if(Math.pow(temp, 0.5) - (int)(Math.pow(temp, 0.5)) == 0){
            temp = (int)Math.pow(temp, 0.5);
            if((1+temp)%6==0)
               return true;
         }
              
           
      }
      else{
         int temp = (int)(36*Math.pow(k,2) - 36*Math.pow(j,2) - 12*k + 12*j +1);
         if(Math.pow(temp, 0.5) - (int)(Math.pow(temp, 0.5)) == 0)
            temp = (int)Math.pow(temp, 0.5);
         if((1+temp)%6==0)
            return true;
      
         
      }
      return false;
   }
}