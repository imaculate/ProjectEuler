import java.util.*;
public class NumLetter{
   public static void main(String[] args){
      long sum = 0;
      Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{put(1,3);put(2,3);put(3,5);}};
      map.put(4,4);
      map.put(5,4);
      map.put(6,3);
      map.put(7,5);
      map.put(8,5);
      map.put(9,4);
      map.put(10,3);
      map.put(11,6);
      map.put(12,6);
      map.put(13,8);
      map.put(14,8);
      map.put(15,7);
      map.put(16,7);
      map.put(17,9);
      map.put(18,8);
      map.put(19,8);
      map.put(20,6);
      map.put(30,6);
      map.put(40,5);
      map.put(50,5);
      map.put(60,5);
      map.put(70,7);
      map.put(80,6);
      map.put(90,6);
      for(int i = 1; i<=1000; i++){
         String s = i+"";
         System.out.println(s.length());
         System.out.println(s);
         int add = 0;
         if(map.containsKey(new Integer(i))){
            sum += map.get(i);
         }else if(s.length() == 2 ){
            add += map.get(Integer.parseInt(s.charAt(0)+"")*10);
             add += map.get(Integer.parseInt(s.charAt(1)+""));
             map.put(i, add);
             sum+=add;
        }else if(s.length() ==3 ){
           
            add += map.get(Integer.parseInt(s.substring(0,1))) + 7; //hundred 
            if(s.substring(1).equals("00")){
             
             map.put(i, add);
             sum+=add;
            }else{
            
               add+=3;//and
               add += map.get(Integer.parseInt(s.substring(1)));
             map.put(i, add);
             sum+=add;
            }
            
            }
                    
    
      }
      sum+=11; //one thousand
      System.out.println(sum);
      
   }
}
