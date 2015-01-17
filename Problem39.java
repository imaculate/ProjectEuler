public class Problem39{
   public static void main(String[] args){
      int max = 0;
      int[] peri = new int[1001];      
      int i = 1;
      int p = 1;
      int a, b, c, temp, pe;
      while(p<=1000){
         System.out.println(i);
         a = (int)(2*Math.pow(i,2)+(i*2));
         b = 2*i + 1;
         temp = (int)(4*Math.pow(i,4) + 8*Math.pow(i,3)+ 8*Math.pow(i,2) + 4*i + 1);
         c =(int) Math.pow(temp ,0.5);
        
         p = a + b + c;
         System.out.println("a = " + a+" b = " + b+" c = " + c );

         pe = p; 
        
         while(pe<=1000){
            
            peri[pe] += 1;
            
            pe+= p  ;
            
         }
         
         a = (int)(4*Math.pow(i,2)+(i*8)+3);
         b = 4*i + 4;
         temp = (int)(16*Math.pow(i,4) +64*Math.pow(i,3)+ 104*Math.pow(i,2) + 80*i + 25);
         c = (int)Math.pow(temp ,0.5);
        
         p = a + b + c;
         System.out.println("a = " + a+" b = " + b+" c = " + c );


         pe = p; 
         
         while(pe<=1000){
            
            peri[pe] += 1;
           
            pe+= p ;
            
         }
      
         
         
         
      
         i++;
      }
      int maxp = 0;
      for(int h = 0; h< 1001; h++){
         if(peri[h] > max){
            maxp = h;
            max = peri[h];
            }
      }
      
      System.out.println(max+ " " + maxp);
     
   }
}