public class Problem32{
   public static void main(String[] args){
      long sum  = 0;
      for(int i = 1001; i< 20000;i++){
         if(isPandigital(i)){
            sum+=i;
         }
      }
      System.out.println(sum);
      
   }
   
   public static boolean isPandigital(int n){
      for(int i= 2;i<(int)Math.pow(n,0.5);i++){
         if(n%i == 0){
            int plier = i;
            int cand = n/i;
            String s = ""+plier+""+cand+""+n;
         if(s.length() == countUniqueCharacters(s) && s.length()==9 && !s.contains("0"))
            return true;
            
         }
      }
      return false;
      
   }
   
   public static int countUniqueCharacters(String input) {
    boolean[] isItThere = new boolean[Character.MAX_VALUE];
    for (int i = 0; i < input.length(); i++) {
        isItThere[input.charAt(i)] = true;
    }

    int count = 0;
    for (int i = 0; i < isItThere.length; i++) {
        if (isItThere[i] == true){
            count++;
        }
    }

    return count;
}
}