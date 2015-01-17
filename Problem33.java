public class Problem33{
   public static void main(String[] args){
      for(int num = 11; num<100; num++){
         if(num%10==0)
            continue;
         int[] pos = getPosDen(num);
         for(int i =0; i<pos.length;i++){
            if(Simplify(num, pos[i])){
               Num*=num;
               Den*=den;
            }
         }
                 
                 
      }
      Den = Simp(Num,Den, true); 
      System.out.println(Den);
   }
   
   
   public static Simp(int num, int den, boolean den){
      
   }
}