public class Problem31DP{
   public static void main(String[] args){
      int[] coins = new int[]{1,2,5,10,20, 50, 100, 200};
      int[] ways = new int[201];
      ways[0] = 1;
      
      for(int i=0; i< coins.length; i++){
         for(int j = coins[i]; j<= 200; j++){
            ways[j] += ways[j - coins[i]];
            
         }
      }
      System.out.println(ways[200]);
   }
}