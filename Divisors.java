import java.util.*;
public class Divisors{

public static void main(String[] args){
   int i = 1;
   long n  = 1;
   while(getDivisors(n)<500){
         System.out.println(n);
         i++;
         n+=i;
      
   
   }
   System.out.println("finallt" + n);

}

public static int getDivisors(long n){

   int sum = 1;
   ArrayList<Integer> some = new ArrayList<Integer>();
   some.add(1);
   loop:for(int i = 2; i< n; i++){
      if(n% i==0 && !some.contains((int)n/i)){
         
         some.add(i);
         System.out.println(i);
         sum++;

           
          }else if (n% i==0){
            break loop;
                 }
   }
   int l = some.get(some.size()-1);
   System.out.println(l+ " l");
   System.out.println(sum+ " sum");
   if(l*l == n)
      return 2*sum -1;
   else
      return 2*sum;
   
   
   

}
}